import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class chethan {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream("./data/intervurw1");
		Properties pro = new Properties();
		pro.load(fis);
		String name = pro.getProperty("name");
		System.out.println(name);

	}

}
