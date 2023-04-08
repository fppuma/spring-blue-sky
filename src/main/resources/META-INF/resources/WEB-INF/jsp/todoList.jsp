<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Todo Page</title>
  </head>
  <body>
    <h1>Welcome ${username}</h1>
    <h2>List</h2>
    <table>
      <thead>
        <tr>
          <th>id</th>
          <th>Description</th>
          <th>Target Date</th>
          <th>Done?</th>
        </tr>        
      </thead>
      <tbody>
        <c:forEach items="${todos}" var="todo">
          <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.done}</td>

          </tr>
      
        </c:forEach>
      </tbody>
    </table>

    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    
  </body>
</html>