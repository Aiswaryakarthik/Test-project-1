package Maven1.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Beforesuite {
	@BeforeSuite()
	 public void test1()
	 {
		 System.out.println("Beforesuite is executed");
	 }
	 @Test
	 public void launchbrowser()
	 {
		 System.out.println("Launch browser is executed");
	 }

	 @Test
	 public void gmail3()
	 {
		 System.out.println("Launch browser2 is executed");
	 }
	 @AfterSuite()
	 public void test2()
	 {
		 System.out.println("After suite is executed");
	 }
}
