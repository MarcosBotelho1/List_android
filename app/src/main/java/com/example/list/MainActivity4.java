package com.example.list;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ListView listView = findViewById(R.id.lista4);
        Log.d("MainActivity4", "onCreate: Started.");

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Luiz Fernando");
        nomes.add("Marcos Vinicius");
        nomes.add("Pedro Paulo");
        nomes.add("Daniel Fraga");
        nomes.add("Lucio Rabelo");
        nomes.add("Fernanda Lacerda");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.simple_list4, nomes);
        listView.setAdapter(adapter);
    }

    public void anterior_pagina(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}