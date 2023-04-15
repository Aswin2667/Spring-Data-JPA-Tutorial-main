package com.spring.data.jpa.serviceimpl;

import com.spring.data.jpa.entity.Employee;
import com.spring.data.jpa.repository.EmployeeRepository;
import com.spring.data.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee add successfully";
    }
}
