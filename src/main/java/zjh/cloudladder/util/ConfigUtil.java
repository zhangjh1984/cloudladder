package zjh.cloudladder.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {
	
	//public static Map<String,HashMap> cache=new HashMap<String,HashMap>();
	
	public ConfigUtil(){
		
	}
	
	public static String getVal(String key,String file) throws IOException{
		//优先读取环境变量
		String val=System.getenv(key);
		if(val==null || val.equals("")){
			val=getValFromFile(key, file);
		}
		return val;
	}
	
	public static String getValFromFile(String key,String file) throws IOException{
		Properties prop=new Properties();		
		try(InputStream is=ConfigUtil.class.getClassLoader().getResourceAsStream(file)){
			prop.load(is);
		}
		return prop.getProperty(key);		
	}
}
