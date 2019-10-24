package com.hcl.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.hcl.service.EmployeeServiceImpl;




public class EmployeeApplication extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();

	public EmployeeApplication() {
		singletons.add(new EmployeeServiceImpl());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
