<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>欣欣</title>
</head>
<body>
<h1>日本.......</h1>
<a href="<%= request.getContextPath()%>/i18n/change"><t:message code="language"/></a>
<p>
    <img src="<%=request.getContextPath()%>/static/images/4.jpg"/>
</p>


<a href="<%=request.getContextPath()%>/student/add"> <t:message code="index.jsp"/> </a>
<a href="<%=request.getContextPath()%>/sys/uploadpage">上传</a>
</body>
</html>
