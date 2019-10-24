package com.hcl.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hcl.model.Employee;

@Path("/employee")

@Produces(MediaType.APPLICATION_JSON)
public class EmployeeServiceImpl implements EmployeeService {
	private static Map<Integer,Employee> emps = new HashMap<Integer,Employee>();
	@Override
	@GET
	@Path("/getAll")
	public Employee[] getAllEmployees() {
		Set<Integer> ids = emps.keySet();
		Employee[] e = new Employee[ids.size()];
		int i=0;
		for(Integer id : ids){
			e[i] = emps.get(id);
			i++;
		}
		return e;
	}
}
