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

        登录用户:${loginUser.nickname}
        <br/>
        修改部门：&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <br/>
        <form action="${pageContext.request.contextPath}/department/updateDepartment" >
    <table border="1px">
        <tr>
            <td width="250px">
                部门名称:
                <input type="text" name="name" value="${departmaent.name}">
                <input type="hidden" name="departmentId" value="${departmaent.departmentId}">
            </td>
            <td width="80px">
               <button type="submit" >修改</button>
            </td>
        </tr>

      </table>
        </form>

        <br/>



</body>

</html>
