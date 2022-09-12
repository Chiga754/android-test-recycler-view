package com.example.androidtestrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> strings = new ArrayList<>();
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

//      Заполняем ArrayList строками
        for(int i = 0; i < 20; i++) {
            strings.add("Item " + i);
        }

        adapter = new Adapter();
        adapter.setStrings(strings);
        recyclerView.setAdapter(adapter);

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}