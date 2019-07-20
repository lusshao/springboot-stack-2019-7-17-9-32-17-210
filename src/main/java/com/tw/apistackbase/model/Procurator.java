package com.tw.apistackbase.model;

import javax.persistence.*;

@Entity
@Table
public class Procurator {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Procuratorate procuratorate;

    public Procurator() {
    }

    public Procurator(String name, Procuratorate procuratorate) {
        this.name = name;
        this.procuratorate = procuratorate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
