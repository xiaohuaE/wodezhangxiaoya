<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <% request.setAttribute("str",request.getContextPath()); %>
</head>
<body>
<h1>登录页面</h1>
${message}
<%--<formessagem id="loginForm" action="${str}/user/denlu" method="post">--%>
    <%--<input type="text" id="username" name="username"/> <br/>--%>
    <%--<input type="text" id="password" name="password"/>  <br/>--%>
    <%--<input type="submit" value="登录"/>--%>
<%--</formessagem>--%>

<f:form action="${str}/user/denlu" method="post">
    <input type="text" id="username" name="username"/> <br/>
    <input type="text" id="password" name="password"/>  <br/>
    <input type="submit" value="登录"/>
</f:form>
</body>
</html>
