package com.androidedu.kodluyoruz.listviewsample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.androidedu.kodluyoruz.listviewsample.R;
import com.androidedu.kodluyoruz.listviewsample.adapter.CurrencyListAdapter;
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

        generateDummyList();

        CurrencyListAdapter currencyListAdapter = new CurrencyListAdapter(this, R.layout.adapter_item_currencylist, currencyList);

        lstCurrency.setAdapter(currencyListAdapter);
    }

    private void generateDummyList() {

        currencyList = new ArrayList<>();

        CurrencyViewModel currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Amerikan Doları");
        currencyViewModel.setCurrencyAbbr("USD");
        currencyViewModel.setBuyValue(1.25);
        currencyViewModel.setSellValue(1.20);

        currencyList.add(currencyViewModel);

        currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Turkish Liras");
        currencyViewModel.setCurrencyAbbr("TL");
        currencyViewModel.setBuyValue(1.50);
        currencyViewModel.setSellValue(1.40);

        currencyList.add(currencyViewModel);

        currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Europe Money");
        currencyViewModel.setCurrencyAbbr("Eur");
        currencyViewModel.setBuyValue(1.21);
        currencyViewModel.setSellValue(1.18);

        currencyList.add(currencyViewModel);

        currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Amerikan Doları");
        currencyViewModel.setCurrencyAbbr("USD");
        currencyViewModel.setBuyValue(1.25);
        currencyViewModel.setSellValue(1.20);

        currencyList.add(currencyViewModel);

        currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Turkish Liras");
        currencyViewModel.setCurrencyAbbr("TL");
        currencyViewModel.setBuyValue(1.50);
        currencyViewModel.setSellValue(1.40);

        currencyList.add(currencyViewModel);

        currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Europe Money");
        currencyViewModel.setCurrencyAbbr("Eur");
        currencyViewModel.setBuyValue(1.21);
        currencyViewModel.setSellValue(1.18);

        currencyList.add(currencyViewModel);

        currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Amerikan Doları");
        currencyViewModel.setCurrencyAbbr("USD");
        currencyViewModel.setBuyValue(1.25);
        currencyViewModel.setSellValue(1.20);

        currencyList.add(currencyViewModel);

        currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Turkish Liras");
        currencyViewModel.setCurrencyAbbr("TL");
        currencyViewModel.setBuyValue(1.50);
        currencyViewModel.setSellValue(1.40);

        currencyList.add(currencyViewModel);

        currencyViewModel = new CurrencyViewModel();
        currencyViewModel.setCurrencyName("Europe Money");
        currencyViewModel.setCurrencyAbbr("Eur");
        currencyViewModel.setBuyValue(1.21);
        currencyViewModel.setSellValue(1.18);

        currencyList.add(currencyViewModel);
    }
}
