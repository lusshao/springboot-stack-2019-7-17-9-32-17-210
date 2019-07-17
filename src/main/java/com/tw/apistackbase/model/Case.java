package com.tw.apistackbase.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "case")
public class Case {

    @Id
    @GeneratedValue
    private String id;

    private String caseName;
    private Timestamp caseTime;

    @OneToOne
    private CaseStructure caseStructure;
    @ManyToOne
    private Procuratorate procuratorate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Timestamp getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(Timestamp caseTime) {
        this.caseTime = caseTime;
    }

    public CaseStructure getCaseStructure() {
        return caseStructure;
    }

    public void setCaseStructure(CaseStructure caseStructure) {
        this.caseStructure = caseStructure;
    }

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }
}
