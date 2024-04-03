<%--
  Created by IntelliJ IDEA.
  User: uhyeo
  Date: 2024-02-23
  Time: 오후 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>customerList</title>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>Customer List Page</h1>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>phone</th>
        <th>email</th>
        <th>등급</th>
    </tr>
        <c:forEach items="${list}" var="m">
    <tr>
        <td>${m.cust_no}</td>
        <td>${m.cust_name}</td>
        <td>${m.phone}</td>
<%--        <td>${m.join_date}</td>--%>
        <td>${m.cust_email}</td>
        <td>${m.grade}</td>
<%--                <td>${m.id}</td>--%>
<%--                <td>${m.name}</td>--%>

    </tr>
        </c:forEach>
</table>
</body>
</html>