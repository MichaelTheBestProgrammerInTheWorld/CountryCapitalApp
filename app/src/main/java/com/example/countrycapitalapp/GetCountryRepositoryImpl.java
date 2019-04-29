package com.example.countrycapitalapp;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GetCountryRepositoryImpl implements MainContract.GetCountryRepository {

    private List<String> arrayList = Arrays.asList(
            "Egypt : Cairo",
            "Brazil : Brazilia",
            "Tunisia : Tunis",
            "Mexico : Mexico City",
            "Jordan : Amman",
            "India : Delhi"
    );

    @Override
    public void getNextCountry(final OnFinishedListener onFinishedListener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onFinishedListener.onFinished(getRandomString());
            }
        }, 1200);
    }

    private String getRandomString() {

        Random random = new Random();
        int index = random.nextInt(arrayList.size());

        return arrayList.get(index);
    }
}
