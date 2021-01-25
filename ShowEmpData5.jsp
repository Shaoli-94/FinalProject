<%-- 
    Document   : ShowEmpData
    Created on : 4 May, 2020, 7:12:41 AM
    Author     : XYZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.model.EmployeeModel"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        
    </head>
    <body>
        <div class="container">
        <h1>
            Employee Details
        </h1>
        <table class="table table-bordered">
            <thead>
            
            <tr><th>Name</th><th>Date of Birth</th><th>Salary</th><th>Department ID</th><th>Department Name</th></tr>
            </thead>
            
                <%
                    
                List l5=(List)request.getAttribute("emplist5");
                Iterator i=l5.iterator();
                while(i.hasNext())
                {
                    EmployeeModel em5=(EmployeeModel)i.next();
                    
                %>
                
                <tbody>  <tr><td><%=em5.getEmp_name()%></td><td><%=em5.getEmp_dob()%></td><td><%=em5.getSalary()%></td><td><%=em5.getDept_id()%></td><td><select><option value="opt1">Show Department Name</option><option value="opt2"><%=em5.getDept_name()%></option></select></td></tr></tbody>
                    
                <%
                    
                }

                %>
                        
        </table>
        </div>
    </body>
</html>

