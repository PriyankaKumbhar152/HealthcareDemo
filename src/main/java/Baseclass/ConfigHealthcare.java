package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigHealthcare {

	public static String getBrowserName() {
		   
		String base = System.getProperty("user.dir");
		String filepath=base+"/src/main/resources/Applicationhealthcare.properties";
		FileInputStream fis=null;
		
		try {
		fis=new FileInputStream(filepath);	                                                        
		} catch (FileNotFoundException e) {
        e.printStackTrace();
		}
		
		Properties prop = new Properties();
		String value =null;
		try {
			prop.load(fis);
			value=prop.getProperty("browser_name");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static String getAppUrl(String env) {
		   
		String base = System.getProperty("user.dir");
		String filepath=base+"/src/main/resources/Applicationhealthcare.properties";
		FileInputStream fis=null;
		
		try {
			fis =new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
        e.printStackTrace();
		}
		
		Properties prop = new Properties();
		String value =null;
		try {
			prop.load(fis);
			value=prop.getProperty("app."+env+".url");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}
	

}



