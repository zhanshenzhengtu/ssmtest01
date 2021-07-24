<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/7/23
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
用户信息查询结果：<br>
<c:forEach items="${users}" var="user">
    ${user.uid}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${user.uname}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${user.usex}<br>
</c:forEach>
</body>
</html>
