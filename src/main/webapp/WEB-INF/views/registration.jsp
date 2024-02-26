<%--
  Created by IntelliJ IDEA.
  User: uhyeo
  Date: 2024-02-23
  Time: 오후 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>고객 등록 화면</h1>
<div>
    <form method="post" action="/registration">
        <div>
            <label>고객번호</label>
            <input type="text" id="number" name="cust_no">
        </div>
        <div>
            <label>고객이름</label>
            <input type="text" id="name" name="cust_name">
        </div>
        <div>
            <label>전화번호</label>
            <input type="text" id="phone" name="phone">
        </div>
        <div>
            <label>이메일</label>
            <input type="text" id="email" name="cust_email">
        </div>
        <div>
            <label>고객등급(P/S/G)</label>
            <input type="text" id="grade" name="grade">
        </div>
        <input type="submit" value="등록">
    </form>
</div>
</body>
</html>
