package practiceSelenium;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssert {
	@Test
	public void hassert() {
		
		System.out.println("Step-1");
		System.out.println("Step-2");
		System.out.println("Step-3");
		Assert.assertEquals(true, true);
		System.out.println("Step-4");
		System.out.println("Step-5");
	}
	@Test
	public void hassert2() {
		
		String expected = "Bantikumar";
		String actual = "Bantikumar";
		Assert.assertEquals(expected, actual);
	}

}
