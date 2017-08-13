package com.androidedu.kodluyoruz.listviewsample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidedu.kodluyoruz.listviewsample.R;
import com.androidedu.kodluyoruz.listviewsample.viewmodel.CurrencyViewModel;

import java.util.ArrayList;

/**
 * Created by Gökhan ÖZTÜRK
 * 13.08.2017
 * CodeProjectG@gmail.com
 */
public class RecyclerCurrencyListAdapter extends RecyclerView.Adapter<RecyclerCurrencyListViewHolder> {

    //variable
    private ArrayList<CurrencyViewModel> currencyList = null;

    public RecyclerCurrencyListAdapter(ArrayList<CurrencyViewModel> currencyList) {

        this.currencyList = currencyList;
    }

    @Override
    public RecyclerCurrencyListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_item_currencylist, parent, false);

        return new RecyclerCurrencyListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerCurrencyListViewHolder holder, int position) {

        CurrencyViewModel selectedCurrencyViewModel = getItem(position);
//      CurrencyViewModel selectedCurrencyViewModel = currencyList.get(position);

        holder.txtCurrencyName.setText(selectedCurrencyViewModel.getCurrencyName());
        holder.txtCurrencyAbbr.setText(selectedCurrencyViewModel.getCurrencyAbbr());
        holder.txtBuyValue.setText(String.valueOf(selectedCurrencyViewModel.getBuyValue()));
        holder.txtSellValue.setText(String.valueOf(selectedCurrencyViewModel.getSellValue()));
    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    private CurrencyViewModel getItem(int position) {

        return currencyList.get(position);
    }
}
