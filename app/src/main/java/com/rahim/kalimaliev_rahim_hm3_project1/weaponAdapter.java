package com.rahim.kalimaliev_rahim_hm3_project1;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class weaponAdapter extends RecyclerView.Adapter<weaponsViewHolder> {

    private ArrayList<String> weaponList;

    public weaponAdapter(ArrayList<String> weaponList){
        this.weaponList = weaponList;
    }


    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public weaponsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new weaponsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cs_weapons ,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull weaponsViewHolder holder, int position) {
holder.bind(weaponList.get(position));
    }

    @Override
    public int getItemCount() {
        return weaponList.size();
    }
}
