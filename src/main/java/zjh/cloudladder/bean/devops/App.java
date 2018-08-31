package zjh.cloudladder.bean.devops;

import java.util.List;

import zjh.cloudladder.bean.BaseBean;

public class App extends BaseBean{	
	private String projectId;	
	private String name;
	private String desc;
	private String type;
	private String lanauge;
	private List<String> members;	
	

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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getLanauge() {
		return lanauge;
	}
	public void setLanauge(String lanauge) {
		this.lanauge = lanauge;
	}
	public List<String> getMembers() {
		return members;
	}
	public void setMembers(List<String> members) {
		this.members = members;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
}
