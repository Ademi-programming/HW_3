package com.example.hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_continent;

    public void onBind(String continent) {
        tv_continent.setText(continent);
    }
    public ContinentViewHolder(View view) {
        super(view);
        tv_continent = view.findViewById(R.id.tv_continent);
    }
}
