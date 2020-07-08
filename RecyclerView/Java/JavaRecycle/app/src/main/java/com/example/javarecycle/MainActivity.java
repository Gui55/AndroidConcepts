package com.example.javarecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listConfigure();

        RecyclerView recyclerView = findViewById(R.id.recycle);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ItemAdapter(items));
    }

    private void listConfigure() {

        items.add(new Item("Este é o item 1"));
        items.add(new Item("Este é o item 2"));
        items.add(new Item("Este é o item 3"));
        items.add(new Item("Este é o item 4"));
        items.add(new Item("Este é o item 5"));
        items.add(new Item("Este é o item 6"));
        items.add(new Item("Este é o item 7"));

    }
}