package com.focaa.wisesayingofanimation;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;

public class ViewF extends AppCompatActivity {
    String declaration= "manhwa";

    public String getName() {
        return declaration;
    }
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        setTitle(name);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.viewf);
        String wise = null;

        try{
        InputStream inputS = getResources().openRawResource(getResources().getIdentifier(getName(), "raw", getPackageName()));
        byte[] txt = new byte[inputS.available()];
        inputS.read(txt);
        wise = new String(txt);
        inputS.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

        Button btnPrev, btnNext;
        final ViewFlipper vFlipper;

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);

        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

        TextView textView =null;
        ImageView imageView = null;


        for(int i=0;i<3;i++) {
            String out = ""+name+i;
            if (i == 0)
            {imageView = (ImageView) findViewById(R.id.images0);
            textView = findViewById(R.id.textView0);
            }
            if(i==1)
            {imageView = (ImageView) findViewById(R.id.images1);
            textView = findViewById(R.id.textView1);
            }
            if(i==2)
            {imageView = (ImageView) findViewById(R.id.images2);
            textView = findViewById(R.id.textView2);
            }


            try {
                String e = out.toLowerCase();
                String str = e.replaceAll(" ", "");
                Uri uri = Uri.parse("android.resource://com.example.wisesayingofanimation/drawable/"+str);
                imageView.setImageURI(uri);
                int a = wise.indexOf(e);
                int b = wise.indexOf("/",a);
                int length = e.length();
                String c = wise.substring(a+length, b);
                textView.setText(c);
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
        });
    }
    public void onBackPressed() {
        super.onBackPressed();{finish();}
    }
}
