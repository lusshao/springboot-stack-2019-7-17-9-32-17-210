package com.tw.apistackbase.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Procuratorate{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 50,unique = true)
    private String procuratorateName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "procuratorate_id")
    private List<CriminalCase> criminalCaseList;

    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY, mappedBy = "procuratorate")
    private List<Procurator> procuratorList;

    public Procuratorate() {
    }

    public Procuratorate(String procuratorateName) {
        this.procuratorateName = procuratorateName;
        this.criminalCaseList = new ArrayList<>();
        this.procuratorList = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcuratorateName() {
        return procuratorateName;
    }

    public void setProcuratorateName(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }

    public List<CriminalCase> getCriminalCaseList() {
        return criminalCaseList;
    }

    public void setCriminalCaseList(List<CriminalCase> criminalCaseList) {
        this.criminalCaseList = criminalCaseList;
    }

    public List<Procurator> getProcuratorList() {
        return procuratorList;
    }

    public void setProcuratorList(List<Procurator> procuratorList) {
        this.procuratorList = procuratorList;
    }
}
