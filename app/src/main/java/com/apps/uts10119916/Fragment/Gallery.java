package com.apps.uts10119916.Fragment;

// Created by Dian Arpian
// 5-26-2022

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.apps.uts10119916.Adapter.MusicAdapter;
import com.apps.uts10119916.Adapter.PhotoAdapter;
import com.apps.uts10119916.R;

public class Gallery extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);

        // Photos
        RecyclerView recyclerView = v.findViewById(R.id.rViewPhoto);
        PhotoAdapter photoAdapter = new PhotoAdapter();
        recyclerView.setAdapter(photoAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(),
                LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        // Music
        RecyclerView recyclerView1 = v.findViewById(R.id.rViewMusic);
        MusicAdapter musicAdapter = new MusicAdapter();
        recyclerView1.setAdapter(musicAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView1.setLayoutManager(linearLayoutManager);

        // Video
        VideoView videoView = (VideoView) v.findViewById(R.id.videoView);
        MediaController mc = new MediaController(getActivity());
        videoView.setVideoPath("android.resource://"+getActivity().getPackageName()+"/"+R.raw.sample_video);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);

        return v;
    }
}