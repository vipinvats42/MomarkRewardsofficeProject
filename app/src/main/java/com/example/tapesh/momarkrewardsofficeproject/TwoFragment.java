package com.example.tapesh.momarkrewardsofficeproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by TAPESH on 6/30/2016.
 */
public class TwoFragment extends Fragment {
    View view;
    EditText editText2coupon;
    Button buttonsubmit;
    public TwoFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         view=inflater.inflate(R.layout.fragment_two,container,false);

        editText2coupon=(EditText)view.findViewById(R.id.editText2coupon);
        buttonsubmit=(Button)view.findViewById(R.id.buttonsubmit);

        buttonsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String couponcode=editText2coupon.getText().toString();

                if(!(couponcode.equals("")))
                {

                }else
                {
                    Toast.makeText(getActivity(),"Fill the Coupon Field",Toast.LENGTH_LONG).show();
                }

            }
        });

       // return inflater.inflate(R.layout.fragment_two, container, false);


        return view;
    }

}
