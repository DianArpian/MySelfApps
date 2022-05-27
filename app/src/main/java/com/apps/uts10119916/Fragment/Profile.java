package com.apps.uts10119916.Fragment;

// Created by Dian Arpian
// 5-26-2022

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.apps.uts10119916.R;


public class Profile extends Fragment {

    private static final int REQUEST_CALL = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        ImageView facebookLink = (ImageView) v.findViewById(R.id.facebookLinks);
        ImageView instagramLink = (ImageView) v.findViewById(R.id.instagramLinks);
        ImageView tiktokLink = (ImageView) v.findViewById(R.id.tiktokLinks);
        ImageView whatsappLink = (ImageView) v.findViewById(R.id.whatsappLinks);
        ImageView telephoneLink = (ImageView) v.findViewById(R.id.telephoneLinks);


        facebookLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.facebook.com/");
            }
        });

        instagramLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/");
            }
        });

        tiktokLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tiktok.com/");
            }
        });

        telephoneLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneCall();
            }
        });

        whatsappLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://api.whatsapp.com/send?phone=6285862246034");
            }
        });

        return v;
    }

    private void phoneCall() {
        String number = "6285862246034";
        if(ContextCompat.checkSelfPermission(getActivity().getApplication(),
                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(getActivity(), new String[] {Manifest.permission.CALL_PHONE}, REQUEST_CALL);
        }else {
            String dial = "tel:" + number;
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
        }
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}