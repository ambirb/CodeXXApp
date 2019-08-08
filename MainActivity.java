package com.example.codexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;



public class MainActivity extends AppCompatActivity {
    private Button chinese_button;
    private Button spanish_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chinese_button = (Button) findViewById(R.id.btn_chinese);
        chinese_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDisplayMessageActivity();
            }
        });


        spanish_button = (Button) findViewById(R.id.btn_spanish);
        spanish_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openSpanish();
            }
        });
    }

    public void openDisplayMessageActivity() {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

    public void openSpanish(){
        Intent intent = new Intent(this, Spanish.class);
        startActivity(intent);
    }


}
