import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// Arrange
		int a = 4321;
		int b = 1234;
		Calculate cal = new Calculate();
		
		// Act
		int actual = cal.add(a, b);
		
		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		// Arrange
		int a = 4321;
		int b = 1234;
		Calculate cal = new Calculate();
		
		// Act
		int actual = cal.subtract(a, b);
		
		// Assert
		int expected = 3087;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiply() {
		// Arrange
		int a = 10;
		int b = 2;
		Calculate cal = new Calculate();
		
		// Act
		int actual = cal.multiply(a, b);
		
		// Assert
		int expected = 20;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		// Arrange
		int a = 10;
		int b = 2;
		Calculate cal = new Calculate();
		
		// Act
		int actual = cal.divide(a, b);
		
		// Assert
		int expected = 5;
		assertEquals(expected, actual);
	}

}
