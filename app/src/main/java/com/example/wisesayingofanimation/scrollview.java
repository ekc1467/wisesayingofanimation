package com.example.wisesayingofanimation;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;



@SuppressLint("Registered")
public class scrollview extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview);
        Intent intent = getIntent();

        final String name = intent.getExtras().getString("name");
        LinearLayout lin = findViewById(R.id.myLayout);
        Button btn1;
        btn1 = (Button) findViewById(R.id.but1);
        btn1.setText(name);
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.myLayout);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), saying.class);
                intent.putExtra("name",name);
                startActivity(intent); //다음화면으로 넘어감
                finish();
            }
        });

    }

    }

