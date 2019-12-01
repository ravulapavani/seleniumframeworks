package nov23;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo1 {
  @Test
  public void login() {
	  Reporter.log("Execute login test",true);
	   }
  @Test
  public void compose() {
	  Reporter.log("Execute compose test",true);
	   }
  @Test
  public void reply() {
	  Reporter.log("Execute reply test",true);
	   }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Running beforemethod",true);  
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("Running aftermethod",true);  
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Running beforeclass",true);  
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("Running afterclass",true);  
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Running beforetest",true);  
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("Running aftertest",true);  
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Running beforesuite",true);  
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("Running aftersuite",true);  
  }

}
