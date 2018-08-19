<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="fundTransfer1.app" method="post">
<div align="center"><h2>Fund Transfer</h2></div>
<table>
<tr>
	<td>Enter Account Number FROM which you want to transfer funds : </td>
	<td><input type="text" name="senderAccountNumber"></td>
</tr>
<tr>
	<td>Enter Account Number TO which you want to transfer funds : </td>
	<td><input type="text" name="receiverAccountNumber"></td>
</tr>
<tr>
	<td>Enter Amount: </td>
	<td><input type="number" name="transferAmount" min=1></td>
</tr>
<tr>
<td><input type="submit" value="Send"></td>
</tr>
</table>
</form>
</body>
</html>
