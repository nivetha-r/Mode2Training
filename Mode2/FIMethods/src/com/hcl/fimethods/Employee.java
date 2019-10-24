package com.hcl.fimethods;

public class Employee {
	 	private int empNo;
		private String empName;
		
		
		// frm source generate cons using superclass
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		// frm source generate cons using fields
		public Employee(int empNo, String empName) {
			super();
			this.empNo = empNo;
			this.empName = empName;
		}
		
		
		public Employee(int empNo) {
			super();
			this.empNo = empNo;
		}
		

		public Employee(String empName) {
			super();
			this.empName = empName;
		}

		// frm source generate getters and setters
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		
		
		

}
