package com.employee.employee_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee_management.model.Department;
import com.employee.employee_management.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments(){
        List<Department> departmentList = departmentRepository.findAll();
        return departmentList;
    }

    public Department getDepartment(Long id){
        return departmentRepository.findById(id).get();
    }

    public void addDepartment(Department d) {
        departmentRepository.save(d);
    }

    public void updateDepartment(Department d, Long id){
        if(id == d.getDepartment_ID()) {
            departmentRepository.save(d);
        }
    }

    public void deleteAllDepartment(){
        departmentRepository.deleteAll();
    }

    public void deleteDepartmentByID(Long id){
        departmentRepository.deleteById(id);
    }

    public void patchDepartment(Department d, Long id) {
        if(id == d.getDepartment_ID()) {
            departmentRepository.save(d);
        }
    }
}
