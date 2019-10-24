package com.hcl.fimethods;

@FunctionalInterface
public interface MethodReferenceStatic {
	public String sayHello(Integer str);
	public static String someMethod(Integer num) {
		return "Welcome static :" + num;
	}

}
