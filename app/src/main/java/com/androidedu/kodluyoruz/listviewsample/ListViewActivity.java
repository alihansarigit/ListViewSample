package com.androidedu.kodluyoruz.listviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //view component
    private ListView lstCities = null;

    //variable
    private ArrayList<String> cityList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        initView();
        initEvent();
    }

    private void initView() {

        lstCities = (ListView) findViewById(R.id.activity_list_view_lstCities);
    }

    private void initEvent() {

        generateDummyList();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cityList);

        lstCities.setAdapter(adapter);

        lstCities.setOnItemClickListener(this);
    }

    private void generateDummyList() {

        cityList = new ArrayList<>();

        cityList.add("İstanbul");
        cityList.add("Ankara");
        cityList.add("Suvas");
        cityList.add("Kars");
        cityList.add("Hakkari");
        cityList.add("Antalya");
        cityList.add("Giresun");
        cityList.add("İzmir");
        cityList.add("Kocaeli");
        cityList.add("Samsun");
        cityList.add("İstanbul");
        cityList.add("Ankara");
        cityList.add("Suvas");
        cityList.add("Kars");
        cityList.add("Hakkari");
        cityList.add("Antalya");
        cityList.add("Giresun");
        cityList.add("İzmir");
        cityList.add("Kocaeli");
        cityList.add("Samsun");
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Toast.makeText(this, "Şehir: " + cityList.get(position), Toast.LENGTH_SHORT).show();
    }
}
