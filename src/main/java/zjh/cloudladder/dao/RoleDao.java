package zjh.cloudladder.dao;

import zjh.cloudladder.bean.auth.Role;

public interface RoleDao {
	
	public void add(Role t);
	
	public void delById(String id) ;
	
	public void update(Role t);
	
	public Role findById(String id) ;
}
