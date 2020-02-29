package TestFile;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

///tmam hl2 bde 23ml build.xml
import classMain.functions;

class test {

	@Test
	public void test2() {
		functions c = new functions();
		assertEquals(404, c.add(402, 2));
		
	}

	@Test
	public void testAdd_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 20;
		functions c = new functions();
		// Act
		int result = c.add(a, b);
		// Assert
		Assert.assertTrue(result > 0);
	}


	@Test
	public void testAdd_BothNumbersAreNegative_ShouldReturnNegativeNumber() {
		// Arrange
		int a = -10;
		int b = -20;
		functions c = new functions();
		// Act
		int result = c.add(a, b);
		// Assert
		Assert.assertTrue(result < 0);
	}
	 
}
