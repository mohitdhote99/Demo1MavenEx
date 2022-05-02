package com.lti.Demos;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.lti.Calculator;

class TestCalculator {
	
	Calculator c = new Calculator();
	@Disabled
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
	@Disabled
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
	
	@ParameterizedTest
    @ValueSource(ints = {8,4,2,6,12})
    void test_int_arrays(int arg) {
      System.out.println("arg => "+arg);
      Assertions.assertTrue(arg % 2 == 0);
    }   
	
	@DisplayName("Should pass a non-null message to our test method")
	    @ParameterizedTest
	    @ValueSource(strings = {"Hello"})
	    void testParam(String message) {
		 Assertions.assertNotNull(message);
	    }

		@ParameterizedTest(name="#{index} - Test with Argument={0}")
	    @ValueSource(strings = {"Peter King", "Arthur King", "Martin King"})
	    void test_string_arrays(String arg) {
	      String searchKey = "King";
	      
	      System.out.println("arg => "+arg);
	      Assertions.assertTrue(arg.contains(searchKey));
	    }  
	
	
}
