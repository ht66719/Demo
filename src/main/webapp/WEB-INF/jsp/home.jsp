<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <head>
        <title>Spring Security Example</title>
    </head>
    <body>
        <h1>Welcome!</h1>
        
        <%
        

    if(hasRole("ROLE_ADMIN")){
     out.println("<h2>Click <a href="+"/admin"+">Here</a> To See Admin Info</h2>");
      out.println("<h2>Click <a href="+"/cust"+">Here</a> To See Cust Info</h2>");
       out.println("<h2>Click <a href="+"/user"+">Here</a> To See User Info</h2>");
        out.println("<h2>Click <a href="+"/emp"+">Here</a> To See Emp Info</h2>");
    }
    else if(hasRole("ROLE_CUST")){
    out.println("<h2>Click <a href="+"/cust"+">Here</a> To See Cust Info</h2>");
    }
    else if(hasRole("ROLE_EMP")){
     out.println("<h2>Click <a href="+"/emp"+">Here</a> To See Emp Info</h2>");
    }
    else if(hasRole("ROLE_USER")){
    out.println("<h2>Click <a href="+"/user"+">Here</a> To See User Info</h2>");
    }
    else{      
   out.println("<h2>Click <a href="+"/hello"+">Here</a> To See Greeting</h2>");
   
    }
    
 
    %>
    
    <%!
    
    
           public  boolean hasRole (String roleName)
{
    return org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
            .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals(roleName));
}
    %>
        
       
       <form:form action="/logout" method="post">
            <input type="submit" value="Sign Out"/>
        </form:form>
    </body>
    <style>
    
    </style>
    
</html>