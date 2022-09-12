<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<style>
body {
    background-image: url("images/bg1.jpg");
}
</style>
</head>
<body>
	<div class="container mt-5">
		<h1 style="color:white; margin-top: 150px;">Add Employee</h1>
		<form action="insert" style="margin-top: 30px;">
			<fieldset class="form-group">
				<label>Employee name</label> <input type="text" class="form-control"
					 name="empname" />
			</fieldset>
			<fieldset class="form-group">

				<label>Department</label> <input type="text" class="form-control"
					 name="department" />
			</fieldset>
			<fieldset class="form-group">

				<label>Skills</label> <input type="text" class="form-control"
					 name="skills" />
			</fieldset>
			<fieldset class="form-group">

				<label>Salary</label> <input type="text" class="form-control"
					 name="salary">
			</fieldset>
			<fieldset class="form-group">

				<button style="background-color:Blue"type="submit" class="btn btn-danger">Add</button>
			</fieldset>
		</form>
	</div>
</body>
</html>
