package com.example.aplikasilist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] namanegara = new String[]{ "Indonesia", "Malaysia", "Singapura", "Italia", "Inggris", "Belanda", "Argentina", "Chile", "Mesir", "Uganda"};
    private String[] ibukota = new String[]{"Jakarta", "Kuala Lumpur", "Singapore", "Roma", "London", "Amsterdam", "Buenos Aires", "Santiago de Chile", "Kairo", "Kampala"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Aplikasi List");
        getSupportActionBar().setSubtitle("gist.github.com/BrianMohamadSafiudin");


        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Negara yang dipilih : "+namanegara[position], Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Ibukotanya : "+ibukota[position], Toast.LENGTH_LONG).show();

            }
        });
    }
}
