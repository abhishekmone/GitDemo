package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 
{
   @Test(dataProvider = "getdata")
   public void plan(String username, String passowrd)
   {
	   
	   System.out.println(username);
	   System.out.println(passowrd); 
   }
   
   @DataProvider
   public Object[][] getdata()
   {
	   
	   Object[][] data = new Object[3][2];
	   data[0][0] = "Firstusername";
	   data[0][1] =  "Firstpassword"; 
		
	   data[1][0] = "secondusername";
	   data[1][1] =  "secondpassword"; 
	   
	   data[2][0] = "thirdusername";
	   data[2][1] =  "thirdpassword"; 
	   return data;
			   
   }
   
   
}
