package com.androidedu.kodluyoruz.listviewsample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.androidedu.kodluyoruz.listviewsample.R;
import com.androidedu.kodluyoruz.listviewsample.adapter.CurrencyListAdapter;
import com.androidedu.kodluyoruz.listviewsample.dummydata.GenerateDummyData;
import com.androidedu.kodluyoruz.listviewsample.viewmodel.CurrencyViewModel;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    //view component
    private ListView lstCurrency = null;

    //variable
    private ArrayList<CurrencyViewModel> currencyList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_custom_list_view);

        initView();
        initEvent();
    }

    private void initView() {

        lstCurrency = (ListView) findViewById(R.id.activity_custom_list_lstCurrency);
    }

    private void initEvent() {

        currencyList = GenerateDummyData.generateDummyList();

        CurrencyListAdapter currencyListAdapter = new CurrencyListAdapter(this, currencyList);

        lstCurrency.setAdapter(currencyListAdapter);
    }
}
