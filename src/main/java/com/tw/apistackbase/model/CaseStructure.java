package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table(name = "caseStructure")
public class CaseStructure {
    @Id
    @GeneratedValue
    private String id;

    private String objectiveEssentials;
    private String subjectiveEssentials;


    public String getId() {
        return id;
    }

    public void setId(String id) {
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

}
