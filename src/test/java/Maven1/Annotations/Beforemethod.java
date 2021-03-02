package Maven1.Annotations;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforemethod 
{
 @BeforeMethod()
 public void test1()
 {
	 System.out.println("Beforemethod is executed");
 }
 @Test
 public void launchbrowser()
 {
	 System.out.println("Launch browser is executed");
 }

 @Test
 public void gmail1()
 {
	 System.out.println("Launch browser2 is executed");
 }
 @AfterMethod()
 public void test2()
 {
	 System.out.println("Aftermethod is executed");
 }

}
