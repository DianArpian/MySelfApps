package com.apps.uts10119916.Fragment;

// Created by Dian Arpian
// 5-26-2022

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.uts10119916.Adapter.FriendsAdapter;
import com.apps.uts10119916.Adapter.HobbiesAdapter;
import com.apps.uts10119916.R;

public class Daily extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_daily, container, false);
        RecyclerView dailyV = (RecyclerView) v.findViewById(R.id.rViewDaily);
        RecyclerView friendV = (RecyclerView) v.findViewById(R.id.rViewFriends);
        FriendsAdapter friendsAdapter = new FriendsAdapter();
        HobbiesAdapter hobbiesAdapter = new HobbiesAdapter();
        dailyV.setAdapter(hobbiesAdapter);
        friendV.setAdapter(friendsAdapter);
        GridLayoutManager layoutManager1 = new GridLayoutManager(requireContext(),2,
                GridLayoutManager.VERTICAL, false);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(requireContext(),
                LinearLayoutManager.HORIZONTAL, false);
        dailyV.setLayoutManager(layoutManager1);
        friendV.setLayoutManager(layoutManager2);

    return v;
    }
}