package com.employee.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee_management.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
