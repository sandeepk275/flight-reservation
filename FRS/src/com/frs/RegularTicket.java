package com.frs;

public  class RegularTicket extends Ticket{
    private String specialServices;
    private boolean availed;

    public RegularTicket (String PNR,String from, String to,Flight flight,String departureDateTime,
                   String arrivalDateTime,Passenger passenger,String seatNumber,float price,
                   boolean cancelled ,String specialServices){
        super(PNR,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNumber,price,cancelled);
        this.getCheckAvailed();
        this.getSpecialServices();
        this.updateSpecialServices("luxury");
    }

    public boolean isAvailed() {
        return availed;
    }
    public String getCheckAvailed(){
        if(isAvailed()==true){
            return getSpecialServices();
        }
        return null;
    }

    public  String getSpecialServices(){
        return this.specialServices;
    }
    public  void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }
}