<%--
  Created by IntelliJ IDEA.
  User: uhyeo
  Date: 2024-02-23
  Time: 오후 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>customerList</title>
    <link rel="stylesheet" href="<c:url value='${path}/resources/css/menu.css'/>">
<%-- page context 이용ㅠㅠ 안되면 resource도 붙여보기,,,--%>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>고객 목록 조회</h1>
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
        <td><a href="/edit?cust_no=${m.cust_no}">${m.cust_no}</a></td>
        <td>${m.cust_name}</td>
        <td>${m.phone}</td>
        <td>${m.cust_email}</td>
        <td>${m.grade}</td>
    </tr>
        </c:forEach>
</table>
<%@include file="footer.jsp"%>
</body>
</html>
