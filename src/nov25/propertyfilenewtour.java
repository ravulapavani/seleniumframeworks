package nov25;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class propertyfilenewtour {
	

	
		WebDriver driver;
		Properties p;
		FileInputStream fi;
		@BeforeTest
		public void setup() throws Throwable
		{
			p=new Properties();
			fi=new FileInputStream("OR.propertiesnewtour");
			p.load(fi);
			driver=new ChromeDriver();
			driver.get(p.getProperty("Url"));
			driver.manage().window().maximize();
			
		}
		@Test
		public void verifylogin()
		{
			driver.findElement(By.xpath(p.getProperty("objuser"))).sendKeys("Admin");
			driver.findElement(By.xpath(p.getProperty("objpass"))).sendKeys("Admin");
			driver.findElement(By.xpath(p.getProperty("objsignin"))).click();
		}
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		
}

