package opencart.framework.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Property_File {

	
	//This class will have all the methods to deal with Property file data

	
	
	public static Properties readData(String filename) {
		// Initializing property class for reading Properties
		Properties prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(".\\Config_Property_File\\"+filename);
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
