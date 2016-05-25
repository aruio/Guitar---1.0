<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<table style="width:100%;border:1px white solid" >
<center>
<tr bgcolor="#4F81BD"style="color: #fff;">RESULT</tr>
<tr bgcolor="#4F81BD"style="color: #fff;height:60px">
	<td align="center">SerialNumber</td>
	<td align="center">PRICE</td>
	<td align="center">BUILDER</td>
	<td align="center">MODEL</td>
	<td align="center">TYPE</td>
	<td align="center">BACKWOOD</td>
	<td align="center">TOPWOOD</td>
</tr>

<c:forEach items="${requestScope.list}" var="p">
	<tr  bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}" style="height:60px">
	<td align="center">${p.serialNumber}</td>
	<td align="center">${p.price}</td>
	<td align="center">${p.builder}</td>
	<td align="center">${p.model}</td>
	<td align="center">${p.type}</td>
	<td align="center">${p.backWood}</td>
	<td align="center">${p.topWood}</td>
	</tr>

</c:forEach>



</center>
</table>

</body>
</html>