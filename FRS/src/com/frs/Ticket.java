package com.frs;

public  class Ticket {
    private String PNR;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private String seatNumber;
    private float price;
    private boolean cancelled;


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
    public String getPNR(){

        return this.PNR;
    }
    public void setPNR(String PNR){
        this.PNR=PNR;
    }
    public String getFrom(){
        return this.from;
    }
    public void setFrom(String from){
        this.from=from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String checkStatus(){
        if (isCancelled()==false){
            return "Confirmed";
        }
            return "cancel";
        }
        public  String getFlightDetails(){
            return this.getPNR()+","+this.getFrom()+","+this.getTo()+","+this.getPassenger()+","
                    +this.getFlight()+","+ this.getDepartureDateTime()+","+this.getArrivalDateTime()+","+
                    this.getSeatNumber()+"," +this.getPrice()+ ","+this.isCancelled();
        }
        public void cancel(){
            cancelled=true;
            System.out.println("ticket cancelled");
    }

    }

