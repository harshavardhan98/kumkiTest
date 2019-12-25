package com.example.dsc_onboarding;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.dsc_onboarding.Adapter.viewPageAdapter;
import com.example.dsc_onboarding.Fragment.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager=findViewById(R.id.viewPager);

        viewPageAdapter adapter=new viewPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new Frag1());
        adapter.addFragment(new Frag2());
        adapter.addFragment(new Frag3());

        viewPager.setAdapter(adapter);

        Log.d("testing","OnCreate");
    }

    public void getHelloMain(int x){
        Log.d("testing", "harsha1Main");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("testing","OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("testing","OnResume");
    }

}
