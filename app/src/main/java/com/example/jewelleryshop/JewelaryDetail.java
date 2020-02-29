package com.example.jewelleryshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JewelaryDetail extends AppCompatActivity {
    TextView shape;
    TextView size;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jewelary__detail);


    }
}
