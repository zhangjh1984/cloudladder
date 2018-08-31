package zjh.cloudladder.dao;

import zjh.cloudladder.bean.auth.Tenant;

public interface TenantDao {
	
	public void add(Tenant t) ;

	
	public void delById(String id);

	
	public void update(Tenant t) ;

	
	public Tenant findById(String id);

}
