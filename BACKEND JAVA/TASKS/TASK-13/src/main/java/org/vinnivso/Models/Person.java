package org.vinnivso.Models;

import java.util.Date;

public class Person {
    private String name;
    private String birthDate;
    private String address;
    private String legalSituation;

    public Person(String name, String birthDate, String address, String legalSituation) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.legalSituation = legalSituation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLegalSituation() {
        return legalSituation;
    }

    public void setLegalSituation(String legalSituation) {
        this.legalSituation = legalSituation;
    }
}
