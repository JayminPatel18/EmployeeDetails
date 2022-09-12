<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>Employees</title>
<style>
body {
    background-image: url("images/bg1.jpg");
}
</style>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/mydb" user="root"
		password="root" />

	<sql:query dataSource="${db}" var="rs">  
       SELECT * from employees WHERE loginid="<%=session.getAttribute("loginid")%>";  
     </sql:query>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: ">	<div>
				<h2><a href="" class="navbar-brand" style="font-size: 45px; color:blue;"> Employee Details</a></h2>
			</div>

			<ul class="navbar-nav navbar-collapse justify-content-end">
				<li><a href="login.jsp" style=" color:white;background-color: red" 
					class="nav-link">Logout</a></li>
			</ul>
		</nav>
	</header>

	<div class="row">
		<div class="container">
			<h3 class="text-center" style="font-family:Times New Roman, Times, serif; color:white;font-size: 40px;">Employee List</h3>
			<hr>

			<h4 style="margin-left: 15px; color:white;">
				Hello
				<%=session.getAttribute("loginid")%>,
			</h4>
			<div class="container text-left">

				<a href="emp_form.jsp" class="btn btn-success" style="font-family:Times New Roman, Times, serif; color:white">Add Employee</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Employee Name</th>
						<th>Department</th>
						<th>Skills</th>
						<th>Salary</th>
                 		<th>Actions</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="table" items="${rs.rows}">
						<tr>
							<td><c:out value="${table.empname}" /></td>
							<td><c:out value="${table.department}" /></td>
							<td><c:out value="${table.skills}" /></td>
							<td><c:out value="${table.salary}" /></td>


							<td><a style="background-color: blue; width: 67px;"
								class="btn btn-primary"
								href="emp_edit.jsp?id=<c:out value='${table.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp;
							    <a style="background-color: red;
							    "class="btn btn-primary"
								href="Delete?id=<c:out value='${table.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>
