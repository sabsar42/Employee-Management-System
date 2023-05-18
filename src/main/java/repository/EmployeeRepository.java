package com.example.first_crud_springboot_web.repository;

import com.example.first_crud_springboot_web.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
