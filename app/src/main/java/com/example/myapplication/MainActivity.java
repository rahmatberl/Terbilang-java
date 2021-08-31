package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.function.Function;

public class MainActivity extends AppCompatActivity {
    EditText edt_input;
    TextView tv_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_input = findViewById(R.id.et_input);
        tv_hasil = findViewById(R.id.tv_hasil);

        edt_input.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                String data = edt_input.getText().toString();
                if(data.isEmpty()){
                    tv_hasil.setText("");
                } else {
                    tv_hasil.setText(terbilang.angkaToTerbilang(Integer.parseInt(data)));
                }
                return false;
            }
        });


    }
}