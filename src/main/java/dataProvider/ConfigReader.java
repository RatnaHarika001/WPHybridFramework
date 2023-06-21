package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String configreader(String key) {
		

		 Properties po = new Properties();
		 try {
			po.load(new FileInputStream(new File(System.getProperty("user.dir") + "/config/Configfile.properties")));
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		
		}
		 String value = po.getProperty(key);
		return value;
	}
	
	public static String configreader(String key, String configname)
	{
		 Properties po = new Properties();
		 try {
			po.load(new FileInputStream(new File(System.getProperty("user.dir") + "/config/" + configname +".properties")));
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		
		}
		 String value = po.getProperty(key);
		return value;
		
	}
}
