package com.example.list;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.lista);
        Log.d("MainActivity", "onCreate: Started.");
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Luiz Fernando");
        nomes.add("Marcos Vinicius");
        nomes.add("Pedro Paulo");
        nomes.add("Daniel Fraga");
        nomes.add("Lucio Rabelo");
        nomes.add("Fernanda Lacerda");
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.simple_list4, nomes);
        listView.setAdapter(adapter);
    }
}