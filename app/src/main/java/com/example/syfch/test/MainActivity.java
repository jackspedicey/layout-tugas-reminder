package com.example.syfch.test;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity {



    private TabLayout  tablayout ;
    private AppBarLayout appBarLayout ;
    private ViewPager viewPager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tablayout = (TabLayout)findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //adding fragment
        adapter.AddFragment(new FragmentAlarm(),"Pengingat");
        adapter.AddFragment(new  FragmentJam(),"Jam");
        adapter.AddFragment(new FragmentAbout(),"About");


        //adapter setup
        viewPager.setAdapter(adapter);

        tablayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(1);


    }
}
