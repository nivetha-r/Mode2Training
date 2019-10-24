package com.hcl.fault;

import java.rmi.RemoteException;

public class MainApplication {
public static void main(String[] args) {
	String res;
	HelloWorldProxy helloWorldProxy=new HelloWorldProxy();
	try {
		res=helloWorldProxy.sayHelloWorld("Nivi,How r u??");
		System.out.println(res);
	} catch (MissingName e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
