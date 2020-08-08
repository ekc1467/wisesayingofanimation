package com.example.wisesayingofanimation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("리스트뷰 테스트");

        final String[] mid = { "원피스", "나루토", "블리치", "귀멸의 칼날", "도박묵시록 카이지", "도박마", "하이큐", "강철의 연금술사","진격의 거인","도쿄 구울","데스노트"};

        ListView list = findViewById(R.id.listView1);

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, mid);
                list.setAdapter(adapter);

                list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                            long arg3) {
                        Toast.makeText(getApplicationContext(), mid[arg2],
                                Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent (getApplicationContext(), scrollview.class);
                        intent.putExtra("name",mid[arg2]);
                        startActivity(intent); //다음화면으로 넘어감
                        finish();

            }
        });
    }
}
