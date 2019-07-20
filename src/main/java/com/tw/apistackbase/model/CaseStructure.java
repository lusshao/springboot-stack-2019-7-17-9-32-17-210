package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table
public class CaseStructure {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String objectiveEssentials;
    @Column(nullable = false)
    private String subjectiveEssentials;

    @OneToOne
    private CriminalCase criminalCase;


    public CaseStructure() {
    }

    public CaseStructure(String objectiveEssentials, String subjectiveEssentials) {
        this.objectiveEssentials = objectiveEssentials;
        this.subjectiveEssentials = subjectiveEssentials;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjectiveEssentials() {
        return objectiveEssentials;
    }

    public void setObjectiveEssentials(String objectiveEssentials) {
        this.objectiveEssentials = objectiveEssentials;
    }

    public String getSubjectiveEssentials() {
        return subjectiveEssentials;
    }

    public void setSubjectiveEssentials(String subjectiveEssentials) {
        this.subjectiveEssentials = subjectiveEssentials;
    }

    public CriminalCase getCaseId() {
        return criminalCase;
    }

    public void setCaseId(CriminalCase criminalCaseId) {
        this.criminalCase = criminalCaseId;
    }
}
