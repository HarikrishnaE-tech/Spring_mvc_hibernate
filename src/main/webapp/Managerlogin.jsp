<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>login</h1>
<form action="fulldetails" method="post">
<label>Enter the email</label>
<input type="text" name="email">
<br>
<br>
<label>Enter the password</label>
<input type="text" name="password">
<br>
<br>
<label for="job-category">Select the job category:</label>
<select name="job-category" id="job-category">
    <option value="Engineer">Engineer</option>
    <option value="HR">HR</option>
    <option value="manager">Manager</option>
</select>
<input type="submit">


</form>
</body>
</html>