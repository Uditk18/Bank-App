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
<h2>Deposit Successful!!</h2>
	<table>
		<tr>
			<th>Name</th>
			<td>${banker.accountHolder.customerName }</td>
		</tr>
		<tr>
			<th>Account Number</th>
			<td>${banker.accountNo }</td>
		</tr>
		<tr>
			<th>Account Balance</th>
			<td>${banker.accountBalance }</td>
		</tr>
	
		
			
			
		
	
		
	</table>
</body>
</html>