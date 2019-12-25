package com.example.dsc_onboarding;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.dsc_onboarding.Adapter.viewPageAdapter;
import com.example.dsc_onboarding.Fragment.*;
import com.example.dsc_onboarding.Model.Animal;
import com.example.dsc_onboarding.Model.Mammal;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_testing=findViewById(R.id.btn_testing);
        btn_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        Mammal m=new Mammal();
        m.behaviour();

        Animal animal=new Animal();
        animal.behaviour();



        ViewPager viewPager=findViewById(R.id.viewPager);
        viewPageAdapter adapter=new viewPageAdapter(getSupportFragmentManager());
        adapter.OnClickListener();

        adapter.addFragment(new Frag1());
        adapter.addFragment(new Frag2());
        adapter.addFragment(new Frag3());

        viewPager.setAdapter(adapter);

        Log.d("testing","OnCreate");
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
