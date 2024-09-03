package com.vibol.basic;

public class InstanceVariable {
	
	int a = 10;
	int b = 20;
	public int c = 123;

	public static void main(String[] args) {

		InstanceVariable l = new InstanceVariable();
		l.instandVariableMethod();
	}
	
	public InstanceVariable() {
		
		System.out.println(a + b);
		
	}
	
	public void instandVariableMethod() {
		System.out.println(a * b);
	}

}
