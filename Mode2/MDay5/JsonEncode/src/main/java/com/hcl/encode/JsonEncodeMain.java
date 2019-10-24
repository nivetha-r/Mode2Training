package com.hcl.encode;



import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.hcl.model.Employee;

public class JsonEncodeMain {
	 public static void main(String[] args){//got from net
		 //BufferedReader bf=new BufferedReader(new FileReader("C://Users/Coalesce/Downloads/employees.json"));
	 
		 StringBuilder contentBuilder = new StringBuilder();
		    try (Stream<String> stream = Files.lines( Paths.get("C://Users/Coalesce/Downloads/employees.json"), StandardCharsets.UTF_8))
		    {
		        stream.forEach(s -> contentBuilder.append(s));
		    }
		    catch (IOException e)
		    {
		        e.printStackTrace();
		    } //json concept used below asigning data using json
		    String s=contentBuilder.toString();
		    Object obj=JSONValue.parse(s);
		    JSONObject jsonObject=(JSONObject) obj;
		    JSONObject jsonObject1=(JSONObject)jsonObject.get("employees");
		    JSONArray array=(JSONArray)jsonObject1.get("Employee");
		    
		    ArrayList<Employee> employeeList=new ArrayList<Employee>();
		    for(int i=0;i<array.size();i++){
		    	Employee emp=new Employee();
		    	JSONObject jsonObject2=(JSONObject)array.get(i);
		    	long empNo=(long) jsonObject2.get("empNo");
		    	emp.setEmpNo(empNo);
		    	 String empName = (String) jsonObject2.get("empName");  
		    	 emp.setEmpName(empName);
		    	 long salary = (long) jsonObject2.get("salary"); 
		    	 emp.setSalary(salary);
		    	 String band = (String) jsonObject2.get("band");
		    	 emp.setBand(band);
		    	 String dateOfJoin=(String) jsonObject2.get("dateOfJoin");
		    	 emp.setDateOfJoin(dateOfJoin);
		 	    //System.out.println(empNo+" "+empName+" "+salary+" "+band+" "+dateOfJoin);  
		 	    employeeList.add(emp);
		 	}  //printing using lambda expression
		    employeeList.stream().forEach((var)->System.out.println(var.getEmpNo()+" "+var.getEmpName()+" "
		    		+var.getSalary()+" "+var.getBand()+" "+var.getDateOfJoin()));
		    }
		    
	}  

