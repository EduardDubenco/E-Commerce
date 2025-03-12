package com.example.ecommerceapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.ecommerceapp.Adapter.PopularListAdapter;
import com.example.ecommerceapp.Domain.PopularDomain;
import com.example.ecommerceapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        bottomNavigation();
    }

    private void bottomNavigation() {
        LinearLayout homeBtn = findViewById(R.id.homeBtn);
        LinearLayout cartBtn = findViewById(R.id.cartBtn);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CartActivity.class));
            }
        });


    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("MacBook Pro 13 M2 Chip", "Discover the new MacBook Pro featuring the powerful M2 Chip. The cutting edge laptop redefines performance and portability. With its sleek design and advanced technology, the MacBook Pro 13 M2 Chip is your ultimate companion for productivity, creativity, and entertainment. Experience seamless multitasking, stunning visuals on the Retina Display and enhanced security with Touch ID. Take your computing experience to the next level with the MacBook Pro 13 M2 Chip.", "pic1", 15, 4, 500));
        items.add(new PopularDomain("PS 5 Digital","The PlayStation 5 is one of the most powerful game consoles on the market, packing cutting-edge features such as 4K support, variable refresh rate and an SSD so fast that games take a matter of seconds to load.", "pic2", 10, 4.5, 450));
        items.add(new PopularDomain("iPhone 14 pro max", "The iPhone 14 pro max is a very good phone for the money, offering improved cameras, a faster A15 Bionic chip and fun Action mode for video capture. But at this price, we’d like to see a telephoto zoom and 120Hz display.", "pic3", 13, 4.2, 800));

        recyclerViewPopular = findViewById(R.id.view1);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPopular = new PopularListAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}