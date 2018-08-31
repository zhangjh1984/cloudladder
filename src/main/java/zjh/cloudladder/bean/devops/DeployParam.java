package zjh.cloudladder.bean.devops;

import java.util.Map;

public class DeployParam {
	private String serviceName;
	private String serviceCode;
	private String serviceVersion;
	private String serviceModel;	
	private String envId;
	//值参见DeployType类型
	private String deployType;
	
	public String getDeployType() {
		return deployType;
	}
	public void setDeployType(String deployType) {
		this.deployType = deployType;
	}
	private Map<String,ResourceFlavor> flavors;
	private Map<String,Object> spec;
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceVersion() {
		return serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}
	public String getServiceModel() {
		return serviceModel;
	}
	public void setServiceModel(String serviceModel) {
		this.serviceModel = serviceModel;
	}
	public String getEnvId() {
		return envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}
	public Map<String, ResourceFlavor> getFlavors() {
		return flavors;
	}
	public void setFlavors(Map<String, ResourceFlavor> flavors) {
		this.flavors = flavors;
	}
	public Map<String, Object> getSpec() {
		return spec;
	}
	public void setSpec(Map<String, Object> spec) {
		this.spec = spec;
	}
	
}
