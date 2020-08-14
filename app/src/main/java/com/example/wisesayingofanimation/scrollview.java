package com.example.wisesayingofanimation;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

        String[] mid = new String[3];

        if(name.equals("원피스")){ mid=  new String[]{"luffy", "조로", "상디"};}
        if(name.equals("나루토")){ mid = new String[]{"나루토", "이타치", "변태 선인"}; }
        if(name.equals("블리치")){ mid = new String[]{"이치고", "우라하라 키스케", "아이젠 소스케"};}
        if(name.equals("귀멸의 칼날")){ mid = new String[]{"카마도 탄지로"};}
        if(name.equals("도박 묵시록 카이지")){ mid = new String[]{"카이지","토네가와","그 외 인물"};}
        if(name.equals("도박마")){ mid = new String[]{"바쿠","카지","소이치"};}
        if(name.equals("하이큐")){ mid = new String[]{"히나타","카게야마"};}
        if(name.equals("강철의 연금술사")){ mid = new String[]{"에드워드","알폰스 엘릭","반 호엠하임"};}
        if(name.equals("진격의 거인")){ mid = new String[]{"에렌","리바이","엘빈"};}
        if(name.equals("도쿄 구울")){ mid = new String[]{};}
        if(name.equals("데스노트")){ mid = new String[]{"라이토","L","류크"};}
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
