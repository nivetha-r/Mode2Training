package com.hcl.webservice;

import java.rmi.RemoteException;

import com.jaanu.JananiDemoProxy;
import com.sri.SriProxy;

public class MainApplication {
	
	public static void main(String[] args) {
		
		int res=0;
		JananiDemoProxy jananiDemoProxy=new JananiDemoProxy();
		try {
			res=jananiDemoProxy.getInt();
			System.out.println("SAP1 : " +res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int res2=0;
		SriProxy sriProxy=new SriProxy();
		try {
			res2=sriProxy.getSapCode();
			System.out.println("SAP2 : " +res2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		int res3=0;
		CalculatorProxy calculatorProxy=new CalculatorProxy();
		try {
			res3=calculatorProxy.add(res, res2);
			System.out.println("Add of SAP 1 and 2 : " +res3);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
