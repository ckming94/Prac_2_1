package com.edu.tarc.prac_2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMesage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMesage = (EditText)findViewById(R.id.editTextMessage);
    }

    public void sendMessage(View view){
        String message = editTextMesage.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        // Insert parameter to an Intent
        intent.putExtra("MESSAGE", message);
        startActivity(intent);
    }
}
