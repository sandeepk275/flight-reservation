package com.frs;

public class Passenger {
    private static int idCounter;
    public int id;
    public Contact contact;
    public Address address;


    static {
        idCounter = 0;
    }

    public Passenger(String street, String city,
                     String state, String name, String phone,
                     String email) {
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    public int getId() {

        return this.id;
    }
    public Address getAddress() {
        return this.address;
    }

    public Contact getContact() {
        return this.contact;
    }
}
