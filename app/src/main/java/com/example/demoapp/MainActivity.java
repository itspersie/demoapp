package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.demolibrary.DocUpload;

public class MainActivity extends AppCompatActivity {


    //DocUpload obj = new DocUpload();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button add_Btn = findViewById(R.id.add_btn);
        add_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this,DocUpload.class);
            startActivity(intent);

            }
        });
    }

    
}