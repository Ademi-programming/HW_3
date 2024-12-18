package com.example.hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CityViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_city;

    public void onBind(String city) {
        tv_city.setText(city);
    }

    public CityViewHolder(View view) {
        super(view);
        tv_city = view.findViewById(R.id.tv_city);
    }
}
