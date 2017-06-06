package com.edu.tarc.prac_2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);

        Bundle extra = getIntent().getExtras();

        if(!extra.isEmpty()){
            String message = extra.getString("MESSAGE");
            textViewMessage.setText(message);
        }
    }
}
