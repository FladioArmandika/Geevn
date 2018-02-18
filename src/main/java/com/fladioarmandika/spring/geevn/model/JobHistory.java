package com.fladioarmandika.spring.geevn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "JobHistory")
public class JobHistory {

    @Id
    @Column
    private int jobHistoryId;
    @Column
    private int employeeId;
    @Column
    private String companyName;
    @Column
    private String position;
    @Column
    private Date dateJoined;
    @Column
    private Date dateResign;

    public int getJobHistoryId() {
        return jobHistoryId;
    }

    public void setJobHistoryId(int jobHistoryId) {
        this.jobHistoryId = jobHistoryId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Date getDateResign() {
        return dateResign;
    }

    public void setDateResign(Date dateResign) {
        this.dateResign = dateResign;
    }
}
