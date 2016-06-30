package com.example.tapesh.momarkrewardsofficeproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by TAPESH on 6/30/2016.
 */
public class Activity1 extends Activity implements View.OnClickListener{
    Button buttonsubmit;
    EditText editTextmobileno,editText2acticode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity1);


        editTextmobileno=(EditText)findViewById(R.id.editTextmobileno);
        editText2acticode=(EditText)findViewById(R.id.editText2acticode);


        buttonsubmit=(Button)findViewById(R.id.buttonsubmit);
        buttonsubmit.setOnClickListener(this);
    }

 @Override
    public void onClick(View view)
 {
     String mobileno=editTextmobileno.getText().toString();
     String activationCode=editText2acticode.getText().toString();

     if(!(mobileno.equals(""))&&!(activationCode.equals(""))) {
         Intent intent = new Intent(this, Activity2.class);
         startActivity(intent);
     }else{
         Toast.makeText(this,"Fill the Fields",Toast.LENGTH_LONG).show();
     }


     }

}
