package com.employee.employee_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.employee_management.model.Employee;
import com.employee.employee_management.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
        return employeeList;
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).get();
    }

    public void addEmployee(Employee e) {
        employeeRepository.save(e);
    }

    public void updateEmployee(Employee emp, Long id) {
        if (id == emp.getEmployeeID()) {
            employeeRepository.save(emp);
        }
    }

    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }

    public void deleteEmployeeByID(Long id) {
        employeeRepository.deleteById(id);
    }

    public void patchEmployee(Employee emp, Long id) {
        if (id == emp.getEmployeeID()) {
            employeeRepository.save(emp);
        }
    }
}