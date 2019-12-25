package com.example.dsc_onboarding.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dsc_onboarding.testInterface;

import java.util.ArrayList;

public class viewPageAdapter extends FragmentPagerAdapter implements testInterface {

    ArrayList<Fragment> fragmentArrayList=new ArrayList<>();


    public viewPageAdapter(FragmentManager fm) {
        super(fm);}

    @Override
    public Fragment getItem(int i) {
        return fragmentArrayList.get(i);
    }


    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }


    public void addFragment(Fragment fragment)
    {
        fragmentArrayList.add(fragment);
    }


    @Override
    public void method1() {
        System.out.println("testing");
        return;
    }

    @Override
    public int method2() {
        System.out.println("testing");
        return 0;
    }

    @Override
    public String method3(int a, int b, ArrayList<String> l) {
        System.out.println("testing");
        return null;
    }

    @Override
    public void OnClickListener() {
        System.out.println("testing the code");
    }
}



