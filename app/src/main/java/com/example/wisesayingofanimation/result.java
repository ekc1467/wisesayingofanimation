package com.example.wisesayingofanimation;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class result extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        String out = name+"0";
        ImageView imageView = (ImageView) findViewById(R.id.image);
        try {
            Uri uri = Uri.parse("android.resource://com.example.wisesayingofanimation/drawable/"+out);
            imageView.setImageURI(uri);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}