<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@taglib prefix="jstl" uri="http://java.sun.com/jstl/core"%>
 --%> <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jstl:forEach var="bank" items="${bank}">
		<table border="1">
			<tr>
				<td><b>Customer Name : </b> ${bank.accountHolder.customerName}
				</td>
			</tr>

			<tr>
				<td><b>Email-ID : </b> ${bank.accountHolder.emailId}</td>
			</tr>

			<tr>
				<td><b>Date of birth : </b> ${bank.accountHolder.dateOfBirth}</td>
			</tr>

			<tr>
				<td><b>Phone number : </b> ${bank.accountHolder.contactNumber}
				</td>
			</tr>

			<tr>
				<td><b>Account Balance : </b> ${bank.accountBalance}</td>
			</tr>

			<tr>
				<td><b>Account Number : </b> ${bank.accountNo}</td>
			</tr>
		</table>

	</jstl:forEach>

</body>
</html>