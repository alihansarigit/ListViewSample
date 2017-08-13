package com.androidedu.kodluyoruz.listviewsample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.androidedu.kodluyoruz.listviewsample.R;

/**
 * Created by Gökhan ÖZTÜRK
 * 13.08.2017
 * CodeProjectG@gmail.com
 */
public class RecyclerCurrencyListViewHolder extends RecyclerView.ViewHolder {

    public TextView txtCurrencyName = null, txtCurrencyAbbr = null, txtBuyValue = null, txtSellValue = null;

    public RecyclerCurrencyListViewHolder(View itemView) {
        super(itemView);

        txtCurrencyName = itemView.findViewById(R.id.adapter_item_currencylist_txtCurrencyName);
        txtCurrencyAbbr = itemView.findViewById(R.id.adapter_item_currencylist_txtCurrencyAbbr);
        txtBuyValue = itemView.findViewById(R.id.adapter_item_currencylist_txtBuyValue);
        txtSellValue = itemView.findViewById(R.id.adapter_item_currencylist_txtSellValue);
    }
}
