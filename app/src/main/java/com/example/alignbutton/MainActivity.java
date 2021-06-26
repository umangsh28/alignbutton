package com.example.alignbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1now(View view) {
        Toast.makeText(this,"button 1",Toast.LENGTH_SHORT).show();
    }

    public void btn3(View view) {
        Toast.makeText(this,"button 3",Toast.LENGTH_SHORT).show();
    }

    public void btn2(View view) {
        Toast.makeText(this,"button 2",Toast.LENGTH_SHORT).show();
    }
}