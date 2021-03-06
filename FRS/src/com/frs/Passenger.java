package com.frs;

public class Passenger {
    private static int idCounter = 0;
    private int id;

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Address address;

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    private Contact contact;


    public Passenger(String street, String city,
                     String state, String name, String phone,
                     String email) {
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    public int getPassengerCount() {
        return this.id;
    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }
    public void updateAddressDetails(String street, String city, String state) {
        address.street = street;
        address.city = city;
        address.state = state;
    }

        public String getContactDetails () {
            return contact.name + ", " + contact.phone + ", " + contact.email;
        }
        public void updateContactDetails (String name, String phone, String email){
            contact.name = name;
            contact.phone = phone;
            contact.email = email;
        }
    }

