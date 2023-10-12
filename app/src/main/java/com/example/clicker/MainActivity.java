package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Switch tryb;
    private Button buttonClick, resecik;
    private TextView licznik;
    private int liczenie = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClick = findViewById(R.id.click);
        resecik = findViewById(R.id.reset);
        licznik = findViewById(R.id.licznik);
        tryb = findViewById(R.id.switch1);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tryb.isChecked())
                {
                    liczenie -= 1;
                }
                else
                {
                    liczenie += 1;
                }
                licznik.setText(String.valueOf(liczenie));
            }
        });
        resecik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liczenie = 0;
                licznik.setText(String.valueOf(liczenie));
            }
        });
        tryb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tryb.isChecked())
                {
                    tryb.setText("Odejmowanie");
                }
                else
                {
                    tryb.setText("Dodawanie");
                }
            }
        });
    }
}