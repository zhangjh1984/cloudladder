package zjh.cloudladder.bean.auth;

import zjh.cloudladder.bean.BaseBean;

public class Tenant extends BaseBean{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private String desc;	
}
