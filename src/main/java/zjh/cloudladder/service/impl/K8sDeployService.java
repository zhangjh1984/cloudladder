package zjh.cloudladder.service.impl;

import org.springframework.stereotype.Service;

import zjh.cloudladder.bean.devops.DeployParam;
import zjh.cloudladder.service.ResourceDeployService;

@Service("k8sDeployService")
public class K8sDeployService implements ResourceDeployService{
	
	public void deployService(DeployParam deployParam){
		
	}

	@Override
	public void deployResource(DeployParam deployParam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroyResource(String resId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateResource(DeployParam deployParam) {
		// TODO Auto-generated method stub
		
	}
}
