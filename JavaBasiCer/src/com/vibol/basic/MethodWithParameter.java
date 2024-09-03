package com.vibol.basic;

public class MethodWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithParameter methodWithParameter = new MethodWithParameter();
		
		int sumThree = methodWithParameter.sumThree(10, 201, 30);
		

		System.out.println("Your total: " + sumThree);
	}
	
	public int sumThree(int a, int b, int c) {
		
		int z = a + b + c;
		
		
		
		return a + b + c;
	}

}
