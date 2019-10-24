package com.hcl.javastreams.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.javastreams.model.Employee;
import com.hcl.javastreams.service.EmployeeService;

@Controller("/Employee")

public class EmployeeController {
	
    
	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public EmployeeController() {
		System.out.println("EmployeeController()");
	}

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		logger.info("entering into");
		logger.info("calling into");
		List<Employee> listEmployee = employeeService.getAllEmployee();
		model.addObject("searchEmployee",new Employee());
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}
	@RequestMapping(value = "/search",method=RequestMethod.POST)
	public ModelAndView searchEmployee(ModelAndView model,@ModelAttribute Employee searchEmployee) throws IOException {
		logger.info("entering into");
		logger.info("calling into");
		List<Employee> listEmployee = employeeService.getAllEmployee();
		//this method could b done without including sal here nd o/p comes..
		if(searchEmployee.getBand() !='0'){
			listEmployee=listEmployee.stream()
					.filter((var)->var.getEmpName()
					.startsWith(searchEmployee.getEmpName())
					&&var.getSalary()>searchEmployee.getSalary()
					&&var.getBand()==searchEmployee.getBand())
					.collect(Collectors.toList());//band not zero na searches name nd sal wrt to band.
		}else{
			listEmployee=listEmployee.stream()
					.filter((var)->var.getEmpName()
					.startsWith(searchEmployee.getEmpName())
					&&var.getSalary()>searchEmployee.getSalary())
					.collect(Collectors.toList());//band zero na searches name and sal of all bands
		}
		//this done by me in easiest way thn also o/p comes...
		/*listEmployee=listEmployee.stream()
				.filter((var)->var.getEmpName().startsWith(searchEmployee.getEmpName())
				&&var.getBand()==(searchEmployee.getBand())
				&&var.getSalary()>(searchEmployee.getSalary()))
				.collect(Collectors.toList());*/
		model.addObject("searchEmployee",searchEmployee);
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}
}
