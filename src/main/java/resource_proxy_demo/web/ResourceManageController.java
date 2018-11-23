package resource_proxy_demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/resource/proxy/manage")
public class ResourceManageController {

	
	@RequestMapping(value="/refresh")
	public void addInstance() {
		
	}
	
	//TODO:添加资源发现策略的参数
	@RequestMapping(value="/search")
	public void search(){
		
		
	}
	
	@RequestMapping("/group/create")
	public void createResourceGroup() {
		
	}
	
	@RequestMapping("/group/del")
	public void delResourceGroup() {
		
	}
	
	@RequestMapping("/group/update")
	public void updateResourceGroup() {
		
	}
	
	@RequestMapping("/group/search")
	public void searchResourceGroup() {
		
	}
}
