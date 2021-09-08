package com.frs;

public class RegularTicket {
    private String specialServices;
    private boolean availed;

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