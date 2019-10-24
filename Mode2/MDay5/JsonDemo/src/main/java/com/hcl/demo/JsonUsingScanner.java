package com.hcl.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.JarException;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonUsingScanner {
	 public static void main(String[] args) {
		   Map obj=new HashMap();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your name:");
	        String name = sc.next();
	        obj.put("Name",name);


	        Scanner sc1 = new Scanner(System.in);
	        System.out.println("Enter your Salary:");
	        String sal = sc1.next();
	        obj.put("Salary",sal);

	        Scanner sc2 = new Scanner(System.in);
	        System.out.println("Enter your Age:");
	        String age = sc2.next();
	        obj.put("Age",age);

	        


	        JSONObject jsonObject = new JSONObject();
	        jsonObject.put("1",JSONValue.toJSONString(obj));//important 
			System.out.println(jsonObject.toString());
	    }
}
