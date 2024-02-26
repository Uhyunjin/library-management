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
<table>
    <tr>
        <th>id</th>
        <th>name</th>
    </tr>
        <c:forEach items="${list}" var="m"/>
    <tr>
            <tb>${m.id}</tb>
            <tb>${m.name}</tb>
    </tr>
</table>
</body>
</html>