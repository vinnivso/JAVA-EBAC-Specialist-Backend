package com.ebac.animalservice.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Caretaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String contact;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private Date contractStart;
    @Column
    private Date contractEnd;

    @OneToMany(mappedBy = "caretaker")
    private List<Animal> animals;

    //#region Getters and Setters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getContractStart() {
        return contractStart;
    }

    public void setContractStart(Date contractStart) {
        this.contractStart = contractStart;
    }

    public Date getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(Date contractEnd) {
        this.contractEnd = contractEnd;
    }
    //#endregion Getters and Setters
}
