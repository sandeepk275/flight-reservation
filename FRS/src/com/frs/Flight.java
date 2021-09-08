package com.frs;

public class Flight {
    public String flightNumber;
    public String airLine;
    public int capacity;
    public int bookedSeat;
    public boolean availability;



    public Flight (String flightNumber, String airLine,int capacity,int bookedSeat){
        this.flightNumber=flightNumber;
        this.airLine=airLine;
        this.capacity=capacity;
        this.bookedSeat=bookedSeat;
    }


    public  String getFlightDetails(){
        return this.flightNumber+","+this.airLine+","+this.capacity+","+this.bookedSeat;
    }
    public boolean checkAvailability(){
        if(capacity-bookedSeat>0) {
            return availability=true;
        }
        return false;
    }
    public int incrementBookingCounter(){
        bookedSeat=++bookedSeat;
        return bookedSeat;
    }
}

