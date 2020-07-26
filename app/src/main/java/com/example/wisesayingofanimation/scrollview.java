package com.example.wisesayingofanimation;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;



@SuppressLint("Registered")
public class scrollview extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview);

        Button btn1;
        final ScrollView scroll;

        btn1 = (Button) findViewById(R.id.but1);
        scroll = (ScrollView) findViewById(R.id.aaa);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                int a1 = 1;
                intent.putExtra("1",a1);
                startActivity(intent);
            }
        });

    }
}
