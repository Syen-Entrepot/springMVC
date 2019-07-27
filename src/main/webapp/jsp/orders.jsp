<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/28 0028
  Time: 上午 0:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
我的订购清单!
<c:forEach items="${orders}" var="obj">
<tr>
    <td>${obj.id}</td>
    <td>${obj.name}</td>
    <td>${obj.totel}</td>
</tr>
</c:forEach>
</body>
</html>
