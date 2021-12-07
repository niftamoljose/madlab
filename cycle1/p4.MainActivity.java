package com.example.sjcet.pgrm4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1, button2;
        final RelativeLayout relativeLayout;
        button1 = findViewById(R.id.BtVar1);
        button2 = findViewById(R.id.BtVar2);
        relativeLayout = findViewById(R.id.rlVar1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundResource(R.color.colorPrimaryDark);         }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout.setBackgroundResource(R.color.colorAccent);
            }
        });
    }
}


