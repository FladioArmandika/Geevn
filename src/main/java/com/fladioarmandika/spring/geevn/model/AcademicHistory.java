package com.fladioarmandika.spring.geevn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "academicHistory")
public class AcademicHistory {

    @Id
    @Column
    private int academicHistory;
    @Column
    private int employeeId;
    @Column
    private String organization;
    @Column
    private String levelAttained;
    @Column
    private String disclipine;
    @Column
    private Date dateJoined;
    @Column
    private Date dateGraduate;
    @Column
    private String description;


    public int getAcademicHistory() {
        return academicHistory;
    }

    public void setAcademicHistory(int academicHistory) {
        this.academicHistory = academicHistory;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getLevelAttained() {
        return levelAttained;
    }

    public void setLevelAttained(String levelAttained) {
        this.levelAttained = levelAttained;
    }

    public String getDisclipine() {
        return disclipine;
    }

    public void setDisclipine(String disclipine) {
        this.disclipine = disclipine;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Date getDateGraduate() {
        return dateGraduate;
    }

    public void setDateGraduate(Date dateGraduate) {
        this.dateGraduate = dateGraduate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
