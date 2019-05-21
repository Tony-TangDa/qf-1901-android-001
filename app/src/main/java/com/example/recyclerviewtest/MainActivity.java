package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        initFruits();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.main_activity);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        fruitAdapter adapter = new fruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
    }
}


