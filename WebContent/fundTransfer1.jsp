<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Fund Transfer</h1>
	<h3>Enter the Details for fund transfers : </h3>
	<table>
		<tr>
			<td>Enter Account Number FROM which you want to transfer funds : </td>
			<td><input type="number" name="accFrom"></td>
		</tr>
		<tr>
			<td>Enter Account Number TO which you want to transfer funds : </td>
			<td><input type="number" name="accTo"></td>
		</tr>
		<tr>
			<td>Amount</td>
			<td><input type="number" name="amount"></td>
		</tr>
		<tr>
			<td><a href="withdraw1.app"><input type="submit" value="fund"></a>
	</table>
</body>
</html>