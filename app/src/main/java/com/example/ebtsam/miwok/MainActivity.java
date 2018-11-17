package com.example.ebtsam.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Numbers=(TextView)findViewById(R.id.numbers);
        TextView Family=(TextView)findViewById(R.id.family);
        TextView Colors=(TextView)findViewById(R.id.colors);
        TextView Phrases=(TextView)findViewById(R.id.phrases);

        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               startActivity(new Intent(MainActivity.this , NumberActivity.class));
            }
        });


       Colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this , ColorsActivity.class));
            }
        });


        Family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this , FamilyActivity.class));
            }
        });


        Phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this , PhrasesActivity.class));
            }
        });

    }

}
