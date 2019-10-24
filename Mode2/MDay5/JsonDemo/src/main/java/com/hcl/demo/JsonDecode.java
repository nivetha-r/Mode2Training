package com.hcl.demo;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecode {
	public static void main(String[] args) {  
	    String s="{\"name\":\"Nivi\",\"salary\":60000.0,\"age\":21}";  
	    //Object obj=JSONValue.parse(s);  
	    JSONObject jsonObject = (JSONObject)JSONValue.parse(s); //converts everything in one line 
	  
	    String name = (String) jsonObject.get("name");  
	    double salary = (Double) jsonObject.get("salary");  
	    long age = (Long) jsonObject.get("age");  
	    System.out.println(name+" "+salary+" "+age);  
	}  
	}  
