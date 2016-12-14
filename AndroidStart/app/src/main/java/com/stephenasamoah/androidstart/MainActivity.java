package com.stephenasamoah.androidstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();

        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txtDisplay);
        textView.setText("This Text is set on start-up");

    }

    public void btnClick(View view) {
//        textView.setText("Set By Button Click");

        Intent seconViewIntent = new Intent(this, SecondView.class);
        seconViewIntent.putExtra("name", "Stephen Asamoah");
        seconViewIntent.putExtra("age", "47");
        startActivity(seconViewIntent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();

    }
}
