package com.example.fungus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android. widget. Button;

public class MainActivity5 extends AppCompatActivity {
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        button4 = (Button) findViewById(R.id.button_submit);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}