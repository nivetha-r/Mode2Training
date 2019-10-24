package com.hcl.fimethods;

public class InstanceMethodReference {
	public void saySomething() {
		System.out.println("Hello,this is non-static method");
	}
public static void main(String[] args) {
	InstanceInterface instanceInterface=()-> {System.out.println("Nivetha");};
	instanceInterface.myInterface();
	
	InstanceMethodReference instanceMethodReference=new InstanceMethodReference();
	
	InstanceInterface instanceInterface2=instanceMethodReference::saySomething;
	
	instanceInterface2.myInterface();
}
}
