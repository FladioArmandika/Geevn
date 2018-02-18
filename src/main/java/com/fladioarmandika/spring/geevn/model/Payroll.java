package com.fladioarmandika.spring.geevn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "payroll")
public class Payroll {

    @Id
    @Column
    private int payrollId;
    @Column
    private int employeeId;
    @Column
    private Date datePayroll;
    @Column
    private int amount;

    public int getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(int payrollId) {
        this.payrollId = payrollId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDatePayroll() {
        return datePayroll;
    }

    public void setDatePayroll(Date datePayroll) {
        this.datePayroll = datePayroll;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
