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
                    
                List l4=(List)request.getAttribute("emplist4");
                Iterator i=l4.iterator();
                while(i.hasNext())
                {
                    EmployeeModel em4=(EmployeeModel)i.next();
                    
                %>
                
                <tbody>  <tr><td><%=em4.getEmp_name()%></td><td><%=em4.getEmp_dob()%></td><td><%=em4.getSalary()%></td><td><%=em4.getDept_id()%></td><td><select><option value="opt1">Show Department Name</option><option value="opt2"><%=em4.getDept_name()%></option></select></td></tr></tbody>
                    
                <%
                    
                }

                %>
                        
        </table>
        </div>
    </body>
</html>

