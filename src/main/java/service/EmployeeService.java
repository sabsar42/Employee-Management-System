package com.example.first_crud_springboot_web.service;

import com.example.first_crud_springboot_web.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
