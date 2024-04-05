package org.vinnivso.Models;

import java.util.Date;

public class NaturalPerson extends Person{
    private Long ssn;
    private String lastName;
    private Long relatives;
    private Double currency;
    private String ethnicity;
    private String religion;

    public NaturalPerson(String name, String birthDate, String address, String legalSituation) {
        super(name, birthDate, address, legalSituation);
    }


    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getRelatives() {
        return relatives;
    }

    public void setRelatives(Long relatives) {
        this.relatives = relatives;
    }

    public Double getCurrency() {
        return currency;
    }

    public void setCurrency(Double currency) {
        this.currency = currency;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

}
