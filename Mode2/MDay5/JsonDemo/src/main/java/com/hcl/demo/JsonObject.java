package com.hcl.demo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonObject {
	public static void main(String[] args) {
		JSONObject emp=new JSONObject();
		  for(int j=1;j<4;j++){//for loop from j=1 to j=3 so 3 o/p's
			  JSONArray arr2=new JSONArray();
			  arr2.add("Emp"+j);
			  arr2.add(1000*j);
			  arr2.add(25+j);
			  emp.put(j, arr2);
		  }
		  System.out.print(emp);
			  
		  }
	}


