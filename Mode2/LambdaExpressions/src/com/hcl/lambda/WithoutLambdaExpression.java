package com.hcl.lambda;

public class WithoutLambdaExpression {
//An Inner class declared without class name is known as an anonymous inner class
	public static void main(String[] args) {
		MyInterface myInterface=new MyInterface() {
			
			@Override
			public void sayMessage() {
				System.out.println("Welcome to My Interface");
				
			}
		};
		myInterface.sayMessage();
		
	}

}
