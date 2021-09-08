package com.frs;

public class Ticket {
    public String PNR;
    public  String from;
    public String to;
    public Flight flight;
    public String departureDateTime;
    public String arrivalDateTime;
    public Passenger passenger;
    public String seatNumber;
    public float price;
    public boolean cancelled;


    public  Ticket(String PNR,String from, String to,Flight flight,String departureDateTime,
                   String arrivalDateTime,Passenger passenger,String seatNumber,float price,
                   boolean cancelled){
        this.PNR=PNR;
        this.from=from;
        this.to=to;
        this.passenger=passenger;
        this.flight=flight;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.seatNumber=seatNumber;
        this.price=price;
        this.cancelled=cancelled;
    }



    public String checkStatus(){
        if (this.cancelled==false){
            return "Confirmed";
        }
            return "cancel";
        }
        public String getFlightDetails(){
            return this.PNR+","+this.from+","+this.to+","+this.passenger+","+this.flight+","+
                    this.departureDateTime+","+this.arrivalDateTime+","+this.seatNumber+","+this.price+
                    ","+this.cancelled;
        }
        public void cancel(){
            cancelled=true;
            System.out.println("ticket cancelled");
        }
    }
