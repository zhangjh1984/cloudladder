package zjh.cloudladder.bean.auth;

import zjh.cloudladder.bean.BaseBean;

public class TenantUserR extends BaseBean{
	private String tenantId;
	private String userId;
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
