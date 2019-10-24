package com.hcl.streams;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(10,"Apple",1010f,'E'));
		list.add(new Employee(20,"Banana",2020f,'M'));
		list.add(new Employee(30,"Carrot",3030f,'M'));
		list.add(new Employee(40,"Dates",4040f,'C'));
		list.add(new Employee(50,"EggFruit",5050f,'M'));
		
		list.stream().filter((emp)-> emp.getEmpName().startsWith("B"))
		.forEach((arg)->{System.out.println(arg.getEmpName());});
				
		list.stream() .filter((emp1) -> emp1.getBand()== 'M') 
		.forEach((arg) ->{ System.out.println(arg.getBand());});




list.stream() .filter((emp) -> emp.getSalary()== 1010f) 
.forEach((arg) ->{ System.out.println(arg.getEmpName());});

	}
}









 
                     