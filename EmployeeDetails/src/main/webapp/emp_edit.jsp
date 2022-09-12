<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>Edit</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
body {
    background-image: url("images/bg1.jpg");
}
</style>

</head>
<body>
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/mydb" user="root"
		password="root" />

	<sql:query dataSource="${db}" var="rs">  
       SELECT * from employees WHERE ID="<%=Integer.parseInt(request.getParameter("id"))%>";  
     </sql:query>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark">
			<div>
				<a href="" class="navbar-brand" style="font-size:30px;"> Edit Employee Details</a>
			</div>

		</nav>
		<h3 class="text-center" style="color:white;">Edit Details</h3>
	</header>
	

	<div class="container col-md-5" style="margin-top: 30px;">
		<div class="card">
			<div class="card-body">
				<c:forEach var="table" items="${rs.rows}">

					<form action="Edit">
					    <input type="hidden" name="id" value="<c:out value="${table.id}" />">
						<fieldset class="form-group">
							<label>Employee Name</label> <input type="text" value="<c:out value="${table.empname}" />"
								class="form-control" name="empname" required="required"
								minlength="2">
						</fieldset>

						<fieldset class="form-group">
							<label>Description</label> <input type="text" value="<c:out value="${table.department}" />"
								class="form-control" name="department" minlength="5">
						</fieldset>
						
								<fieldset class="form-group">
							<label>Skills</label> <input type="text" value="<c:out value="${table.skills}" />"
								class="form-control" name="skills" required="required"
								minlength="2">
								
										<fieldset class="form-group">
							<label>Salary</label> <input type="text" value="<c:out value="${table.salary}" />"
								class="form-control" name="salary" required="required"
								minlength="4">
						</fieldset>
						</fieldset>

						<button type="submit" class="btn btn-success" style="color:black; background-color:blue;">Save</button>
					</form>
				</c:forEach>
			</div>
		</div>
	</div>

</body>
</html>
