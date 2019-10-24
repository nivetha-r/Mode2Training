package com.hcl.lambda;

public class WithLambdaExpression {

	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface = ()-> {
			System.out.println("Welcome Lambda");
			};
			myFunctionalInterface.sayMessage();
		}
	}

