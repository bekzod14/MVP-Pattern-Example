package uz.gita.mvpexample.contract.presenter;


import uz.gita.mvpexample.contract.MainScreenContract;

public class MainPresenter implements MainScreenContract.Presenter {

    private MainScreenContract.View view;
    private MainScreenContract.Repository repository;

    public MainPresenter(MainScreenContract.View view, MainScreenContract.Repository repository) {
        this.view = view;
        this.repository = repository;
        view.loadViews();
        view.setTextValue(repository.getValue());
    }

    @Override
    public void incrementButtonClicked() {
        repository.increment();
        view.setTextValue(repository.getValue());
    }

    @Override
    public void decrementButtonClicked() {
        repository.decrement();
        view.setTextValue(repository.getValue());

    }
}
