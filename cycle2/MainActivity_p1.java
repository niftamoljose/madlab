package com.example.sjcet.cy2_p1;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class first_activity extends AppCompatActivity {


    Button send_button;
    EditText send_text;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = (Button)findViewById(R.id.send_button_id);
        send_text = (EditText)findViewById(R.id.send_text_id);


        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


                String str = send_text.getText().toString();


                Intent intent = new Intent(getApplicationContext(), Second_activity.class);



                intent.putExtra("message_key", str);


                startActivity(intent);
            }
        });
    }
}
