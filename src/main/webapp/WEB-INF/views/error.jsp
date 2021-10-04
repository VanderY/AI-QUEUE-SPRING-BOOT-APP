<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dark
  Date: 04.10.2021
  Time: 02:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
            <h1>${error}</h1>
                </p>
            <p class="lead">
                <h2> ${status}</h2>
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
