package com.hcl.lambda;

public interface DefaultInterface {
	default void printHello() {
		System.out.println("Hello Nivetha");
	}
	static void printHello1() {
		System.out.println("Hello Pichu");
	}


}
