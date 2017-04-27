package com.example.RobertsKunicins.My_App.fragments;

import android.os.Bundle;

import com.example.RobertsKunicins.My_App.R;

/**
 * Created by RobertsKunicins on 3/15/2017.
 */

public class MainFragment extends android.support.v4.app.FragmentActivity {

    FragmentDescription fragmentDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container);

        if (findViewById(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return;
            }

            fragmentDescription = new FragmentDescription();

            fragmentDescription.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container,fragmentDescription).commit();
        }
    }

}
