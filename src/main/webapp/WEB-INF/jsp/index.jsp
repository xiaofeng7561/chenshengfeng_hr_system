<%--
  Created by IntelliJ IDEA.
  User: 陈胜锋
  Date: 2018/2/28
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/messages_zh.js"></script>
</head>
<body>
<div class="login-top"></div>
<div class="login-area">
        登录用户:${loginUser.nickname}
        <br/>

        <label>
           <a href="${pageContext.request.contextPath}/department/manage/1"> 部门管理：</a>
        </label>
    <br/>
    <label>
        <a href="${pageContext.request.contextPath}/duty/manage/1"> 职务管理：</a>
    </label>

        <br/>
        <label>
            员工管理：
        </label>

        <br/>



        <br/>

</div>
<div class="login-copyright"></div>
</body>

</html>
