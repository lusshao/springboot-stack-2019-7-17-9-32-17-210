package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table
public class CriminalCase {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String caseName;
    @Column(nullable = false)
    private Long caseTime;

    @OneToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY, mappedBy = "criminalCase")
    private CaseStructure caseStructure;


    @ManyToOne
    private Procuratorate procuratorate;

    public CriminalCase() {
    }

    public CriminalCase(String caseName, Long caseTime, CaseStructure caseStructure) {
        this.caseName = caseName;
        this.caseTime = caseTime;
        this.caseStructure = caseStructure;
    }

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

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }
}
