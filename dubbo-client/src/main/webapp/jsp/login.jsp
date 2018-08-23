<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/static/common/tagLibs.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="/auth/login" method="post">
    <span style="background: red" id="msg"></span>
    <input type="text" name="username" id="username"/>
    <input type="password" name="password" id="password"/>
    <button class="login" type="submit" value="submit">Submit</button>
</form>
<script type="text/javascript" src="../js/jquery-1.11.0.js"></script>
<script type="text/javascript">
    $(".login").click(function () {
        var userName = $("#username").val();
        if (userName == '' || userName == null) {
            alert("用户名输入不能为空");
            return;
        }

        var password = $("#password").val();
        if (password == '' || password == null) {
            alert("密码输入不能为空");
            return;
        }
    });
    <% String msg = (String)request.getAttribute("msg"); %>
    if ('<%=msg%>' != 'null') {
        $("#msg").html('<%=msg%>');
    }
</script>
</body>
</html>