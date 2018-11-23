package resource_proxy_demo.service;

import resource_proxy_demo.entity.Node;
import resource_proxy_demo.entity.ResourceInstanceGroup;

/**
 * 资源实例组API
 * @author m
 *
 */
public interface ResourceInstanceGroupApi extends CRUDApi<ResourceInstanceGroup>{
	
	/**
	 * 从根节点加载整棵树
	 * @param rootNode
	 */
	public ResourceInstanceGroup loadResourceGroup(int  groupId);
	
	
	public void appendChildToNode(Node child,Node parent);
	
	public void removeSubTree(Node node);
	
	public void updateNode(Node node);
	
	public void getNodeDetailInfo(Node node);
}
