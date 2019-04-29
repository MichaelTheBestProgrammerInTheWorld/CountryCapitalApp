package com.example.countrycapitalapp;

public class MainPresenterImpl implements MainContract.Presenter,
        MainContract.GetCountryRepository.OnFinishedListener {

    private MainContract.MainView mainView;
    private MainContract.GetCountryRepository getCountryRepository;

    MainPresenterImpl (MainContract.MainView mainView, MainContract.GetCountryRepository getCountryRepository) {
        this.mainView = mainView;
        this.getCountryRepository = getCountryRepository;
    }

    @Override
    public void onButtonClick() {

        if (mainView != null) {
            mainView.showProgress();
        }

        getCountryRepository.getNextCountry(this);
    }

    @Override
    public void onDestroy() {

        mainView = null;
    }

    @Override
    public void onFinished(String string) {

        if (mainView != null) {
            mainView.setCountry(string);
            mainView.hideProgress();
        }
    }
}
