package com.frs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Passenger newPassenger = new Passenger("kholi", "bali", "puducheri", "kamla", "124421",
                "ktch@gmail.com");

        Ticket ticket1 = new Ticket("1234", "mumbai", "goa", null, "12:30",
                "1:20", null, "q123", 3025, false);


    Flight flight = new Flight("q231", "indigo", 145, 120);
    System.out.println(ticket1.getPNR());
        System.out.println(flight.getFlightDetails());
        System.out.println(newPassenger.getContactDetails());
}
}
