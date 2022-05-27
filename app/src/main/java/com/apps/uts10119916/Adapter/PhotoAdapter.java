package com.apps.uts10119916.Adapter;

// Created by Dian Arpian
// 5-26-2022

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.uts10119916.Data.AllData;
import com.apps.uts10119916.R;

public class PhotoAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo,
                parent, false);

        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return AllData.imgPhotos.length;
    }
    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imgPhotos;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhotos = itemView.findViewById(R.id.img_photo);
            itemView.setOnClickListener(this);
        }
        public void bindView(int position) {
            imgPhotos.setImageResource(AllData.imgPhotos[position]);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
