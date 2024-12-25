package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	public static  WebDriver driver;
	public static Properties prop= new Properties();
	public static FileReader fr;
	
	@BeforeTest
	public void setup() throws IOException {
		if(driver==null) {
			
			FileReader fr=new FileReader("C:\\Users\\Admin\\Fresh-learning\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(prop.getProperty("testur"));
			
		}else if (prop.getProperty("browser").equalsIgnoreCase("firefox")){
			WebDriverManager.chromedriver().setup();
			driver= new FirefoxDriver();
			driver.get(prop.getProperty("testur"));
			
		}
	}
	@AfterTest
	public void teardown() {
		
	//	driver.close();
		System.out.println("Teardown sucessfully");
		
		
		
		
		
	}
	
	
	
	

}
