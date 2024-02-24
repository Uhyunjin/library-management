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
    <form method="post" action="/save">
        <div>
            <label>고객번호</label>
            <input type="text" id="number" name="number">
        </div>
    <button type="submit">등록</button>
    </form>
</div>
</body>
</html>
