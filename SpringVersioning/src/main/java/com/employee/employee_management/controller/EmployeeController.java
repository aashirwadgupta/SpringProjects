package com.employee.employee_management.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee_management.model.Employee;
import com.employee.employee_management.service.EmployeeService;

@RestController
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public void addEmployees(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee e, @PathVariable Long id){
        employeeService.updateEmployee(e, id);
    }

    @DeleteMapping("/employees")
    public void deleteAllEmployees(){
        employeeService.deleteAllEmployees();
    }

    @DeleteMapping("employees/{id}")
    public void deleteEmployeeByID(@RequestBody Employee e, @PathVariable Long id){
        employeeService.deleteEmployeeByID(id);
    }

    @PatchMapping("employees/{id}")
    public void patchEmployeeByID(@RequestBody Employee e, @PathVariable Long id) {
        employeeService.patchEmployee(e, id);
    }
}
