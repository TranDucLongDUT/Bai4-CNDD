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

public class Main2Activity extends AppCompatActivity {

    Button  btnGridView;
    ListView listView;
    ArrayList<String> arrayListMonHoc;
    ArrayAdapter arrayAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);   AnhXa();
        arrayListMonHoc = new ArrayList<>();

        fakeData();
        arrayAdapter = new ArrayAdapter(Main2Activity.this,android.R.layout.simple_list_item_1,arrayListMonHoc);
        listView.setAdapter(arrayAdapter);
        addEvents();
    }

    private void AnhXa() {
        btnGridView = findViewById(R.id.btnGV);
        listView = findViewById(R.id.listview);
    }
    private void fakeData() {
        arrayListMonHoc.add("C/C++");
        arrayListMonHoc.add("Java");
        arrayListMonHoc.add("Android");
        arrayListMonHoc.add("IOS");
    }
    private void addEvents() {
        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}