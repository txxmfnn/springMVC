<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<P>The time on the server is ${serverTime}.</P>
	<form name="form1" id="form1">

		<table border="1">
			<tr>
				<td>id</td>
				<td>name</td>
			</tr>
			<c:forEach items="${persons}" var="row">
				<tr>
					<td align="center">${row.cpscode}</td>
					<td align="center">${row.cpsname}</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>