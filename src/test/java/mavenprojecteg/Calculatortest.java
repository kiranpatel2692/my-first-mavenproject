package mavenprojecteg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculatortest {
@Test
public void testadd() {
	assertEquals(10,Calculator.add(5,5));
	assertEquals(-5,Calculator.add(-7,2));
	}
@Test
public void testsub() {
	assertEquals(15,Calculator.sub(20, 5));
	assertEquals(-2,Calculator.sub(-4, -2));
}
@Test
public void testmulti() {
	assertEquals(50,Calculator.multiply(5, 10));
	assertEquals(-6,Calculator.multiply(2, -3));
}
@Test
public void testdiv() {
	assertEquals(2,Calculator.div(10,5));
	assertEquals(-3,Calculator.div(-9, 3));
}
}
