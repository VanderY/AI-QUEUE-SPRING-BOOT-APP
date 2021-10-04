<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dark
  Date: 06.09.2021
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" class="h-100">
<head>
    <title>Queue.ai - new rules, new us.</title>
    <c:import url="../links.jsp"></c:import>
    <link href="<c:url value="/resources/static/styles/index_styles.css" />" rel="stylesheet">
</head>


<body>
<div id="particles-js"></div>
<div id="overlay" class="d-flex h-100 text-center text-white bg-transparent">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
        <header class="mb-auto">
            <div>
                <a class="h3 float-md-middle mb-0 text-white" style="text-decoration: none;" href="/">AI QUEUE</a>

            </div>
        </header>

        <main class="px-3">
            <p class="h4">Schedule for: ${date}</p>
            <p class="lead" style="background-color: rgba(55,55,55,0.7); border-radius: 5px; padding: 5px;">

            <table class="table text-white">
                <thead>
                <tr>
                    <th scope="col">Lesson</th>
                    <th scope="col">Subgroup</th>
                    <th scope="col">Type</th>
                    <th scope="col">Time</th>
                </tr>
                </thead>
                <tbody>

                <c:forEach items="${scheduleList}" var="schedule">
                    <tr>
                        <td>${schedule.lesson}</td>
                        <td><c:if test="${schedule.subgroup == 0}"></c:if>
                            <c:if test="${schedule.subgroup == 1}">1</c:if>
                            <c:if test="${schedule.subgroup == 2}">2</c:if>
                        </td>
                        <td>${schedule.lessonType}</td>
                        <td>${schedule.lessonTime}</td>
                            <%--        <td><a type="button" href="#"
                                           class="btn btn-secondary bg-white text-dark-50 custom-shit">ЗАПИСЬ</a></td>--%>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
            </p>
        </main>

        <footer class="mt-auto text-white-50">
            <p style="margin-bottom: 1px">AI. Queue by <a href="https://t.me/darkqqa" class="text-white">@dark</a> & <a
                    href="https://t.me/vander_yan" class="text-white">@vander</a>.</p>
            <p class="disabled">Feel free to contact us!</p>
        </footer>
    </div>
</div>
<script type="text/javascript" src='<c:url value="/resources/static/scripts/stuff.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/static/scripts/app.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/static/scripts/particles.js"/>'></script>

</body>
</html>

