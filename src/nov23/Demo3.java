package nov23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
public class Demo3 {
WebDriver driver;
@BeforeTest
public void setUp()
{
driver=new ChromeDriver();
driver.get("http://newtours.demoaut.com/");
driver.manage().window().maximize();
Reporter.log("Launch url in chrome browser",true);	
}
@Test(priority=0)
public void signOnLink()throws Throwable
{
driver.findElement(By.partialLinkText("SIG")).click();
Thread.sleep(3000);
Reporter.log("Executing SignOnlink Test",true);
}
@Test(priority=1)
public void homeLink()throws Throwable
{
driver.findElement(By.partialLinkText("Hom")).click();
Thread.sleep(3000);
Reporter.log("Executing homeLink Test",true);
}
@Test
public void registerLink()throws Throwable
{
driver.findElement(By.partialLinkText("REG")).click();
Thread.sleep(3000);
Reporter.log("Executing registerLink Test",true);
}
@AfterTest
public void tearDown()throws Throwable
{
	Thread.sleep(3000);
	driver.close();
	Reporter.log("Closing chrome browser",true);	
}
}


















