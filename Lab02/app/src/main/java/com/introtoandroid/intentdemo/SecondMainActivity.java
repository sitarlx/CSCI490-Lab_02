package com.introtoandroid.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondMainActivity extends AppCompatActivity {

    private ImageView superMoon;
    private ImageView waterFall;

    private int imgId;

    private int RESPONSE_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activitymain);

        final Intent intent = new Intent();

        superMoon = findViewById(R.id.imageView1);
        waterFall = findViewById(R.id.imageView2);

        superMoon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                imgId = R.drawable.supermoon;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
            }
        });

        waterFall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                imgId = R.drawable.waterfall;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
            }
        });
    }

}
