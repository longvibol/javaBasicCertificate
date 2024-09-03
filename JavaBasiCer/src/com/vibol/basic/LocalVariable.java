package com.vibol.basic;

public class LocalVariable {
	public static void main(String[] args) {
		
		LocalVariable l = new LocalVariable();
		l.localVariableMethod();
			
		
	}
	
	public LocalVariable() {
		
		int a = 10;
		boolean b = true;
		
		System.out.println("Value in constructor a = "+a);
		System.out.println("Value in constructor b = "+b);
		
	}
	
	
	public void localVariableMethod() {
		int a = 10;
		boolean b = true;
		
		System.out.println("Value a = "+a);
		System.out.println("Value b = "+b);
	}

}


