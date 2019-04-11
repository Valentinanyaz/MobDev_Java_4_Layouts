package com.example.knyazeva_using_resources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LinearLayout llBottom = (LinearLayout) findViewById(R.id.llBottom);
        TextView tvBottom = (TextView) findViewById(R.id.tvBottom);
        Button btnBottom = (Button) findViewById(R.id.btnBottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBottom.setText(R.string.btnBottomText);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
