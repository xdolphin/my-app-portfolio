package com.example.jxin.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addClickListener();
    }

    private void addClickListener() {
        Button mBtnStreamer = (Button) findViewById(R.id.btn_streamer);
        Button mBtnScores = (Button) findViewById(R.id.btn_scores);
        Button mBtnLibrary = (Button) findViewById(R.id.btn_library);
        Button mBtnBuild = (Button) findViewById(R.id.btn_build);
        Button mBtnXyz = (Button) findViewById(R.id.btn_xyz);
        Button mBtnCapstone = (Button) findViewById(R.id.btn_capstone);

        if (mBtnStreamer != null) {
            mBtnStreamer.setOnClickListener(this);
        }
        if (mBtnScores != null) {
            mBtnScores.setOnClickListener(this);
        }
        if (mBtnLibrary != null) {
            mBtnLibrary.setOnClickListener(this);
        }
        if (mBtnBuild != null) {
            mBtnBuild.setOnClickListener(this);
        }
        if (mBtnXyz != null) {
            mBtnXyz.setOnClickListener(this);
        }
        if (mBtnCapstone != null) {
            mBtnCapstone.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_streamer:
                Toast.makeText(MainActivity.this, "This button will launch sptify streamer app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores:
                Toast.makeText(MainActivity.this, "This button will launch scores app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_library:
                Toast.makeText(MainActivity.this, "This button will launch library app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build:
                Toast.makeText(MainActivity.this, "This button will launch build it bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz:
                Toast.makeText(MainActivity.this, "This button will launch build it xyz reader app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(MainActivity.this, "This button will launch build it capstone app", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
