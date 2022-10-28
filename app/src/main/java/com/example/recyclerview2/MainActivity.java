package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> names;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        NameAdapter adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        names = new ArrayList<>();
        names.add("Миргул");
        names.add("Бектур");
        names.add("Абай");
        names.add("Темирлан");
        names.add("Айсулуу");
        names.add("Рамис");
        names.add("Гулчапчап");
    }
}