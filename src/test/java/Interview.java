import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Interview {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/common");
		Properties pro = new Properties();
		pro.load(fis);
		
		String Username = pro.getProperty("username");
		String Password = pro.getProperty("password");
		
		System.out.println(Username+ " " +Password);
		
	}

}
