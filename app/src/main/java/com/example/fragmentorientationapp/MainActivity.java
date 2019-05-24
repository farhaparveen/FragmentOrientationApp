package com.example.fragmentorientationapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Fragment1 fragment1;

    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        fragment1 = (Fragment1) manager.findFragmentByTag("TagFragment1");
        if (fragment1==null) {
            fragment1 = new Fragment1();
            FragmentTransaction transaction=manager.beginTransaction();
            transaction.add(R.id.frag_container,fragment1,"TagFragment1");
            transaction.commit();
        }
    }
}
