package com.example.foodappcm3110;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

import android.os.Bundle;

public class RecipePageExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page_example);
        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setText("Rice Krispies");
    }
}