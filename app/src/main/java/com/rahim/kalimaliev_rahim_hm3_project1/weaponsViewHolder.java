package com.rahim.kalimaliev_rahim_hm3_project1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class weaponsViewHolder extends RecyclerView.ViewHolder {

    private TextView weaponsTypes;


    public weaponsViewHolder(@NonNull View itemView) {
        super(itemView);
        weaponsTypes = itemView.findViewById(R.id.weapons);
    }

    public void bind(String weapons){
        weaponsTypes.setText(weapons);
    }
}
