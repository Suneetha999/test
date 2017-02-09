<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  action="./student.do"  method="POST" commandName="student">
<table>
<tr>
<td>Student Id</td>
<td>
<form:input path="studentId" />
</td></tr>
<tr>
<td>First Name</td>
<td><form:input path="firstname" /></td>
</tr>
<tr>
<td>Last Name</td>
<td><form:input path="lastname" /></td>
</tr>
<tr>
<td>Year Level</td>
<td><form:input path="yearlevel" /></td>
</tr>
<tr>
<td colspan="2">
<input type="submit"  name="actuon" value="Add"/>
<input type="submit"  name="actuon" value="Edit"/>
<input type="submit"  name="actuon" value="Delet"/>
<input type="submit"  name="actuon" value="Search"/>
</td>

</tr>
</table>


</form:form>

<br>
<table>

<th>Id</th>
<th>First name</th>
<th>Last name</th>
<th>Year Level</th>

<c:forEach  items="studentList" var="student">
<tr>
<td>${student.studentId}</td>
<td>${student.firstname}</td>
<td>${student.lastname}</td>
<td>${student.yearlevel}</td>
</tr>
</c:forEach>

</table>

</body>
</html>