package com.example.tapesh.momarkrewardsofficeproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by TAPESH on 6/30/2016.
 */
public class ThreeFragment extends Fragment{

    public ThreeFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // view=inflater.inflate(R.layout.fragment_one,container,false);


        return inflater.inflate(R.layout.fragment_three, container, false);

    }
}
