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
    <title>save</title>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>form save check</h1>
<h1>고객번호 : ${param.cust_no}</h1>
<h1>고객이름 : ${param.cust_name}</h1>
<h1>전화번호 : ${param.phone}</h1>
<h1>이메일 : ${param.cust_email}</h1>
<h1>고객등급(P/S/G) : ${param.grade}</h1>
</body>
</html>
