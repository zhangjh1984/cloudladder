package zjh.cloudladder.util;

import org.springframework.core.env.Environment;

public class SpringEnvUtil {

	public static String getConfig(String key){
		Environment env=SpringBeanUtil.getApplicationContext().getEnvironment();
		return env.getProperty(key);
	}
}
