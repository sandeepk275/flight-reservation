package com.frs;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private   String selectedTouristLocation;

    public  TouristTicket(String PNR,String from, String to,Flight flight,String departureDateTime,
                   String arrivalDateTime,Passenger passenger,String seatNumber,float price,
                   boolean cancelled,String hotelAddress,String selectedTouristLocation){
        super(PNR,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNumber,price,cancelled);
this.getSelectedTouristLocation();
this.getHotelAddress();
    }

    public  String getHotelAddress(){
        return this.hotelAddress;
    }
    public void setHotelAddress(String hotelAddress){
        this.hotelAddress=hotelAddress;
    }
    public String getSelectedTouristLocation(){
        String getTour[]=new String[5];
        return selectedTouristLocation;
    }
    public void removeTouristLocation(String touristLocation){
        this.selectedTouristLocation=touristLocation;

    }

    }
