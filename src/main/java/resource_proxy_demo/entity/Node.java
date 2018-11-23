package resource_proxy_demo.entity;

import java.util.List;

public class Node<T>{
	
	private int id;
	private T data;
	
	private String name;
	
	private List<Node> children;
	private Node parent;
	
	
	
	public Node() {
		super();
	}

	public Node(T data) {
		super();
		this.data = data;
	}

	public Node(int id) {
		super();
		this.id = id;
	}

	public void putChild(Node n) {
		children.add(n);
	}
	
	public void removeChild(Node n) {
		if(children!=null && children.size()>0) {
			for(Node c:children) {
				if(c.getId()==n.getId()) {
					children.remove(c);
					break;
				} 
				
			}
		}
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public List<Node> getChildren() {
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	public Node<T> getParent() {
		return parent;
	}


	public void setParent(Node parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
