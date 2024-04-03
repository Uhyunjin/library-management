<%--
  Created by IntelliJ IDEA.
  User: uhyeo
  Date: 2024-02-23
  Time: 오후 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>rentlist</title>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>Rent List Page</h1>
<table border="1">
    <tr>
        <th>고객번호</th>
        <th>대여번호</th>
        <th>책번호</th>
        <th>대여금액</th>
        <th>대여일</th>
    </tr>
    <c:forEach items="${list}" var="rent">
        <tr>
            <td>${rent.rent_no}</td>
            <td>${rent.cust_no}</td>
            <td>${rent.book_code}</td>
            <td>${rent.rent_price}</td>
            <td>${rent.rent_date}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
