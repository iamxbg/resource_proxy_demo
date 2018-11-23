package resource_proxy_demo.service;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import resource_proxy_demo.entity.Node;
import resource_proxy_demo.entity.ResourceInstanceGroup;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring/applicationContext.xml"})
public class ResourceInstanceGroupTest {

	@Autowired
	private ResourceInstanceGroupApi groupService;

	@Ignore("passed")
	@Test
	public void testLoadTree() throws JsonGenerationException, JsonMappingException, IOException {
		
		ResourceInstanceGroup grp=new ResourceInstanceGroup();
			//grp.setRoot(new Node<>(1));
		
		grp=groupService.loadResourceGroup(1);
		
		ObjectMapper mapper=new ObjectMapper();
			mapper.writeValue(System.out, grp);
	}
	
	@Ignore("passed")
	@Test
	public void testRemoveSubTree() {
		Node node =new Node<>(2);
		groupService.removeSubTree(node); 
		
	}
}
