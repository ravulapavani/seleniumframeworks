package nov23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
public class Demo2 {
WebDriver driver;
@BeforeMethod
public void setup()
{
driver=new ChromeDriver();
driver.get("http://newtours.demoaut.com/");
driver.manage().window().maximize();
Reporter.log("Launch url in chrome browser",true);
}
@Test(description="Verify Register link",priority=0,enabled=true,invocationCount=2)
public void registerLink()throws Throwable
{
driver.findElement(By.linkText("REGISTER")).click();
Thread.sleep(4000);
Reporter.log("Executing register link test",true);
}
@Test(description="Verify Hotel link",priority=2,enabled=true)
public void hotelsLink()throws Throwable
{
driver.findElement(By.linkText("Hotels")).click();
Thread.sleep(4000);
Reporter.log("Executing hotelsLink test",true);
}
@Test(description="Verify Support link",priority=1,enabled=true)
public void supportLink()throws Throwable
{
driver.findElement(By.linkText("SUPPORT")).click();
Thread.sleep(4000);
Reporter.log("Executing supportLink test",true);
}
@AfterMethod
public void tearDown()throws Throwable
{
	Thread.sleep(3000);
	driver.close();
	Reporter.log("Closing chrome browser",true);
}
}
















