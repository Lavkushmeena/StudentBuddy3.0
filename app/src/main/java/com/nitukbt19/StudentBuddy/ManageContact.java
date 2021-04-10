package com.nitukbt19.StudentBuddy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

public class ManageContact extends AppCompatActivity {
private ViewPagerAdapter viewPagerAdapter;
private TabLayout tabLayout;
private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_contact);
        Toolbar toolbar= findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.app_name));
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);
        viewPagerAdapter =new ViewPagerAdapter(getSupportFragmentManager());


        viewPagerAdapter.addFragment(new Student_List(),"Student" );
        viewPagerAdapter.addFragment(new Teacher(),"Teacher");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Student");
        tabLayout.getTabAt(1).setText("Teacher");



    }


}