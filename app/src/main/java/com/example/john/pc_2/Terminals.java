package com.example.john.pc_2;

public class Terminals {

    private int namberTerminal;
    private String statusTerminal;
    private String addressTerminal;
    private int bills;
    private int cash;


    public Terminals(int namberTerminal, String statusTerminal, String addressTerminal, int bills, int cash) {
        this.namberTerminal = namberTerminal;
        this.statusTerminal = statusTerminal;
        this.addressTerminal = addressTerminal;
        this.bills = bills;
        this.cash = cash;
    }

    public int getNamberTerminal() {return namberTerminal;}

    public String getStatusTerminal() {return statusTerminal;}

    public String getAddressTerminal() {return addressTerminal;}

    public int getBills() {return bills;}

    public int getCash() {return cash;}
}
