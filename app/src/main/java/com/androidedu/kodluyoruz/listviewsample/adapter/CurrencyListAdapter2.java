package com.androidedu.kodluyoruz.listviewsample.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.androidedu.kodluyoruz.listviewsample.R;
import com.androidedu.kodluyoruz.listviewsample.viewmodel.CurrencyViewModel;

import java.util.ArrayList;

/**
 * Created by Gökhan ÖZTÜRK
 * 12.08.2017
 * CodeProjectG@gmail.com
 */
public class CurrencyListAdapter2 extends ArrayAdapter<CurrencyViewModel> {

    //variable
    private ArrayList<CurrencyViewModel> currencyList = null;

    public CurrencyListAdapter2(@NonNull Context context, @LayoutRes int resource, ArrayList<CurrencyViewModel> currencyList) {
        super(context, resource, currencyList);

        this.currencyList = currencyList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item_currencylist, parent, false);
        }

        TextView txtCurrencyName = convertView.findViewById(R.id.adapter_item_currencylist_txtCurrencyName);
        TextView txtCurrencyAbbr = convertView.findViewById(R.id.adapter_item_currencylist_txtCurrencyAbbr);
        TextView txtBuyValue = convertView.findViewById(R.id.adapter_item_currencylist_txtBuyValue);
        TextView txtSellValue = convertView.findViewById(R.id.adapter_item_currencylist_txtSellValue);


        CurrencyViewModel selectedCurrencyViewModel = getItem(position);
//      CurrencyViewModel selectedCurrencyViewModel = currencyList.get(position);

        txtCurrencyName.setText(selectedCurrencyViewModel.getCurrencyName());
        txtCurrencyAbbr.setText(selectedCurrencyViewModel.getCurrencyAbbr());
        txtBuyValue.setText(String.valueOf(selectedCurrencyViewModel.getBuyValue()));
        txtSellValue.setText(String.valueOf(selectedCurrencyViewModel.getSellValue()));

        return convertView;
    }
}
