package com.lti.Demos;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.lti.Calculator;

class TestCalculator {
	
	Calculator c = new Calculator();

	@Test
	public void testHello() {
		Assertions.assertEquals("Hello world",c.sayHello());
	}
//	@Disabled
	@Test
	public void testmyCal() {
		Assertions.assertEquals(70,c.addNos(10,7,"mul"),"Error occurred check code");
	}
	
	@Disabled
	@Test
	void testAssertFalse() {
	Assertions.assertFalse("FirstName".length() == 10);
	Assertions.assertFalse(10 > 20, "assertion message");
	}
	
	@Test
	public void testEmptyArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Assertions.assertEquals(0, al.size());
		Assertions.assertTrue(al.isEmpty()); // assertTrue Method
		al.add(100);
		al.add(200);
		Assertions.assertEquals(2, al.size());
		// assertFalse(al.isEmpty());
	}
	
}
