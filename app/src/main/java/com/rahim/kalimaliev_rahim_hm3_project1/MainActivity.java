package com.rahim.kalimaliev_rahim_hm3_project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView weapons;
    private ArrayList<String> weaponList = new ArrayList<>();
    private weaponAdapter adapter = new weaponAdapter(weaponList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weapons = findViewById(R.id.cs_go);
        loadData();
        weapons.setAdapter(adapter);
    }

    private void loadData() {
        weaponList.add("AK-47");
        weaponList.add("MP9");
        weaponList.add("USP");
        weaponList.add("P250");
        weaponList.add("AWP");
        weaponList.add("XM1014");
        weaponList.add("DESERT EAGLE");
        weaponList.add("M4A4");
        weaponList.add("SSG08");
        weaponList.add("ARMOR");


    }
}