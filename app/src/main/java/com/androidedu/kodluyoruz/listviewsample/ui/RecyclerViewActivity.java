package com.androidedu.kodluyoruz.listviewsample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.androidedu.kodluyoruz.listviewsample.R;
import com.androidedu.kodluyoruz.listviewsample.adapter.RecyclerCurrencyListAdapter;
import com.androidedu.kodluyoruz.listviewsample.dummydata.GenerateDummyData;
import com.androidedu.kodluyoruz.listviewsample.viewmodel.CurrencyViewModel;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    //view component
    private RecyclerView recyCurrencyList = null;

    //variable
    private ArrayList<CurrencyViewModel> currencyList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initView();
    }

    private void initView() {

        recyCurrencyList = (RecyclerView) findViewById(R.id.activity_recycler_view_recyCurrencyList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyCurrencyList.setLayoutManager(mLayoutManager);
        recyCurrencyList.setItemAnimator(new DefaultItemAnimator());

        currencyList = GenerateDummyData.generateDummyList();

        RecyclerCurrencyListAdapter adapter = new RecyclerCurrencyListAdapter(currencyList);

        recyCurrencyList.setAdapter(adapter);
    }
}
