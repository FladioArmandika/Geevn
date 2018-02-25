package com.fladioarmandika.spring.geevn.dao;

import com.fladioarmandika.spring.geevn.model.Employee;

import java.util.List;

public interface EmployeeDao {

    Employee getEmployee(Integer employeeId);
    List<Employee> getAllEmployee();
    void addEmployee(Employee employee);
    void deleteEmploye(Integer employeeId);
    void updateEmployee(Employee employee);

}
