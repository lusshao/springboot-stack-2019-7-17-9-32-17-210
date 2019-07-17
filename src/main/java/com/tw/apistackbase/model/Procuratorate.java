package com.tw.apistackbase.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "procuratorate")
public class Procuratorate{
    @Id
    @GeneratedValue
    private String id;

    private String procuratorateName;

    @OneToMany
    @JoinColumn(name = "procuratorate_Id")
    private List<Case> caseList;

    @OneToMany
    @JoinColumn(name = "procuratorate_Id")
    private List<Procurator> procuratorList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcuratorateName() {
        return procuratorateName;
    }

    public void setProcuratorateName(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }

    public List<Case> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<Case> caseList) {
        this.caseList = caseList;
    }

    public List<Procurator> getProcuratorList() {
        return procuratorList;
    }

    public void setProcuratorList(List<Procurator> procuratorList) {
        this.procuratorList = procuratorList;
    }
}
