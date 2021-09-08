package com.frs;

public class RegularTicket {
    public  String specialServices;
    public boolean availed;

    public String getCheckAvailed(){
        if(availed==true){
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