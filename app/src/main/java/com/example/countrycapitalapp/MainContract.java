package com.example.countrycapitalapp;

public interface MainContract {

    interface MainView {
        void showProgress();

        void hideProgress();

        void setCountry(String string);
    }

    interface GetCountryRepository {
        interface OnFinishedListener {
            void onFinished(String string);
        }

        void getNextCountry(OnFinishedListener onFinishedListener);
    }

    interface Presenter {
        void onButtonClick();

        void onDestroy();
    }
}
