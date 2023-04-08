<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <title>Todo Page</title>
  </head>
  <body>
    <h1>Welcome ${username}</h1>
    <div class="container">
      <h2>Enter Todo Details</h2>
      <form method="post">
        Description: <input type="text" name="description"/>
        <input type="submit" class="btn btn-success"/>
      </form>
    </div>

    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    
  </body>
</html>