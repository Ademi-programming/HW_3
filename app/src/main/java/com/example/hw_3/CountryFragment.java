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

public class CountryFragment extends Fragment {
    private ArrayList<String> countryList = new ArrayList<>();
    private RecyclerView rv_country;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_country = requireActivity().findViewById(R.id.rv_country);
        loadData();
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        rv_country.setAdapter(countryAdapter);
    }

    private void loadData() {
        countryList.add("Kyrgyzstan");
        countryList.add("German");
        countryList.add("Albaniya");
        countryList.add("Serbiya");
        countryList.add("Ispaniya");
        countryList.add("Portugaliya");
    }
}