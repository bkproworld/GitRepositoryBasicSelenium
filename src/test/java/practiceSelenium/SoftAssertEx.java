package practiceSelenium;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	
	@Test
	public void m1() {
		
		System.out.println("Step-1");
		System.out.println("Step-2");
		System.out.println("Step-3");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, false);
		System.out.println("Step-4");
		System.out.println("Step-5");
		soft.assertAll();
	}
	@Test
	public void m2() {
		
		String expected = "Bantikumar";
		String actual = "Banti";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(expected, actual);
		soft.assertAll();
	}

}
