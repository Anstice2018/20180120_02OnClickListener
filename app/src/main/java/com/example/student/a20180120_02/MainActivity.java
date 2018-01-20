package com.example.student.a20180120_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            Toast.makeText(this, "Click1", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.button2)
        {
            Toast.makeText(this, "Click222222", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.button3)
        {
            Toast.makeText(this, "Click33_", Toast.LENGTH_SHORT).show();
        }
    }

}
