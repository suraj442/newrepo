package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Flib {
	
	
	// generic reusable method to read the property file
	public String readPropFile(String path,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
		
	}

}
