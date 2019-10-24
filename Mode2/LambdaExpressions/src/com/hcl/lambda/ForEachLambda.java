package com.hcl.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {
	public static void main(String[] args) {  
        
        List<String> list=new ArrayList<String>();  
        list.add("Nivi");  
        list.add("Pichu");  
        list.add("Nisha");  
        list.add("Rithu");  
       /*
           for (String n:list) {
           System.out.println(n);
           }   
       */
        list.forEach(  
            (n)->System.out.println(n)  //list.forEach(consumer)
        );  
    }  
}
