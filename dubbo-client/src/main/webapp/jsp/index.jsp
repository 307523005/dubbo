<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/static/common/tagLibs.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<a href="/auth/logout">退出</a>
<h1>欢迎：<span style="color: red;"><%=request.getAttribute("username")%></span>
</h1>
</body>
</html>