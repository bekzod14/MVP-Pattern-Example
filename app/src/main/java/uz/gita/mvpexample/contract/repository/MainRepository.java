package uz.gita.mvpexample.contract.repository;

import uz.gita.mvpexample.contract.MainScreenContract;

public class MainRepository implements MainScreenContract.Repository {

    private static MainRepository repository = null;

    private int value;

    private MainRepository() {

    }

    public static MainRepository getInstance() {
        if (repository == null) repository = new MainRepository();
        return repository;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void increment() {
        value++;
    }

    @Override
    public void decrement() {
        if (value > 0)
            value--;
    }
}
