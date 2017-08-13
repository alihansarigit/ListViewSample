package com.androidedu.kodluyoruz.listviewsample.dummydata;

import com.androidedu.kodluyoruz.listviewsample.viewmodel.CurrencyViewModel;

import java.util.ArrayList;

/**
 * Created by Gökhan ÖZTÜRK
 * 13.08.2017
 * CodeProjectG@gmail.com
 */
public class GenerateDummyData {

    public static ArrayList<CurrencyViewModel> generateDummyList() {

        ArrayList<CurrencyViewModel> currencyList = new ArrayList<>();

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

        return currencyList;
    }
}
