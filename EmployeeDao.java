/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;
import java.sql.*;
import java.util.*;
import com.model.EmployeeModel;


/**
 *
 * @author XYZ
 */
public class EmployeeDao {
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    List emplist;
    public EmployeeDao()
    {
        try
        {
            //load the driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=NewLibrary;user=admin;password=shaolighosh");
            
        }
        catch(Exception ee)
        {
            System.out.println("connection error"+ee);
        }
    }
   
    
    
    public List showRecord1()
    {
        List emplist1=new LinkedList();
        String emp_name=null;
        java.util.Date emp_dob;
        float emp_salary;
        int dept_id;
        String dept_name=null;
        
        try
        {
            st=con.createStatement();
            rs=st.executeQuery("select e.*, d.dept_name from Employee e left outer join Department d on e.dept_id=d.dept_id where e.employee_name='Ram'");
            while(rs.next())
            {
               
                emp_name=rs.getString("employee_name");
                emp_dob=rs.getDate("employee_dob");
                emp_salary=rs.getFloat("employee_salary");
                dept_id=rs.getInt("dept_id");
                dept_name=rs.getString("dept_name");
                
                
                EmployeeModel em1=new EmployeeModel(emp_name,emp_dob,emp_salary,dept_id,dept_name);
                emplist1.add(em1);
            }
        }
        catch(Exception ee1)
        {
            System.out.println("retrieval error"+ee1);
        }
        return emplist1;
    }
    
     public List showRecord2()
    {
        List emplist2=new LinkedList();
        String emp_name=null;
        java.util.Date emp_dob;
        float emp_salary;
        int dept_id;
        String dept_name=null;
        
        try
        {
            st=con.createStatement();
            rs=st.executeQuery("select e.*, d.dept_name from Employee e left outer join Department d on e.dept_id=d.dept_id where e.employee_name='Akash'");
            while(rs.next())
            {
               
                emp_name=rs.getString("employee_name");
                emp_dob=rs.getDate("employee_dob");
                emp_salary=rs.getFloat("employee_salary");
                dept_id=rs.getInt("dept_id");
                dept_name=rs.getString("dept_name");
                
                
                EmployeeModel em2=new EmployeeModel(emp_name,emp_dob,emp_salary,dept_id,dept_name);
                emplist2.add(em2);
            }
        }
        catch(Exception ee1)
        {
            System.out.println("retrieval error"+ee1);
        }
        return emplist2;
    }
    
      public List showRecord3()
    {
        List emplist3=new LinkedList();
        String emp_name=null;
        java.util.Date emp_dob;
        float emp_salary;
        int dept_id;
        String dept_name=null;
        
        try
        {
            st=con.createStatement();
            rs=st.executeQuery("select e.*, d.dept_name from Employee e left outer join Department d on e.dept_id=d.dept_id where e.employee_name='Bikash'");
            while(rs.next())
            {
               
                emp_name=rs.getString("employee_name");
                emp_dob=rs.getDate("employee_dob");
                emp_salary=rs.getFloat("employee_salary");
                dept_id=rs.getInt("dept_id");
                dept_name=rs.getString("dept_name");
                
                
                EmployeeModel em3=new EmployeeModel(emp_name,emp_dob,emp_salary,dept_id,dept_name);
                emplist3.add(em3);
            }
        }
        catch(Exception ee1)
        {
            System.out.println("retrieval error"+ee1);
        }
        return emplist3;
    }
      
       public List showRecord4()
    {
        List emplist4=new LinkedList();
        String emp_name=null;
        java.util.Date emp_dob;
        float emp_salary;
        int dept_id;
        String dept_name=null;
        
        try
        {
            st=con.createStatement();
            rs=st.executeQuery("select e.*, d.dept_name from Employee e left outer join Department d on e.dept_id=d.dept_id where e.employee_name='Puja'");
            while(rs.next())
            {
               
                emp_name=rs.getString("employee_name");
                emp_dob=rs.getDate("employee_dob");
                emp_salary=rs.getFloat("employee_salary");
                dept_id=rs.getInt("dept_id");
                dept_name=rs.getString("dept_name");
                
                
                EmployeeModel em4=new EmployeeModel(emp_name,emp_dob,emp_salary,dept_id,dept_name);
                emplist4.add(em4);
            }
        }
        catch(Exception ee1)
        {
            System.out.println("retrieval error"+ee1);
        }
        return emplist4;
    }
       
        public List showRecord5()
    {
        List emplist5=new LinkedList();
        String emp_name=null;
        java.util.Date emp_dob;
        float emp_salary;
        int dept_id;
        String dept_name=null;
        
        try
        {
            st=con.createStatement();
            rs=st.executeQuery("select e.*, d.dept_name from Employee e left outer join Department d on e.dept_id=d.dept_id where e.employee_name='Rose'");
            while(rs.next())
            {
               
                emp_name=rs.getString("employee_name");
                emp_dob=rs.getDate("employee_dob");
                emp_salary=rs.getFloat("employee_salary");
                dept_id=rs.getInt("dept_id");
                dept_name=rs.getString("dept_name");
                
                
                EmployeeModel em5=new EmployeeModel(emp_name,emp_dob,emp_salary,dept_id,dept_name);
                emplist5.add(em5);
            }
        }
        catch(Exception ee1)
        {
            System.out.println("retrieval error"+ee1);
        }
        return emplist5;
    }
    
        
         public List showRecord6()
    {
        List emplist6=new LinkedList();
        String emp_name=null;
        java.util.Date emp_dob;
        float emp_salary;
        int dept_id;
        String dept_name=null;
        
        try
        {
            st=con.createStatement();
            rs=st.executeQuery("select e.*, d.dept_name from Employee e left outer join Department d on e.dept_id=d.dept_id where e.employee_name='Samrat'");
            while(rs.next())
            {
               
                emp_name=rs.getString("employee_name");
                emp_dob=rs.getDate("employee_dob");
                emp_salary=rs.getFloat("employee_salary");
                dept_id=rs.getInt("dept_id");
                dept_name=rs.getString("dept_name");
                
                
                EmployeeModel em6=new EmployeeModel(emp_name,emp_dob,emp_salary,dept_id,dept_name);
                emplist6.add(em6);
            }
        }
        catch(Exception ee1)
        {
            System.out.println("retrieval error"+ee1);
        }
        return emplist6;
    }
    
    
    
    
}
