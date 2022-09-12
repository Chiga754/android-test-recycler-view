package com.example.androidtestrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
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
        adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
            @Override
            public void OnItemClick(String string) {
                strings.remove(string);
                adapter.notifyDataSetChanged();
            }
        });
        recyclerView.setAdapter(adapter);

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}