package com.spring.data.jpa.controller;

import com.spring.data.jpa.entity.Employee;
import com.spring.data.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("api")
    public String addEmployee(@RequestBody Employee employee){
        System.out.println("hell0o");
        return employeeService.addEmployee(employee);
    }

}
