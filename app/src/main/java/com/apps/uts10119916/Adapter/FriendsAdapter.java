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

public class FriendsAdapter extends RecyclerView.Adapter {
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
        return AllData.imgFriend.length;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imgFriends;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgFriends = itemView.findViewById(R.id.img_hobby);
            itemView.setOnClickListener(this);
        }
        public void bindView(int position) {
            imgFriends.setImageResource(AllData.imgFriend[position]);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
