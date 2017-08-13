package com.androidedu.kodluyoruz.listviewsample.adapter;

import android.content.Context;
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
public class CurrencyListAdapter extends ArrayAdapter<CurrencyViewModel> {

    //variable
    private ArrayList<CurrencyViewModel> currencyList = null;

    public CurrencyListAdapter(@NonNull Context context, ArrayList<CurrencyViewModel> currencyList) {
        super(context, R.layout.adapter_item_currencylist, currencyList);

        this.currencyList = currencyList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CurrencyListViewHolder currencyListViewHolder;

        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item_currencylist, parent, false);

            currencyListViewHolder = new CurrencyListViewHolder();

            currencyListViewHolder.setTxtCurrencyName((TextView) convertView.findViewById(R.id.adapter_item_currencylist_txtCurrencyName));
            currencyListViewHolder.setTxtCurrencyAbbr((TextView) convertView.findViewById(R.id.adapter_item_currencylist_txtCurrencyAbbr));
            currencyListViewHolder.setTxtCurrencyBuyValue((TextView) convertView.findViewById(R.id.adapter_item_currencylist_txtBuyValue));
            currencyListViewHolder.setTxtCurrencySellValue((TextView) convertView.findViewById(R.id.adapter_item_currencylist_txtSellValue));

            convertView.setTag(currencyListViewHolder);
        } else {
            currencyListViewHolder = (CurrencyListViewHolder) convertView.getTag();
        }

        CurrencyViewModel selectedCurrencyViewModel = getItem(position);
//      CurrencyViewModel selectedCurrencyViewModel = currencyList.get(position);

        currencyListViewHolder.getTxtCurrencyName().setText(selectedCurrencyViewModel.getCurrencyName());
        currencyListViewHolder.getTxtCurrencyAbbr().setText(selectedCurrencyViewModel.getCurrencyAbbr());
        currencyListViewHolder.getTxtCurrencyBuyValue().setText(String.valueOf(selectedCurrencyViewModel.getBuyValue()));
        currencyListViewHolder.getTxtCurrencySellValue().setText(String.valueOf(selectedCurrencyViewModel.getSellValue()));

        return convertView;
    }
}
