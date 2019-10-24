package com.hcl.demo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class JsonMapExample {
	public static void main(String args[]){    
		  Map obj=new HashMap();    
		  obj.put("name","Nisha");    
		  obj.put("age",new Integer(17));    
		  obj.put("salary",new Double(30000));   
		  String jsonText = JSONValue.toJSONString(obj);  
		  System.out.print(jsonText);  
		}}    

