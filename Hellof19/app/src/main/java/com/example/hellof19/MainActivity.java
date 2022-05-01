package com.example.hellof19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_relative1);
        setContentView(R.layout.activity_main);
        eName = (EditText) findViewById(R.id.etName);

    }



    public void processChalo(View view) {
        String myName = eName.getText().toString();
        Toast.makeText(MainActivity.this, "WELCOME "+ myName, Toast.LENGTH_LONG).show();
    }
}