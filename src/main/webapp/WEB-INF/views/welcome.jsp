<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld page</title>
</head>
<body>
    <h2> Add CV </h2>
    <form action="/cvAdded">
      Name:<br>
      <input type="text" name="name"><br>
      Job:<br>
      <input type="text" name="job"><br>
      Salary:<br>
      <input type="text" name="salary"><br>
      Age:<br>
      <input type="text" name="age"><br><br>
      <input type="submit" value="Submit">
    </form>
    <br>
    ***********************************************
    <br>
    <h2> View CV </h2>
    <form action="/viewCv">
          Job:<br>
          <input type="text" name="job"><br><br>
          <input type="submit" value="Submit">
    </form>
    <br>
    ***********************************************
     <br>
     <h2> View All CV </h2>
     <form action="/viewAllCv">
         <input type="submit" value="Submit">
     </form>
</body>
</html>