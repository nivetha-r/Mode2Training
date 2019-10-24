package com.hcl.lambda;


@FunctionalInterface
public interface MultiInterface {
	
 public String sayHello(String name);
 public static int add(int num1,int num2) {return num1+num2;}
 
 //Re-declaration of the equals() method in the object class
 boolean equals(Object obj);
 
 default public int defaultMethod(int variable){
	 return variable +100;
 }
}
