<%--
  Created by IntelliJ IDEA.
  User: 15029
  Date: 2021/7/5
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/t1" method="post">
        <p>
            用户名: <input type="text" name="username">
        </p>
        <p>
            密码: <input type="password" name="password">
        </p>
        <p>
            <input type="submit" name="提交">
        </p>


    </form>
</body>
</html>
