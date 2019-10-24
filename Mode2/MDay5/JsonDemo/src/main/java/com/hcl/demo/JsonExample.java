package com.hcl.demo;

import org.json.simple.JSONObject;    
public class JsonExample{    
public static void main(String args[]){    
JSONObject obj=new JSONObject();    
  obj.put("name","Nivi");  
  obj.put("salary",new Double(60000));
  obj.put("age",new Integer(21));    
  System.out.print(obj);    
  }}       
   
