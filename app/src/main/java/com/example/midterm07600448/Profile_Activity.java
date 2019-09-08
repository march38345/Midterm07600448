package com.example.midterm07600448;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Profile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);
        Intent intent = getIntent();
       String nameuser = intent.getStringExtra("key");
       Toast toast = Toast.makeText(Profile_Activity.this,"welcome"+" "+nameuser,Toast.LENGTH_SHORT);
       toast.show();

    }
}
