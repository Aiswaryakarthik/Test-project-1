package Maven1.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforeclass {
	@BeforeClass()
	 public void test1()
	 {
		 System.out.println("Beforeclass is executed");
	 }
	 @Test(priority=1)
	 public void launchbrowser()
	 {
		 System.out.println("Launch browser3 is executed");
	 }

	 @Test(priority=2)
	 public void gmail2()
	 {
		 System.out.println("Launch browser4 is executed");
	 }
	 @AfterClass()
	 public void test2()
	 {
		 System.out.println("After class is executed");
	 }
}
