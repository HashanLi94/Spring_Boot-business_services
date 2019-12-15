package com.springframework.test_02.App_02;

public class Employee {
    private int emp_id;
    private String f_name;
    private String l_name;
    private int salary;

    public Employee() {

    }

    public Employee(int emp_id, String f_name, String l_name, int salary, String department) {
        this.emp_id = emp_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.salary = salary;
        this.department = department;
    }

    private String department;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
