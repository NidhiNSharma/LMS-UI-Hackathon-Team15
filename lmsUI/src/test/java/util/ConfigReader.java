package util;
<<<<<<< HEAD
=======

>>>>>>> 48e05ed77041b935f4021b8a9dff4995e40a9431
import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
<<<<<<< HEAD
	
	private static Properties pro=null; 
=======

private static Properties pro=null; 
>>>>>>> 48e05ed77041b935f4021b8a9dff4995e40a9431
	
	private static void readConfigFile(){

	try {
		
		pro = new Properties();
		FileReader fr = new FileReader("src/test/resources/Config/config.properties");
		pro.load(fr);
		
	   } catch (Exception e) {
		      System.out.println(e.getMessage());
        }
    }
	
	public static Properties getPropObject() {
		
		if( pro == null ) {
			readConfigFile();
		}
		return pro;
	}

	
}
