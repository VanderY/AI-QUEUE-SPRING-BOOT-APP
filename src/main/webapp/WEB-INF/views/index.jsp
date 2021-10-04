<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dark
  Date: 06.09.2021
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" class="h-100">
<head>
    <title>Queue.ai - new rules, new us.</title>
    <c:import url="links.jsp"></c:import>
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

            <p class="lead">
            <form method="post" action="/schedule/date" id="groupForm" hidden>
                <div id="groupSelect">
                    <p class="h1 mb-3">Select your group:</p>
                    <div class="mb-3">
                        <select id="select" name="group" class="form-select">
                            <option value="921701">921701</option>
                            <option value="921702">921702</option>
                            <option value="921703">921703</option>
                            <option value="921704">921704</option>
                        </select>
                    </div>
                    <a class="btn btn-lg btn-secondary fw-bold border-white bg-white text-dark-50" onclick="showDate()">Get
                        started</a>
                    </p>
                </div>
                <div id="dateForm" hidden>
                    <p class="h1 mb-3">Select date:</p>
                    <div class="mb-3">
                        <input name="date" class="form-select" type="text" value="Select date" onfocus="(this.type='date')" onblur="(this.type='text')">
                    </div>
                    <button style="width: 100%" class="btn btn-lg btn-secondary bg-white text-dark-50 custom-shit"> Submit
                    </button>
                </div>
            </form>
            </p>

            <div id="getStartedButton">
                <p class="lead">
                <h1>No fights. No misunderstandings.</h1>
                <a class="btn btn-lg btn-secondary fw-bold border-white bg-white text-dark-50" onclick="showForm()">Get
                    started</a>
                </p>
            </div>

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
