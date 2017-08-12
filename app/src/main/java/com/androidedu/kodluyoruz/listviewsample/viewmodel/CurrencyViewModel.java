package com.androidedu.kodluyoruz.listviewsample.viewmodel;

/**
 * Created by Gökhan ÖZTÜRK
 * 12.08.2017
 * CodeProjectG@gmail.com
 */
public class CurrencyViewModel {

    private String currencyName;
    private String currencyAbbr;
    private double buyValue;
    private double sellValue;

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyAbbr() {
        return currencyAbbr;
    }

    public void setCurrencyAbbr(String currencyAbbr) {
        this.currencyAbbr = currencyAbbr;
    }

    public double getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(double buyValue) {
        this.buyValue = buyValue;
    }

    public double getSellValue() {
        return sellValue;
    }

    public void setSellValue(double sellValue) {
        this.sellValue = sellValue;
    }
}
