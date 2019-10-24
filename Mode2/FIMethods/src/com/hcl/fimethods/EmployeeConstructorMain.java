package com.hcl.fimethods;

public class EmployeeConstructorMain {
	public static void main(String[] args) {
		//for both empno and empname created Employeeinterface and both as single constructor created in class.
		EmployeeInterface employeeInterface =Employee::new;
		Employee employee=employeeInterface.getEmployee(20, "HCL");
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getEmpName());
	
	//only for empno created employeeinterface1 nd separate constructor created for empno n class
	EmployeeInterface1 employeeInterface1 =Employee::new;
	Employee employee1=employeeInterface1.getEmployee(2000);
	System.out.println(employee1.getEmpNo());
	
	//only for empname created employeeinterface2 nd separate constructor created for empname n class
	EmployeeInterface2 employeeInterface2 =Employee::new;
	Employee employee2=employeeInterface2.getEmployee("Nivi");
	System.out.println(employee2.getEmpName());

}
}
