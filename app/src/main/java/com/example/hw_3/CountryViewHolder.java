package com.example.hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_country;

    public void onBind(String country) {
        tv_country.setText(country);

    }
    public CountryViewHolder(View view) {
        super(view);
        tv_country = view.findViewById(R.id.tv_country);

    }
}
