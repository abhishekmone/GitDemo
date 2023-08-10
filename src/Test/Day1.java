package Test;



import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 
{   
	@Parameters({"URL"})
	@Test
    public void demo(String url)
    {
    	System.out.println("demo");
    	System.out.println(url);
    }
	
	@Test
    public void demo1()
    { 
    	System.out.println("demo1");
    }
}
