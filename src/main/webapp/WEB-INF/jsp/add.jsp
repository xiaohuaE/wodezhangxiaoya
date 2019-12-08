<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <% request.setAttribute("str",request.getContextPath()); %>
</head>
<body>



<h1>add</h1>
<p>
    xx:
    <select id="oo">
        <C:forEach items="${requestScope.sr}" var="s">
            <option value="${s}">${s}</option>
        </C:forEach>
    </select>
</p>

<p>
    <f:form action="${str}/student/save" method="post"  modelAttribute="student">
        id:<f:input path="sid"></f:input><f:errors path="sid"/><br>
        名字:<f:input path="sname"></f:input><f:errors path="sname"/><br>
        年龄:<f:input path="age"></f:input><f:errors path="age"/><br>
        <input type="submit" value="提交">
    </f:form>
</p>

</body>
</html>
