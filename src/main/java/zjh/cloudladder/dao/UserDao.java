package zjh.cloudladder.dao;

import zjh.cloudladder.bean.auth.User;

public interface UserDao {
	public void login();	
	
	public void add(User t);
	
	public void delById(String id);

	public void update(User t) ;
	
	public User findById(String id);
	
}
