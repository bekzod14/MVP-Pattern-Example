package uz.gita.mvpexample.contract.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import uz.gita.mvpexample.R;
import uz.gita.mvpexample.contract.MainScreenContract;
import uz.gita.mvpexample.contract.presenter.MainPresenter;
import uz.gita.mvpexample.contract.repository.MainRepository;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View {

    private MainScreenContract.Presenter presenter;
    private TextView txtNumber;
    private Button btnDecrement;
    private Button btnIncrement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this, MainRepository.getInstance());
    }

    @Override
    public void loadViews() {
        txtNumber = findViewById(R.id.txtNumber);
        btnDecrement = findViewById(R.id.btnDecrement);
        btnIncrement = findViewById(R.id.btnIncrement);

        btnDecrement.setOnClickListener(v -> {
            presenter.decrementButtonClicked();
        });

        btnIncrement.setOnClickListener(v -> {
            presenter.incrementButtonClicked();
        });

    }

    @Override
    public void setTextValue(int value) {
        txtNumber.setText(String.valueOf(value));
    }
}