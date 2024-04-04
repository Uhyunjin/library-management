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
            <input type="text" id="number" name="cust_no" value=${customerDto.cust_no}>
        </div>
        <div>
            <label>고객이름</label>
            <input type="text" id="name" name="cust_name" value=${customerDto.cust_name}>
        </div>
        <div>
            <label>전화번호</label>
            <input type="text" id="phone" name="phone" value=${customerDto.phone}>
        </div>
        <div>
            <label>이메일</label>
            <input type="text" id="email" name="cust_email" value=${customerDto.cust_email}>
        </div>
        <div>
            <label>고객등급(P/S/G)</label>
            <input type="text" id="grade" name="grade" value=${customerDto.grade}>
        </div>
        <%--<input type="submit" value="등록">--%>
    <c:if test="${mode eq 'new'}">
      <button type="submit" id="writeBtn">등록</button>
    </c:if>
    <c:if test="${mode ne 'new'}">
      <button type="button" id="editBtn">수정</button>
    </c:if>
    </form>
</div>
<script>
  $(document).ready(function(){
    let formCheck = function() {
      let form = document.getElementById("form");
      if(form.cust_name.value=="") {
        alert("제목을 입력해 주세요.");
        form.title.focus();
        return false;
      }

    $("#editBtn").on("click", function(){
      let form = $("#form");
      form.attr("action", "<c:url value='/edit'/>");
      form.attr("method", "post");

      if(formCheck())
        form.submit();
    });
</script>
</body>
</html>
