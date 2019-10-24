package com.hcl.webservice;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
           int result=0;
           CalculatorProxy calculatorProxy=new CalculatorProxy();
           try {
			result=calculatorProxy.add(5, 6);
			System.out.println("Addition of 2 numbers:" +result);
			result=calculatorProxy.mul(5, 6);
			System.out.println("multiplication of 2 numbers:" +result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
}

}
