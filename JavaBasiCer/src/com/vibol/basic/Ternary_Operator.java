package com.vibol.basic;

import java.util.ArrayList;
import java.util.List;

public class Ternary_Operator {

	public static void main(String[] args) {
		int a = 20;
		String outPut = (a > 30) ? "PASS":"FALSE";
		
		System.out.println(outPut);
		
		
		// constructre 
		Integer intObject = new Integer(25);
		
		
		//static factory method 
		Integer intObj = Integer.valueOf(25);
		
		// wrapper class to primitive 
		
		int primetiveValue = intObj.intValue();
		
		List<Integer> integerList = new ArrayList<>();

		for(int i = 1; i < 10; i++){

		integerList.add(i);

		}
		
		System.out.println(integerList);

	}

}
