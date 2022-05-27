package com.apps.uts10119916.Adapter;

// Created by Dian Arpian
// 5-26-2022

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.uts10119916.Data.AllData;
import com.apps.uts10119916.R;


public class MusicAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return AllData.musicContent.length;

    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView titleSongs;
        private ImageView imageCover;

        public ListViewHolder(View itemView) {
            super(itemView);
            titleSongs = (TextView) itemView.findViewById(R.id.titleMusic);
            imageCover = (ImageView) itemView.findViewById(R.id.imgCover);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position) {
            titleSongs.setText(AllData.musicContent[position]);
            imageCover.setImageResource(R.drawable.itunes);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
