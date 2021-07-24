<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/7/23
  Time: 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/selectbyname" method="post">
    <label>
        输入用户名：
        <input type="text" name="uname">
    </label><br>
    <input type="submit" value="查询">
</form>
</body>
</html>
