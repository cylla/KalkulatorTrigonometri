package com.example.praktikum2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSin,btnCos,btnTan,btnCsc,btnSec,btnCot,btnLog;
    private TextView tvHasil;
    private EditText nilai1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSin = findViewById(R.id.btn_sin);
        btnCos = findViewById(R.id.btn_cos);
        btnTan = findViewById(R.id.btn_tan);
        btnCsc = findViewById(R.id.btn_csc);
        btnSec = findViewById(R.id.btn_sec);
        btnCot = findViewById(R.id.btn_cot);
        btnLog = findViewById(R.id.btn_log10);
        tvHasil = findViewById(R.id.tv_hasil);
        nilai1 = findViewById(R.id.nilai1);
        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai = nilai1.getText().toString();
                    double nilai1 = Double.parseDouble(sNilai);










































































































































































































































                    double Hasil = Math.sin(nilai1);
                    String sHasil = String.valueOf(Hasil);

                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai = nilai1.getText().toString();
                    double nilai1 = Double.parseDouble(sNilai);

                    double Hasil = Math.cos(nilai1);
                    String sHasil = String.valueOf(Hasil);

                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai = nilai1.getText().toString();
                    double nilai1 = Double.parseDouble(sNilai);

                    double Hasil = Math.tan(nilai1);
                    String sHasil = String.valueOf(Hasil);

                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnCsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai = nilai1.getText().toString();
                    double nilai1 = Double.parseDouble(sNilai);

                    double Hasil = 1.0/Math.sin(nilai1);
                    String sHasil = String.valueOf(Hasil);

                    tvHasil.setText(sHasil);

                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai1 = nilai1.getText().toString();
                    double nilai1 = Double.parseDouble(sNilai1);

                    double hasil = 1.0/Math.cos(nilai1);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnCot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai1 = nilai1.getText().toString();
                    double nilai1 = Double.parseDouble(sNilai1);

                    double hasil = 1.0/Math.tan(nilai1);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNilai1 = nilai1.getText().toString();
                    double nilai1 = Double.parseDouble(sNilai1);

                    double hasil = Math.log10(nilai1);
                    String sHasil = String.valueOf(hasil);

                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Kolom tidak boleh kosong!!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
