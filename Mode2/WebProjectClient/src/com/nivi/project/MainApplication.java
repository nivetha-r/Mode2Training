package com.nivi.project;

import java.rmi.RemoteException;



public class MainApplication {
	public static void main(String[] args) {
        String res;
        NiviProxy niviProxy=new NiviProxy();
        try {
			res=niviProxy.getName();
			 System.out.println("My Details: "+res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
}
}
