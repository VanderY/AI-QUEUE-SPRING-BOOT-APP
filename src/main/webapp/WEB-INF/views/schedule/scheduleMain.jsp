<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dark
  Date: 06.09.2021
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:import url="../links.jsp"></c:import>
    <title>Title</title>
</head>
<body>
<c:forEach items="${scheduleList}" var="schedule">
    <p>${schedule.lesson}</p>
    <p>${schedule.currentGroup}</p>
    <p>${schedule.lessonTime}</p>

</c:forEach>

</body>
</html>
