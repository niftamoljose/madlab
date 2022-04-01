package com.example.sjcet.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText, editText2;
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        editText = findViewById(R.id.editText);
        editText = findViewById(R.id.editText2);

    }
     public void onCreate(View view) {
        
     }

    public void Register(View view) {
        Toast.makeText(this, "username empty", Toast.LENGTH_SHORT).show();
    }


}



