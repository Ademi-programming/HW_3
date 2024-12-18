package com.example.hw_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter <ContinentViewHolder> {
    private ArrayList<String> continentList;
    public ContinentAdapter(ArrayList<String>continentList){
        this.continentList = continentList;

    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent,
                false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.onBind(continentList.get(position));
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}
