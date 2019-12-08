<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2019/11/29
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>上传</h1>
<form action="<%=request.getContextPath()%>/sys/shangchuan" enctype="multipart/form-data" method="post">
    <input type="file" name="img">
    <input type="submit" value="submit">
</form>
</body>
</html>
