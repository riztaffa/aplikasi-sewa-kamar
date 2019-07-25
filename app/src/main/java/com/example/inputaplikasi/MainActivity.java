package com.example.inputaplikasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText eNama;
    private EditText eHotel;
    private EditText eJumlah;
    private EditText eDurasi;
    private Button input;
    private TextView Eoutputnama;
    private TextView Eoutputhotel;
    private TextView Eoutputkamar;
    private TextView Eoutputdurasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNama = findViewById(R.id.idnama);
        eHotel = findViewById(R.id.idhotel);
        eJumlah = findViewById(R.id.idjumlah);
        eDurasi = findViewById(R.id.iddurasi);
        input = findViewById(R.id.binput);
        Eoutputnama = findViewById(R.id.IDoutputnama);
        Eoutputhotel = findViewById(R.id.IDoutputhotel);
        Eoutputkamar = findViewById(R.id.IDoutputkamar);
        Eoutputdurasi = findViewById(R.id.IDoutputdurasi);

        input.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String inputNama = eNama.getText().toString();
        String inputHotel = eHotel.getText().toString();
        String inputJumlah = eJumlah.getText().toString();
        String inputDurasi = eDurasi.getText().toString();

        if (inputNama.length()==0){
            eNama.setError("Data tidak boleh kosong");
        } else {
            Eoutputnama.setText(inputNama);
        } if (inputHotel.length()==0){
            eHotel.setError("Data tidak boleh kosong");
        } else {
            Eoutputhotel.setText(inputHotel);
        } if (inputJumlah.length()==0){
            eJumlah.setError("Data tidak boleh kosong");
        } else {
            Eoutputkamar.setText(inputJumlah);
        } if (inputDurasi.length()==0){
            eDurasi.setError("Data tidak boleh kosong");
        } else {
            Eoutputdurasi.setText(inputDurasi);
        }
    }
}
