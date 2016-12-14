package com.stephenasamoah.androidstart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_view);
        Bundle bundle = getIntent().getExtras();

        TextView textView = (TextView) findViewById(R.id.nameTextView);
        textView.setText("Name: " + bundle.getString("name") + " Age: " + bundle.getString("age"));

    }


}
