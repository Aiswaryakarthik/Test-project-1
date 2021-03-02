package Maven1.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Beforetest {
	@BeforeTest()
	 public void test1()
	 {
		 System.out.println("Beforetest is executed");
	 }
	 @Test
	 public void launchbrowser()
	 {
		 System.out.println("Launch browser is executed");
	 }

	 @Test
	 public void launchbrowser2()
	 {
		 System.out.println("Launch browser2 is executed");
	 }
	 @AfterTest()
	 public void test2()
	 {
		 System.out.println("After test is executed");
	 }
}
