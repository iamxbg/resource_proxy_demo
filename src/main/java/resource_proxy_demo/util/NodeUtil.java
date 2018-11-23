package resource_proxy_demo.util;

import resource_proxy_demo.entity.Node;
import resource_proxy_demo.entity.ResourceInstanceNode;
import resource_proxy_demo.model.RmResourceNodeT;

public class NodeUtil {
	
	/**
	 * 转化model为javaBean
	 * @param rmNode
	 * @return
	 */
	public static Node parseRmResourceNodeT(RmResourceNodeT rmNode) {
		
		Node node=new Node();
			 node.setId(rmNode.getId());
			 node.setParent(new Node<>(rmNode.getParentId()));
		
		return node;
	}
	
	
	/**
	 * 转换javaBean为model
	 * @param node
	 * @return
	 */
	public static RmResourceNodeT toModel(Node node) {
		//TODO: 这里的强制转换是否有保障?
		ResourceInstanceNode rNode=(ResourceInstanceNode)node;
		RmResourceNodeT rmNode=new RmResourceNodeT();
			rmNode.setId(node.getId());
			rmNode.setParentId(node.getParent()==null?null:node.getParent().getId());
			rmNode.setName(node.getName());
			//rmNode.setGroupTypeId(rNode.getType().getIndex());
			
		return rmNode;
	}
}
