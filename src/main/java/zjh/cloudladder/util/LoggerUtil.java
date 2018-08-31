package zjh.cloudladder.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {
	
	private Logger logger=null;
	
	public LoggerUtil(Class<?> clazz){
		logger=LoggerFactory.getLogger(clazz);
	}
	
	public static LoggerUtil getLogger(Class<?> clazz){
		return new LoggerUtil(clazz);
	}
	
	public LoggerUtil(String className){
		logger=LoggerFactory.getLogger(className);
	}
	
	public  void info(String msg) {
		if (logger.isInfoEnabled()){
			logger.info(msg);
		}
	}

	public  void warn(String msg) {
		if (logger.isWarnEnabled()){
			logger.warn(msg);
		}
	}

	public  void warn(String msg, Throwable t) {
		if (logger.isWarnEnabled()){
			logger.warn(msg, t);
		}
	}

	public  void debug(String msg) {
		if (logger.isDebugEnabled()){
			logger.debug(msg);
		}
	}
	

	public  void error(String arg0) {
		if (logger.isErrorEnabled()){
			logger.error(arg0);
		}
	}

	public  void error(String arg0, Throwable t) {
		if (logger.isErrorEnabled()){
			logger.error(arg0, t);
		}
	}
}
