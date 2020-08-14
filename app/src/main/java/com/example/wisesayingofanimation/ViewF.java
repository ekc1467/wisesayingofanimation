package com.example.wisesayingofanimation;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ViewF extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewf2);

/*
        Button btnPrev, btnNext;
        final ViewFlipper vFlipper;

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);

        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");

        for(int i=0;i<3;i++) {
            ImageView imageView;
            String out = ""+name+i;
            if(i==1)
            {imageView = (ImageView) findViewById(R.id.images1);}
            if(i==2)
            {imageView = (ImageView) findViewById(R.id.images2);}
            imageView = (ImageView) findViewById(R.id.images0);
            try {
                Uri uri = Uri.parse("android.resource://com.example.wisesayingofanimation/drawable/" + out);
                imageView.setImageURI(uri);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }




        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vFlipper.showPrevious();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vFlipper.showNext();
            }
        });*/
    }
}
