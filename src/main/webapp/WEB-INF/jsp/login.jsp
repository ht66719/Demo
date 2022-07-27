<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Spring Security Example </title>
    </head>
    <body>
           <c:if test="${param.error!=null}">
           <div class="myDiv"> 
           <h1>Invalid username and password.</h1>
           </div>
        </c:if> 
        <c:if test="${param.logout}">
           <div> You have been logged out. </div>
        </c:if>
        <form:form action="/login" method="post">
            <div class="input-box"><label> User Name : <input type="text" name="username"/> </label></div>
            <div class="input-box"><label> Password:   <input type="password" name="password"/> </label></div>
            <div class="submit-button"><input type="submit" value="Sign In"/></div>
        </form:form>
        <style>
       
       form {
    left      : 50%;
    top       : 50%;
    position  : absolute;
}
.myDiv {
  border: 5px outset red;
  background-color: lightblue;
  text-align: center;
}
.input-box{
padding : 10px;
}
.submit-button{
  padding : 10px;
}
body {
   margin        : 0;
   padding       : 0;
   display       : grid;
   place-content : left;
   min-height    : 100vh;
}
        </style>
    </body>
</html>