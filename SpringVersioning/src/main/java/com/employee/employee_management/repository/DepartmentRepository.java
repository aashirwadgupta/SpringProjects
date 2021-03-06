package com.employee.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.employee_management.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}