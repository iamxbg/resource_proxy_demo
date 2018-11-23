package resource_proxy_demo.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import resource_proxy_demo.dao.impl.RmResourceNodeTDaoImpl;
import resource_proxy_demo.entity.Node;
import resource_proxy_demo.model.RmResourceNodeT;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring/applicationContext.xml"})
public class RmResourceNodeTDaoImplTest {

	@Autowired
	private RmResourceNodeTDaoImpl nodeDao;
	
	@Ignore("passed")
	@Test
	public void testAdd() {
		RmResourceNodeT node=new RmResourceNodeT();
			node.setName("4");
			node.setParentId(2);
			nodeDao.add(node);
			
	}
	
}
