package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table(name = "case")
public class CriminalCase {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String caseName;
    @Column(nullable = false)
    private Long caseTime;

    @OneToOne(cascade = CascadeType.ALL , mappedBy = "criminalCase")
    private CaseStructure caseStructure;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Long getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(Long caseTime) {
        this.caseTime = caseTime;
    }

    public CaseStructure getCaseStructure() {
        return caseStructure;
    }

    public void setCaseStructure(CaseStructure caseStructure) {
        this.caseStructure = caseStructure;
    }

}
