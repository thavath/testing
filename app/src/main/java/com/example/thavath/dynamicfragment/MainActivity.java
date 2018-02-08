package com.example.thavath.dynamicfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // button add
    FragmentA fragmentA = new FragmentA();
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction;
    public void add_fragment(View view) {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.linear_container,fragmentA);
        fragmentTransaction.commit();
    }
    // button remove
    public void remove_fragment(View view) {

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.remove(fragmentA);
        fragmentTransaction.commit();
    }
}
