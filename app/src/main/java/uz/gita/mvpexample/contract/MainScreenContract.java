package uz.gita.mvpexample.contract;

public interface MainScreenContract {

    interface View {

        void loadViews();

        void setTextValue(int value);

    }

    interface Presenter {

        void incrementButtonClicked();

        void decrementButtonClicked();

    }

    interface Repository {

        int getValue();

        void increment();

        void decrement();

    }

}
