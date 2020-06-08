<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quarantine Registration</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <h2>Quarantine Registration Form</h2>
  <form method="post" action="/submit-details">
    <div class="form-group">
      <label for="pid">Person Id:</label>
      <input type="number" class="form-control" id="pid" placeholder="Enter Person Id" name="pid">
    </div>
    <div class="form-group">
      <label for="pname">Name:</label>
      <input type="text" class="form-control" id="pname" placeholder="Enter Name" name="pname">
    </div>
    <div class="form-group">
      <label for="age">Age:</label>
      <input type="number" class="form-control" id="age" placeholder="Enter Age" name="age">
    </div>
    <div class="form-group">
      <label for="gender">Gender:</label>
      <input type="text" class="form-control" id="gender" placeholder="Enter Gender" name="gender">
    </div>
    <div class="form-group">
      <label for="admDate">Admitted Date:</label>
      <input type="text" class="form-control" id="admDate" placeholder="Enter Date" name="admDate">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
  <br>
  <br>
  <a href="/">Go Back</a>
</div>
</body>
</html>