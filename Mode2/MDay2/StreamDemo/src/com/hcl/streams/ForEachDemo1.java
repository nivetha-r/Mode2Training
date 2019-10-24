package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
public static void main(String[] args) {
	List<Employee> list=new ArrayList<Employee>();
	list.add(new Employee(10,"Apple",1010f,'E'));
	list.add(new Employee(20,"Banana",2020f,'M'));
	list.add(new Employee(30,"Carrot",3030f,'M'));
	list.add(new Employee(40,"Dates",4040f,'C'));
	list.add(new Employee(50,"Elderberry",5050f,'M'));
	//The Consumer Interface accepts the single argument and does not return any result.
	list.stream().forEach((var)->System.out.println
			(var.getEmpNo()+" "+var.getEmpName()+" "+var.getSalary()));
	
}
}
