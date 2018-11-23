package resource_proxy_demo.entity;

public class ResourceInstanceNode extends Node<ResourceInstance> {
	
	//节点名称
	private String name;
	//节点类型
	private ResourceGroupType type;
	
	
	
	/**
	 * 创建node时带上资源实例
	 * @param ri
	 * @param name
	 * @param type
	 */
	public ResourceInstanceNode(ResourceInstance ri,String name, ResourceGroupType type) {
		super(ri);
		this.name = name;
		this.type = type;
	}
	
	/**
	 * 创建不含资源实例的node
	 * @param name
	 * @param type
	 */
	public ResourceInstanceNode(String name, ResourceGroupType type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ResourceGroupType getType() {
		return type;
	}
	public void setType(ResourceGroupType type) {
		this.type = type;
	}
	
	
}
