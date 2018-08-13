<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Name</th>
			<th>Account Number</th>
			<th>Account Balance</th>
		</tr>
	<jstl:forEach var="banker" items="${requestScope.banker}">
		
		<tr>
			<td>${banker.accountHolder.customerName }</td>
			<td>${banker.accountNo }</td>
			<td>${banker.accountBalance }</td>
		</tr>
	</jstl:forEach>
		
	</table>
</body>
</html>