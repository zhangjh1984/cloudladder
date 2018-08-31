package zjh.cloudladder.service;


public interface BeanBaseService<T> {
	public void add(T t);
	public void delById(String id);	
	public void update(T t);	
	public T findById(String id);
}
