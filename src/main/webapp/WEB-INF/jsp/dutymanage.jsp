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
        职务管理：&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="button" value="添加" onclick="location.href='${pageContext.request.contextPath}/department/addDepartmentPage'"/>
    <br/>
    <table border="1px">
        <tr>
            <td width="250px">
                部门名称
            </td>
            <td width="250px">
                职务名称
            </td>
            <td >
                编辑
            </td>
        </tr>
        <c:forEach items="${dutylist}" var="duty">
            <tr>
                <td width="250px">
                        ${duty.department.name}
                </td>

                <td width="250px">
                    ${duty.name}
                </td>

                <td >
                    <a href="${pageContext.request.contextPath}/department/deleteDepartment/${department.departmentId}">删除</a>
                    <a href="${pageContext.request.contextPath}/department/updateDepartmentPage/${department.departmentId}">修改</a>
                </td>
            </tr>

        </c:forEach>


      </table>
        <c:if test="${currentPage!=1}" >
            <a href="${pageContext.request.contextPath}/duty/manage/${currentPage-1}">上一页</a>
        </c:if>

        <c:forEach  begin="1" end="${size}" var="page">
            <a href="${pageContext.request.contextPath}/duty/manage/${page}">${page}</a>
        </c:forEach>
        <c:if test="${currentPage!=size}" >
            <a href="${pageContext.request.contextPath}/duty/manage/${currentPage+1}">下一页</a>
        </c:if>

        <br/>



</body>

</html>
