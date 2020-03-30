<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="home1.css" >
</head>
<body>

<div id="id01" class="modal">
  <form class="modal-content animate" method="post" action="login">

    <div class="container">
      <label for="username"><b>UserName</b></label>
      <input type="text" placeholder="Enter UserName" name="username" >

      <label for="password"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" >
        
      <input type="submit"  value ="Login">
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>      
  </form>
</div>

</body>
</html>