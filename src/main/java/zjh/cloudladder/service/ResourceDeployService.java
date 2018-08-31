package zjh.cloudladder.service;

import zjh.cloudladder.bean.devops.DeployParam;

public interface ResourceDeployService {
	public void deployResource(DeployParam deployParam);
	public void destroyResource(String resId);
	public void updateResource(DeployParam deployParam);
}
