package com.hcl.lambda;

public class DefaultInterfaceImpl implements DefaultInterface{
	public static void main(String[] args) {
		new DefaultInterfaceImpl().printHello();//without static-use class name with new keyword
		DefaultInterface.printHello1();//with static-use interface name
		
	}

}
