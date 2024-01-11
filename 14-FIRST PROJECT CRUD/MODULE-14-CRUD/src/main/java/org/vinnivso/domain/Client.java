package org.vinnivso.domain;

import java.util.Objects;

public class Client {
    private String name;
    private Long ssn;
    private Long telephone;
    private String address;
    private Integer addressNumber;
    private String city;
    private String state;

    public Client(String name, String ssn, String telephone, String address, String addressNumber, String city, String state) {
        this.name = name;
        this.ssn = Long.valueOf(ssn.trim());
        this.telephone = Long.valueOf(telephone.trim());
        this.address = address;
        this.addressNumber = Integer.valueOf(addressNumber.trim());
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public Long getSsn() {
        return ssn;
    }

    public Long getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    //SEMPRE QUE TRABALHARMOS COM MAP E SET É NECESSÁRIO UM HASH PARA RECURSO COMPARATIVO.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", ssn=" + ssn +
                '}';
    }
}
