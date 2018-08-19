<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div><jstl:if test="${debit>=0 }">
			Successfully Transferred<br></br>
			Sender's Account Balance : ${debit} <br></br>
			Receiver's Account Balance : ${credit}	<br></br>	
		</jstl:if>
		<jstl:if test="${debit<0 }">
	     <h3>Transfer Unsuccessful: Sender does not have sufficient Balance</h3>	
		</jstl:if>

</body>
</html>
