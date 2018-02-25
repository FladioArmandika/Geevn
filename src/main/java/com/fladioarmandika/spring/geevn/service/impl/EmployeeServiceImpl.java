package com.fladioarmandika.spring.geevn.service.impl;

import com.fladioarmandika.spring.geevn.dao.EmployeeDao;
import com.fladioarmandika.spring.geevn.model.Employee;
import com.fladioarmandika.spring.geevn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee getEmployee(Integer employeeId) {
        return employeeDao.getEmployee(employeeId);
    }

    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    public void deleteEmploye(Integer employeeId) {
        employeeDao.deleteEmploye(employeeId);
    }

    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }
}
