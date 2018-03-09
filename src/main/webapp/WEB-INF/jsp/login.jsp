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
    <form id="userForm">
        <label>
            工&nbsp;&nbsp;号：
        </label>
        <input type="text" name="username" onblur="validate()" id="username"/>
        <span id="usernameValidate"></span>
        <br/>
        <label>
            密&nbsp;&nbsp;码：
        </label>
        <input type="password" name="password" />
        <br/>
        <input type="submit" class="login-sub" value="登陆" />
        <br/>
    </form>
</div>
<div class="login-copyright"></div>
</body>
<script>
    function validate() {
        $.ajax({
            type:"post",
            data:$("#username").serialize(),
            dataType:"text",
            url:"${pageContext.request.contextPath}/user/loginValidate",
            success:function (data) {
                if (data!="1"){
                    $("#usernameValidate").html("用户名错误");
                }else{
                    $("#usernameValidate").html("");
                }
            }
        });
    }

</script>
<script>
    $(function () {
        $("#userForm").validate(
            {
                rules:{
                    username:"required",
                    password:{
                        required:true,
                        minlength:5
                    }
                },
                messages:{
                    username:"用户名不能为空",
                    password:{
                        required:"密码不能为空",
                        minlength:"长度不能小于5位"
                    }
                },
                submitHandler:function () {
                    $.ajax(
                        {
                            type:"post",
                            data:$("#userForm").serialize(),
                            dataType:"text",
                            url:"${pageContext.request.contextPath}/user/loginValidate",
                            success:function (data) {
                                if (data!="1"){
                                    alert("用户名密码错误");
                                }else{
                                    location.href="${pageContext.request.contextPath}/user/index";
                                }
                            }
                        }
                    );
                }
            }
        );

        
    })
</script>
</html>
