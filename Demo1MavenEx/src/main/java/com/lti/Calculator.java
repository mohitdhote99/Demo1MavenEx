package com.lti;


public class Calculator {
	
	public String sayHello() {
		return "Hello world";
	}
	
	public int addNos(int x,int y,String action) {
		String act = action.toLowerCase();
		int result = 0;
		if(act == "add") {
			result = x+y;
		}
		if(act == "mul") {
			result = x*y;
		}
		if(act == "sub") {
			result = x-y;
		}
		return result;
	}

}

