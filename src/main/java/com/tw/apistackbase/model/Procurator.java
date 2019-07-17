package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table(name = "procurator")
public class Procurator {
    @Id
    @GeneratedValue
    private String id;
    private String name;

    @ManyToOne
    private Procuratorate procuratorate ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }
}
