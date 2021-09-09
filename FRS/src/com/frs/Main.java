package com.frs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Passenger newPassenger = new Passenger("kholi", "bali", "puducheri", "kamla", "124421",
                "ktch@gmail.com");
        Ticket ticket1 = new Ticket("1234", "mumbai", "goa", null, "12:30",
                "1:20", null, "q123", 3025, false);



    Flight flight1 = new Flight("q231", "indigo", 145, 120);

        System.out.println(flight1.getFlightDetails());
        System.out.println(newPassenger.getContactDetails());
        RegularTicket ticket2=new RegularTicket("98765","delhi","mumbai",flight1,
                "12:00","12:00",newPassenger,"s2",5030,
                false,"yes");
        System.out.println(ticket2.getPNR());
        System.out.println(ticket2.getFlightDetails());
}
}
