package com.acabezas.buildflavorsdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.test_text_view);
        textView.setText(com.acabezas.buildflavorsdemoapp.test.TestClass.THIS_IS_A_TEST);

    }
}
