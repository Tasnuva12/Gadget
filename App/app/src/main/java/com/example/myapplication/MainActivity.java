package com.example.myapplication;

import android.os.Bundle;
import android.view.View;



import androidx.appcompat.app.AppCompatActivity;



import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;


import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem clock;
    TabItem calculator;
    TabItem note;
    ViewPager2 viewPager2;
    VPAdapter adapter;

    private View view;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main);

        //tabLayout
        tabLayout = findViewById(R.id.tabLayout);
        clock = findViewById(R.id.clock);
        calculator = findViewById(R.id.calculator);
        note = findViewById(R.id.note);
        viewPager2 = findViewById(R.id.pager);

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new VPAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });


    }


}
