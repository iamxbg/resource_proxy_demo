package resource_proxy_demo.dao;

import java.util.List;

public interface CRUDDao<T> {
	
	public T selectById(int id);
	
	public void delById(int id);
	
	public void update(T t);
	
	public void add(T t);
}
