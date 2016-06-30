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
public class OneFragment extends Fragment {
    View view;
    Button buttonsubmit;
    EditText editText,editText2mobileno,editText3location;
    public OneFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         view=inflater.inflate(R.layout.fragment_one,container,false);

          buttonsubmit=(Button)view.findViewById(R.id.buttonsubmit);

          editText=(EditText)view.findViewById(R.id.editText);
          editText2mobileno=(EditText)view.findViewById(R.id.editText2mobileno);
          editText3location=(EditText)view.findViewById(R.id.editText3location);



         buttonsubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               String name=editText.getText().toString();
               String mobileno=editText2mobileno.getText().toString();
               String location=editText3location.getText().toString();

               if(!(name.equals(""))&&!(mobileno.equals(""))&&!(location.equals("")))
               {

               }else{
                   Toast.makeText(getActivity(),"Fill All Mediatory Fields",Toast.LENGTH_LONG).show();
               }

           }
       });

        return view;
    }
}