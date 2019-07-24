package com.test.pwpbsesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button lat1;
    Button lat2;
    Button lat3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lat1 = (Button) findViewById(R.id.btn_lat1);
        lat2 = (Button) findViewById(R.id.btn_lat2);
        lat3 = (Button) findViewById(R.id.btn_lat3);

        lat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,TableLayout.class);
                startActivity(pindah);
            }
        });

        lat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,FrameLayout1.class);
                startActivity(pindah);
            }
        });

        lat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,FrameLayout2.class);
                startActivity(pindah);
            }
        });
    }
}
