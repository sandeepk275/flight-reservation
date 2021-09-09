package com.frs;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Passenger newPassenger = new Passenger("kholi", "bali", "puducheri", "kamla", "124421",
                "ktch@gmail.com");
        Ticket ticket1 = new Ticket("1234", "mumbai", "goa", null, "12:30",
                "1:20", newPassenger, "q123", 3025, false);
        Flight flight1 = new Flight("q231", "indigo", 145, 120);

        System.out.println(flight1.getFlightDetails());
        System.out.println(newPassenger.getContactDetails());
        RegularTicket regularTicket = new RegularTicket("98765", "delhi", "mumbai", flight1,
                "12:00", "12:00", newPassenger, "s2", 5030,
                false, "yes");
        TouristTicket touristTicket=new TouristTicket("34523","mumbai","goa",flight1,
                "3:00","4:00",newPassenger,"d47", 2075,
                false,"baga beach","calangute");


        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPNR());
    }
}

