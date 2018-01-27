package com.example.trnclong.bai4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnListView;
    GridView gridView;
    ArrayList<String> arrayListMonHoc;
    ArrayAdapter arrayAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        arrayListMonHoc = new ArrayList<>();

        fakeData();
        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayListMonHoc);
        gridView.setAdapter(arrayAdapter);
        addEvents();
    }

    private void AnhXa() {
        btnListView = findViewById(R.id.btnLV);
        gridView = findViewById(R.id.gridview);
    }
    private void fakeData() {
        arrayListMonHoc.add("C/C++");
        arrayListMonHoc.add("Java");
        arrayListMonHoc.add("Android");
        arrayListMonHoc.add("IOS");
    }
    private void addEvents() {
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
