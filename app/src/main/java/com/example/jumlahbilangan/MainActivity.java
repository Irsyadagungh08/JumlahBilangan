package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private EditText jml;
    private Button hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI() {
        bil1 = (EditText) findViewById(R.id.txtbil1);
        bil2 = (EditText) findViewById(R.id.txtbil2);
        jml = (EditText) findViewById(R.id.txthasil);
        hasil = (Button) findViewById(R.id.jml);
    }

    private void initEvent() {
        hasil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1+angka2;
        jml.setText(total+"");
    }
}