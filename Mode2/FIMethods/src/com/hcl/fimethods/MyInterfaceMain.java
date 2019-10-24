package com.hcl.fimethods;

import java.util.function.Consumer;

public class MyInterfaceMain {
	public static void main(String[] args) {
		MyInterface myInterface = (a) -> {System.out.println(a);};
		myInterface.someMethod("Nivetha");
		
		MyInterface myInterface1 = System.out::println;
		myInterface.someMethod("nivi");
		/*println is a method name...myinterface1 takes println
		and invokes "someMethod"*/
		
		Consumer<String> consumer=System.out::println;
		consumer.accept("Bye");
	}

}
