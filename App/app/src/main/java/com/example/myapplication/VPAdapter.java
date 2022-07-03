package com.example.myapplication;


import androidx.annotation.NonNull;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;


import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class VPAdapter extends FragmentStateAdapter {
    private  int numOfTabs;

    {
        numOfTabs = 3;
    }

    public VPAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
      switch( position){
          case 1:
              return new calculator();
          case 2:
              return new note();
          default:
              return new  clock();

      }
    }

    @Override
    public int getItemCount() {
        return numOfTabs;
    }
}
