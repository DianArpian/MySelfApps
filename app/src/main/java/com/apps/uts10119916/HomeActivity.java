package com.apps.uts10119916;

// Created by Dian Arpian
// 5-26-2022

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.apps.uts10119916.Fragment.Daily;
import com.apps.uts10119916.Fragment.Gallery;
import com.apps.uts10119916.Fragment.Home;
import com.apps.uts10119916.Fragment.Profile;
import com.apps.uts10119916.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Home());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.homeFragment:
                    replaceFragment(new Home());
                    break;
                case R.id.dailyFragment:
                    replaceFragment(new Daily());
                    break;
                case R.id.galleryFragment:
                    replaceFragment(new Gallery());
                    break;
                case R.id.profileFragment:
                    replaceFragment(new Profile());
                    break;
            }

            return true;
        });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}