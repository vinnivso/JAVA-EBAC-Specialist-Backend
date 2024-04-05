package org.vinnivso.factory;

public class Customer  {
    private String request;
    private boolean companyContract;

    public Customer(String request, boolean companyContract) {
        this.request = request;
        this.companyContract = companyContract;
    }
    public boolean getCompanyContract() {
        return companyContract;
    }

    public String getRequest() {
        return request;
    }
}
