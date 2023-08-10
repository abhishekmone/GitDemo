package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 
{

  @Parameters({"URL"})
  @Test
  public void WebLoginCarloan(String urlname)
  {
	  System.out.println("WebloginCarloan");
	  System.out.println(urlname);
  }
  @Test()
  public void MobileLoginCarloan()
  {
	  System.out.println("MobilelognCarloan");
  }
  @Test
  public void MobileLoginCarloan2()
  {
	  System.out.println("MobilelognCarloan2");         
  }
  @Test
  public void MobileLoginCarloan3()
  {
	  System.out.println("MobilelognCarloan3");         
  }
}
