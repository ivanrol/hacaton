package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MapActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        TextView textView = new TextView(this);
        textView.setText("Hello World!");

        findViewById(R.id.button_back).setOnClickListener(this::onClickMapActivity);
    }

    private void onClickMapActivity(View view){
        var intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}