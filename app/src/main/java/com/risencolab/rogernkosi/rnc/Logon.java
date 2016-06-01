package com.risencolab.rogernkosi.rnc;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;


public class Logon extends AppCompatActivity {


    private EditText username, password;
    private Button access;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_logon);

        getWidgets();

    }

    public void getWidgets(){
        username = (EditText)findViewById(R.id.lgn_username);
        password = (EditText)findViewById(R.id.lgn_password);
        access = (Button)findViewById(R.id.btn_logon);
    }


}
