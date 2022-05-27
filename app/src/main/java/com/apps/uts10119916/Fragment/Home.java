package com.apps.uts10119916.Fragment;

// Created by Dian Arpian
// 5-26-2022

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.uts10119916.Adapter.HobbiesAdapter;
import com.apps.uts10119916.R;

public class Home extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.rViewHobbies);
        HobbiesAdapter hobbiesAdapter = new HobbiesAdapter();
        recyclerView.setAdapter(hobbiesAdapter);
        GridLayoutManager layoutManager2 = new GridLayoutManager(requireContext(),2,
                GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager2);

        return v;
    }
}