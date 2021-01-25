/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.*;

/**
 *
 * @author XYZ
 */
public class EmployeeModel {

    /**
     * @return the emp_name
     */
    public String getEmp_name() {
        return emp_name;
    }

    /**
     * @param emp_name the emp_name to set
     */
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    /**
     * @return the emp_dob
     */
    public Date getEmp_dob() {
        return emp_dob;
    }

    /**
     * @param emp_dob the emp_dob to set
     */
    public void setEmp_dob(Date emp_dob) {
        this.emp_dob = emp_dob;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the dept_id
     */
    public int getDept_id() {
        return dept_id;
    }

    /**
     * @param dept_id the dept_id to set
     */
    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    /**
     * @return the dept_name
     */
    public String getDept_name() {
        return dept_name;
    }

    /**
     * @param dept_name the dept_name to set
     */
    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    
   
    
    private String emp_name;
    private Date emp_dob;
    private float salary;
    private int dept_id;
    private String dept_name;

    public EmployeeModel(String emp_name, Date emp_dob, float salary, int dept_id, String dept_name) {
        this.emp_name = emp_name;
        this.emp_dob = emp_dob;
        this.salary = salary;
        this.dept_id = dept_id;
        this.dept_name = dept_name;
    }

   
    
}

