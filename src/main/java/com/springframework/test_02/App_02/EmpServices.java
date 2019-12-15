package com.springframework.test_02.App_02;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmpServices {

    private List<Employee> emp =  Arrays.asList(
            new Employee(001, "Nimal", "Premarathna", 20000, "HR"),
            new Employee(005, "Kumara", "Dalupotha", 50000, "IT")
        );

    public List<Employee> getEmp(){
        return emp;
    }
}
