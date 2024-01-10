package org.vinnivso.Models;

import java.util.Date;

public class JuristicPerson extends Person {
    private Long ein;
    private String organizationName;
    private Double billing;
    private Long employees;
    private String activity;

    public JuristicPerson(String name, String birthDate, String address, String legalSituation, Long ein, String organizationName, Double billing, Long employees, String activity) {
        super(name, birthDate, address, legalSituation);
        this.ein = ein;
        this.organizationName = organizationName;
        this.billing = billing;
        this.employees = employees;
        this.activity = activity;
    }

    public Long getEin() {
        return ein;
    }

    public void setEin(Long ein) {
        this.ein = ein;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Double getBilling() {
        return billing;
    }

    public void setBilling(Double billing) {
        this.billing = billing;
    }

    public Long getEmployees() {
        return employees;
    }

    public void setEmployees(Long employees) {
        this.employees = employees;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "JuristicPerson{" +
                "ein=" + ein +
                ", organizationName='" + organizationName + '\'' +
                ", billing=" + billing +
                ", employees=" + employees +
                ", activity='" + activity + '\'' +
                '}';
    }
}
