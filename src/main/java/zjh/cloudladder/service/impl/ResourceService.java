package zjh.cloudladder.service.impl;

import java.io.IOException;

import org.springframework.util.StringUtils;

import zjh.cloudladder.bean.ServiceException;
import zjh.cloudladder.bean.devops.DeployParam;
import zjh.cloudladder.service.ResourceDeployService;
import zjh.cloudladder.util.ConfigUtil;
import zjh.cloudladder.util.LoggerUtil;
import zjh.cloudladder.util.SpringBeanUtil;

/**
 * 代码部署服务
 * @author Administrator
 *
 */
public class ResourceService {
	private static LoggerUtil logger=LoggerUtil.getLogger(ResourceService.class);

	public void deploy(DeployParam deployParam){
		
		String name=deployParam.getServiceName();
		//TODO 判断名称是否重复
		String envId=deployParam.getEnvId();
		//TODO 获取环境的相关信息
		String deployType=deployParam.getDeployType();
		ResourceDeployService deployService=null;
		String deployClass=null;
		try {
			deployClass=ConfigUtil.getVal(deployType, "config/deployclass.properties");			
		} catch (IOException e) {			
			logger.error("加载配额文件出错",e);
			ServiceException.panic("加载配额文件出错");
		}
		if(StringUtils.isEmpty(deployClass)){
			ServiceException.panic("不支持要部署的类型");
		}else{
			deployService=(ResourceDeployService) SpringBeanUtil.getBean(deployClass);
		}
		if(deployService!=null){
			deployService.deployResource(deployParam);
		}else{
			ServiceException.panic("不支持要部署的类型");
		}
		
	}
}
