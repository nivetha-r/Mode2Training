<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management Screen</title>
</head>
<body>
      <div align="center">
		<h1>Employee List</h1>
		
		<form:form action="search" modelAttribute="searchEmployee" method="post" >
		<b>Employee Name:</b>
		<form:input path="empName"/><br/><br/>
	     <b>Employee Band:</b>
		<form:select path="band">
		<form:option value='0'>-Select-</form:option>
		<form:option value='M'>Manager</form:option>
		<form:option value='C'>Contractor</form:option>
		<form:option value='E'>Employee</form:option>
		</form:select><br/><br/>
		<b>Salary Greater than:</b>
		<form:input path="salary"/><br/><br/>
		
		<input type="submit" value="Search"/><br/><br/>
			</form:form>
		
		<h2>No.of Employees:${listEmployee.size()}</h2>
		
	  <table border="2">

			<th>EmpName</th>
			<th>Salary</th>
			<th>Band</th>
			<th>DateOfJoin</th>
			

			<c:forEach var="Employee" items="${listEmployee}">
				<tr>
                  	
				    <td>${Employee.empName}</td>
					<td>${Employee.salary}</td>
					<td>${Employee.band}</td>
					<td>${Employee.dateOfJoin}</td>
					</tr>
						</c:forEach>
						</table>
						
						
					</div>
						
</body>
</html>