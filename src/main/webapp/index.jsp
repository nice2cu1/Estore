<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="404.jsp" %>
<%!
%>
<%
%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script src="https://unpkg.com/lottie-web@5.12.2/build/player/lottie.js"></script>
    <link rel="stylesheet" href="./css/index.css">
</head>
<body id="login-body">
<div id="anim-background" class="anim-background"></div>
<div class="login-main">
    <h1><%= "欢迎访问E-Store电子商城" %>
    </h1>
    <div class="login-div">
        <div id="anim-logo" class="anim-logo" style="width: 100px;height: 133px"></div>
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
<%--                <input type="submit" name="submit" class="login-button" id="submit" value="登录">--%>
                <button class="login-button"><span>登录</span></button>
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

    var animation_logo = bodymovin.loadAnimation({
        container: document.getElementById('anim-logo'),
        renderer: 'svg',
        loop: false,
        autoplay: true,
        path: './anim/logo.json'
    });

    var animation_background = bodymovin.loadAnimation({
        container: document.getElementById('anim-background'),
        renderer: 'svg',
        loop: true,
        autoplay: true,
        path: './anim/login-background.json'
    });

</script>
</html>