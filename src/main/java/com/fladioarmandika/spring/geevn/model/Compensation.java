package com.fladioarmandika.spring.geevn.model;

import javax.persistence.*;

@Entity
@Table(name = "compensation")
public class Compensation {

    @Id
    @Column
    @OneToOne
    private int employeeId;
    @Column
    private String title;
    @Column
    private String employeeType;
    @Column
    private int amount;
    @Column
    private String bankAccount;

    @OneToOne(mappedBy = "employee")
    private Employee employee;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
