package com.androidedu.kodluyoruz.listviewsample.adapter;

import android.widget.TextView;

/**
 * Created by Gökhan ÖZTÜRK
 * 13.08.2017
 * CodeProjectG@gmail.com
 */
public class CurrencyListViewHolder {

    private TextView txtCurrencyName;
    private TextView txtCurrencyAbbr;
    private TextView txtCurrencyBuyValue;
    private TextView txtCurrencySellValue;

    public TextView getTxtCurrencyName() {
        return txtCurrencyName;
    }

    public void setTxtCurrencyName(TextView txtCurrencyName) {
        this.txtCurrencyName = txtCurrencyName;
    }

    public TextView getTxtCurrencyAbbr() {
        return txtCurrencyAbbr;
    }

    public void setTxtCurrencyAbbr(TextView txtCurrencyAbbr) {
        this.txtCurrencyAbbr = txtCurrencyAbbr;
    }

    public TextView getTxtCurrencyBuyValue() {
        return txtCurrencyBuyValue;
    }

    public void setTxtCurrencyBuyValue(TextView txtCurrencyBuyValue) {
        this.txtCurrencyBuyValue = txtCurrencyBuyValue;
    }

    public TextView getTxtCurrencySellValue() {
        return txtCurrencySellValue;
    }

    public void setTxtCurrencySellValue(TextView txtCurrencySellValue) {
        this.txtCurrencySellValue = txtCurrencySellValue;
    }
}
