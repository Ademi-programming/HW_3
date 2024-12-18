package com.example.hw_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CityFragment extends Fragment {
    private ArrayList<String> cityList = new ArrayList<>();
    private RecyclerView rv_city;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_city, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_city = requireActivity().findViewById(R.id.rv_city);
        CityAdapter cityAdapter = new CityAdapter(cityList);
        loadData();
        rv_city.setAdapter(cityAdapter);
    }

    private void loadData() {
        cityList.add("New-York");
        cityList.add("Bishkek");
        cityList.add("Tashkent");
        cityList.add("Almaty");
        cityList.add("Moscow");
        cityList.add("Kiev");
    }
}