package com.hcl.lambda;


public class WithReturnLambdaExp {
	public static void main(String[] args) {
		MyInterfaceWithReturn myInterface1=(var1,var2) -> (var1 + var2);
		int result1=myInterface1.addTwoNumbers(5, 50);
		System.out.println(result1);
		
		MyInterfaceWithReturn myInterface2=(var1,var2) -> {return(var1 + var2);};
		int result2=myInterface2.addTwoNumbers(50, 50);
		System.out.println(result2);
		
		
	}

}
