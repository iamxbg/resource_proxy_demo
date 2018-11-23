package resource_proxy_demo.entity;

public enum ResourceGroupType {
	
	GEOGRAPHY("地理",1),ORGANIZATION("组织",2),BUSSINESS("业务",3);
	
	private String name;
	private int index;
	
	private ResourceGroupType(String name,int index) {
		this.name=name;
		this.index=index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public static ResourceGroupType getByIndex(int index) {
		switch(index) {
		case 1:
			return GEOGRAPHY;
		case 2:
			return ORGANIZATION;
		case 3:
			return BUSSINESS;
		default:
				return null;
				
		}
	}
	
}
