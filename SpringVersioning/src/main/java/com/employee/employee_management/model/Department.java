package com.employee.employee_management.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="department")
public class Department {

    @Id
    @Column(name="department_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long department_ID;
    private String short_Name;
    private String department_Name;

    public Department() {
    }

    public Department(Long departmentID){
        super();
        this.department_ID = departmentID;
    }

    public Department(Long departmentID, String short_Name, String department_Name) {
        super();
        this.department_ID = departmentID;
        this.short_Name = short_Name;
        this.department_Name = department_Name;
    }
}