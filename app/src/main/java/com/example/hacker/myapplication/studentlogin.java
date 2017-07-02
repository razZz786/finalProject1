package com.example.hacker.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class studentlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentlogin);
    }
    public void next (View view)
    {
        Intent intent=new Intent(this,forgotpassword.class);
        startActivity(intent);
    }
    public void frgpass (View view)
    {
        Intent intent=new Intent(this,forgotpassword.class);
        startActivity(intent);
    }

}
