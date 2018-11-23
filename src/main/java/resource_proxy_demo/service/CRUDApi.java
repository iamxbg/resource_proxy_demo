package resource_proxy_demo.service;

import java.util.List;

public interface CRUDApi <T>{

	public void add(T t);
	
	public void del(T t);
	
	public void update(T t);
	
	public List<T> find(T t);
	
	public T findById(int id);
}
