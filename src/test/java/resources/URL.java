package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class URL {
	private String url = null;
	private Properties prop;
	private FileInputStream fis;
	private String path;

	// CONSTRUCTOR
	URL(String brandName) {
		try {
			prop = new Properties();
			path = System.getProperty("user.dir")+"//Info//"+brandName+"//url.properties";
			fis = new FileInputStream(path);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// GETTER OF URL
	public String getURL(String environment) {
		url = prop.getProperty(environment);
		return url;
	}

}
