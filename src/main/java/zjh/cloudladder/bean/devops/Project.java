package zjh.cloudladder.bean.devops;

import java.util.List;

import zjh.cloudladder.bean.BaseBean;

public class Project extends BaseBean{
	private String name;
	private String desc;
	private List<String> members;
	private String url;
	
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
	public List<String> getMembers() {
		return members;
	}
	public void setMembers(List<String> members) {
		this.members = members;
	}	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
