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

public class ContinentFragment extends Fragment {

    private ArrayList<String> continenList = new ArrayList<>();
    private RecyclerView rv_continent;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_continent = requireActivity().findViewById(R.id.rv_continent);
        loadData();
        ContinentAdapter continentAdapter = new ContinentAdapter(continenList);
        rv_continent.setAdapter(continentAdapter);
    }

    private void loadData(){
        continenList.add("Евразия");
        continenList.add("Антрактида");
        continenList.add("Северная Америка");
        continenList.add("Южная Америка");
        continenList.add("Африка");
        continenList.add("Австралия");
    }
}