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
<body >
<div class="container" style="padding-top: 50px;">
    <div class="row">
        <div class="col-lg-8">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">Lesson</th>
                    <th scope="col">Group</th>
                    <th scope="col">Date</th>
                    <th scope="col">Subgroup</th>
                    <th scope="col">Type</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>

                    <c:forEach items="${scheduleList}" var="schedule">
                    <tr>
                        <td>${schedule.lesson}</td>
                        <td>${schedule.currentGroup}</td>
                        <td>${date}</td>
                        <td>${schedule.subgroup}</td>
                        <td>${schedule.lessonType}</td>
                        <td><a type="button" href="#" class="btn btn-success">ЗАПИСЬ</a></td>
                    </tr>
                    </c:forEach>

                </tbody>
            </table>
        </div>
        <div class="col-lg-2 offset-lg-1">
            <form method="post" action="/schedule/date">
                <input name="date" id="date" type="date" value="date">
                <button type="submit" class="btn bnt-success" >Submit</button>
            </form>
           <p class="h5">Дата: ${date}</p>
        </div>

    </div>
</div>


</body>
</html>
