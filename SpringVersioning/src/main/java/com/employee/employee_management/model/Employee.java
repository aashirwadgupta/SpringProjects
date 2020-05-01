package com.employee.employee_management.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table (name = "employee")
public class Employee {

    @Id
    @Column(name="employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeID;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @NotNull
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    public Employee(){

    }

    public Employee(String firstName, String lastName, Department department) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    @Override
    public String toString(){
        return String.format("Employee [employeeID = %d, firstName = %s, lastName = %s, department_ID= %d", employeeID, firstName, lastName, department.getDepartment_ID());
    }
}