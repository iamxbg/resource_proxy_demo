package resource_proxy_demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import resource_proxy_demo.service.ResourceInstanceGroupApi;

@RestController
@RequestMapping(value="/resoruce/proxy/view")
public class ResourceViewController {

	@Autowired
	private ResourceInstanceGroupApi groupApi;
	//@Autowired
	//private 
	
	@RequestMapping("/group/search")
	public void getResourceGroupView(int groupId) {
		

		
		groupApi.loadResourceGroupFromRoot(group)
	}
}
