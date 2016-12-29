package io.toru.test.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.toru.test.R;

public class MainActivity extends AppCompatActivity {

    private MainActivityComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule())
                .build();

        account();
    }

    private void account(){
        Log.w("mainActivity", "account: " + component.getTestAccount());
    }
}