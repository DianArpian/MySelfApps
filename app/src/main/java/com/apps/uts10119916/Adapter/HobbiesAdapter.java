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

public class HobbiesAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hobbies,
                parent, false);

        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return AllData.imgHobbies.length;
    }
    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView txtHobby;
        private ImageView imgHobby;

        public ListViewHolder(View itemView) {
            super(itemView);
            txtHobby = itemView.findViewById(R.id.txt_hobby);
            imgHobby = itemView.findViewById(R.id.img_hobby);
            itemView.setOnClickListener(this);
        }
        public void bindView(int position) {
            txtHobby.setText(AllData.hobbiesContent[position]);
            imgHobby.setImageResource(AllData.imgHobbies[position]);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
