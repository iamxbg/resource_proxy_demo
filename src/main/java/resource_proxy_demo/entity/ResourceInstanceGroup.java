package resource_proxy_demo.entity;

public class ResourceInstanceGroup {
	
	private int id;
	private String name;
	
	private ResourceGroupType type;
	
	private Node<ResourceInstance> root;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Node<ResourceInstance> getRoot() {
		return root;
	}

	public void setRoot(Node<ResourceInstance> root) {
		this.root = root;
	}
	
	
	
}
