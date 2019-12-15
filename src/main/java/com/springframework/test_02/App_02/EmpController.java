package com.springframework.test_02.App_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
class EmpController {
    @Autowired
    private EmpServices empServices;

    @RequestMapping("/emp")
    public List<Employee> empDetails(){
        return empServices.getEmp();
    }
}
