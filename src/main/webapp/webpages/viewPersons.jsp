<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>People Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
<div class="container text-center" id="tasksDiv">
				<h3>People Details</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th><center>Id</center></th>
								<th><center>Name</center></th>
								<th><center>Age</center></th>
								<th><center>Gender</center></th>
								<th><center>Admitted Date</center></th>
								<th><center>Remove</center></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="persons" items="${persons }">
								<tr>
									<td>${persons.pid}</td>
									<td>${persons.pname}</td>
									<td>${persons.age}</td>
									<td>${persons.gender}</td>
									<td>${persons.admDate}</td>
									<td><a href="/delete-persons?pid=${persons.pid }&type=1"><span
											class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<br>
			<br>
			<a href="/">Go Back</a>
</body>
</html>