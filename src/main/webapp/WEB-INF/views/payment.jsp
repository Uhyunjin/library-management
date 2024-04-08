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
    <title>payment</title>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>Payment Page</h1>
<table border="1">
    <tr>
        <th>고객번호</th>
        <th>고객이름</th>
        <th>등급</th>
        <th>총 대여금액</th>
    </tr>
    <c:forEach items="${list}" var="cost">
        <tr>
            <td>${cost.cust_no}</td>
            <td>${cost.cust_name}</td>
            <td>${cost.grade}</td>
            <td>${cost.sum}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
