package com.frs;

public  class Address {
    String street, city, state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
    public String getAddressDetails(){
        return this.street + ", " + this.city + ", " + this.state;
    }
    public void updateAddressDetails(String addressDetails){
        this.street=street;
        this.city=city;
        this.state=state;
    }
}