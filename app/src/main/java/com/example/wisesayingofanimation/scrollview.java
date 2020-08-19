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

        if(name.equals("원피스")){ mid=  new String[]{"luffy", "Straw Hat Pirates", "ONE PIECE Others"};}
        if(name.equals("나루토")){ mid = new String[]{"Naruto", "Itachi", "Jiraiya"}; }
        if(name.equals("블리치")){ mid = new String[]{"Ichigo", "BLEACH Others", "KUBO TITE"};}
        if(name.equals("귀멸의 칼날")){ mid = new String[]{"kamado tanjiro", "","Demon Slayer: Kimetsu no Yaiba Others I","Demon Slayer: Kimetsu no Yaiba Others II"};}
        if(name.equals("도박 묵시록 카이지")){ mid = new String[]{"Kaiji","Tonegawa","Kaiji Others"};}
        if(name.equals("도박마")){ mid = new String[]{"Baku Madarame","Takaomi Kaji","Kiruma Souichi"};}
        if(name.equals("하이큐")){ mid = new String[]{"Hinata","Kageyama","Haikyuu!!Others"};}
        if(name.equals("강철의 연금술사")){ mid = new String[]{"Edward","Alphonse","Van Hohenheim"};}
        //if(name.equals("진격의 거인")){ mid = new String[]{"에렌","리바이","엘빈"};}
        //if(name.equals("도쿄 구울")){ mid = new String[]{};}
        //if(name.equals("데스노트")){ mid = new String[]{"라이토","L","류크"};}
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
                Intent intent = new Intent (getApplicationContext(), ViewF.class);
                intent.putExtra("name", finalMid[arg2]);
                startActivity(intent); //다음화면으로 넘어감
                finish();

            }
        });
    }
}
