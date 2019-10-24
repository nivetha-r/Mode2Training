<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Student List</h1>
		
		<table border="1">

			<th>Roll No</th>
			<th>Name</th>
			<th>Age</th>
			<th>Gender</th>
			

			<c:forEach var="student" items="${listStudent}">
				<tr>

					<td>${student.rollNo}</td>
					<td>${student.sName}</td>
					<td>${student.age}</td>
					<td>${student.gender}</td>
					<td><a href="editstudent?rollNo=${student.rollNo}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="deletestudent?rollNo=${student.rollNo}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New student Register <a href="newStudent">here</a>
		</h4>
	</div>
</body>
</html>