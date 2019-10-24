package com.hcl.fimethods;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		Integer ans=calculator.calc((x,y)->x+y,10,5);
		//instead integer can use float like tht fr decimal no.s
		System.out.println(ans);
	}

}
