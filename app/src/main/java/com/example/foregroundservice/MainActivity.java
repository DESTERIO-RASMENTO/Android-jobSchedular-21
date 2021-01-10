package com.example.foregroundservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditTextInput = (EditText)findViewById(R.id.edit_text_input);
    }

    public void startService(View view) {
        String input = mEditTextInput.getText().toString();
        Intent serviceIntent = new Intent(this,NotificationService.class);
        serviceIntent.putExtra("inputExtra",input);
        startService(serviceIntent);
    }

    public void stopService(View view) {
        Intent serviceIntent = new Intent(this,NotificationService.class);
        stopService(serviceIntent);
    }
}
