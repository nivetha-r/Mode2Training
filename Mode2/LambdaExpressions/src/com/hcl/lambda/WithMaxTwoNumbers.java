package com.hcl.lambda;

public class WithMaxTwoNumbers {
	public static void main(String[] args) {
		MyMaxInterface myInterface1=(int x,int y) -> {int max=x>y?x:y;return max;};
		int result1=myInterface1.MaxIwoNumbers(9, 19);
		System.out.println(result1);
		
			
	}
}
