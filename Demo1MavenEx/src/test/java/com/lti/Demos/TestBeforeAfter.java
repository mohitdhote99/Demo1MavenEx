package com.lti.Demos;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.Calculator;

class TestBeforeAfter {
//	private static final String ANSI_RED = "\u001B[31m";
//	private static final String ANSI_RESET = "\u001B[0m";
	
	int sum;
	@BeforeAll
	//before all method should be static always
	public static void testConndb() {
		System.out.println("=> db is connected");
	}
	@BeforeEach
	public void testStartUp() {
		sum=100;
		System.out.println("Initialization sucessfull");
	}
	@BeforeEach
	public void testendUp() {
		sum=50;
		System.out.println("Initialization end");
	}
	
	@Test
	public void testAdition() {
		System.out.println("----  Adition method");
		Calculator c = new Calculator();
		int result = c.addNos(2, 2, "add");
		Assertions.assertEquals(4, result,"Error ! Check code");
	}
	@Test
	public void testSubtract() {
		System.out.println("----  Subtraction method");
		Calculator c = new Calculator();
		int result = c.addNos(100, 50, "sub");
		Assertions.assertEquals(50, result,"Error! Check code");
	}
	@AfterAll
	//before all method should be static always
	public static void checkClose() {
		System.out.println("=> db is closed");
	}

}
