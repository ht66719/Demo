<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <head>
        <title>Hello World!</title>
    </head>
    <body>
        <h1 inline="text">Hello <%= request.getRemoteUser() %>!</h1>
        <form:form action="/logout" method="post">
            <input type="submit" value="Sign Out"/>
        </form:form>
        
                <p><a href="/home">HOME</a></p>
                
    </body>
    
    
</html>