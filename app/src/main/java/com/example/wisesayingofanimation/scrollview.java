package com.example.wisesayingofanimation;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



@SuppressLint("Registered")
public class scrollview extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview);
        Intent intent = getIntent();

        final String name = intent.getExtras().getString("name");

        String[] mid = new String[2];
        if(name=="원피스"){ mid=  new String[]{"루피", "조로", "상디"};}
        if(name=="나루토"){ mid = new String[]{"나루토", "이타치", "변태 선인"}; }
        if(name=="블리치"){ mid = new String[]{"이치고", "우라하라 키스케", "아이젠 소스케"};}

        ListView list = findViewById(R.id.listView2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mid);
        list.setAdapter(adapter);

        final String[] finalMid = mid;
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                Toast.makeText(getApplicationContext(), finalMid[arg2],
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (getApplicationContext(), result.class);
                intent.putExtra("name", finalMid[arg2]);
                startActivity(intent); //다음화면으로 넘어감
                finish();

            }
        });
    }
}
