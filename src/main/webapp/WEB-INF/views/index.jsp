<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dark
  Date: 06.09.2021
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:import url="links.jsp"></c:import>
    <title>AI QUEUE</title>
</head>
<body>
 <div class="container">
     <div class="row" style="margin-top: 150px">
         <div class="col-6 offset-3">
          <div class="card text-center">
              <form class="m-4" method="post" action="/schedule" >
                  <label for="groupSelect" class="mb-2 h3">Select your group</label></br>
                  <select class="mb-2" id="groupSelect" name="group">
                      <option value="921701">921701</option>
                      <option value="921702">921702</option>
                      <option value="921703">921703</option>
                      <option value="921704">921704</option>
                  </select> </br>
                  <button type="submit" class="btn btn-success">Submit</button>
              </form>
          </div>
         </div>
     </div>
 </div>
</body>
</html>
