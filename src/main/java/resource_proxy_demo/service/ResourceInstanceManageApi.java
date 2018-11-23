package resource_proxy_demo.service;

import java.util.List;

import resource_proxy_demo.entity.ResourceInstance;

/**
 * 资源维护API
 * @author m
 *
 */
public interface ResourceInstanceManageApi {
	
	/**
	 * 发现新的资源实例
	 * @return
	 */
	public List<ResourceInstance> searchNew();
	
	
	public List<ResourceInstance> searchAll();
	
	/**
	 * 从资源列表中删除资源
	 * @param instanceId
	 */
	public void delById(int instanceId);
	
	
}
