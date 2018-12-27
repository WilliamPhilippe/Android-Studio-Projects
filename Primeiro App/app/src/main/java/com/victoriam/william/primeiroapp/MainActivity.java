package com.victoriam.william.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AlternateText(View view){

        TextView textH = (TextView) findViewById(R.id.textHead);
        textH.setText("<3");

        TextView textB = (TextView) findViewById(R.id.textBody);
        textB.setText("Amo você!");

    }

}
