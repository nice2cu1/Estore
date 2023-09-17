<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="404.jsp" %>
<%!
%>
<%
%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="./css/index.css">
</head>
<body>
<div class="login-main">
    <h1><%= "欢迎访问E-Store电子商城" %>
    </h1>
    <div class="login-div">
        <h2>登录</h2>
        <div class="login-div2">
            <form class="login-form" action="http://localhost:8080/test" method="post"
                  onsubmit="return submitFunction(this);">
                <div>
                    <span>账号：</span>
                    <input type="text" name="account" class="login-input" id="account">
                </div>
                <div>
                    <span>密码：</span>
                    <input type="password" name="password" class="login-input" id="password">
                </div>
                <input type="submit" name="submit" class="login-button" id="submit" value="登录">
            </form>
        </div>
    </div>
</div>
</body>
<script>

    function submitFunction(obj) {
        const account = obj.account.value.trim();
        const password = obj.password.value.trim();
        if (account === '' || password === '') {
            alert("请输入完整信息！")
            return false;
        }

    }
</script>
</html>