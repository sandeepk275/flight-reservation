package com.frs;

public class TouristTicket {
    private String hotelAddress;
    private   String selectedTouristLocation;

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
