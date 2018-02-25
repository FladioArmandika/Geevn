package com.fladioarmandika.spring.geevn.dao.hibernate;

import com.fladioarmandika.spring.geevn.dao.EmployeeDao;
import com.fladioarmandika.spring.geevn.model.Employee;
import com.fladioarmandika.spring.geevn.utils.ModelAttributeGenerator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoHibernate implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Employee getEmployee(Integer employeeId) {
        Employee employee = sessionFactory.getCurrentSession().load(Employee.class,employeeId);
        System.out.println(employee.getEmployeeName());
        return employee;
    }

    public List<Employee> getAllEmployee() {
        return sessionFactory.getCurrentSession().createQuery("from Employee")
                .list();
    }

    public void addEmployee(Employee employee) {
        int randomId = ModelAttributeGenerator.generateId();
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }

    public void deleteEmploye(Integer employeeId) {
        Employee employee = (Employee) sessionFactory.getCurrentSession()
                .load(Employee.class,employeeId);
        if (employee != null) {
            this.sessionFactory.getCurrentSession().delete(employee);
        }
    }

    public void updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
    }
}
