package com.nitukbt19.StudentBuddy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import  androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;


public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> lstFragment =new ArrayList<>();
    private final List<String> lstTitle =new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm){
        super(fm);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);

    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
    public void addFragment(Fragment fragment,String text){
        lstFragment.add(fragment);
        lstTitle.add(text);
    }
}

