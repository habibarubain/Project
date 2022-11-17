package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	public static String PropertyReader(String KeyValue) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/PropertyFile.properties");
		Properties property=new Properties();
		property.load(fis);
		String Value = property.getProperty(KeyValue);
		return Value;
	}
}
