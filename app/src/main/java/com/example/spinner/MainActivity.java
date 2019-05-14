package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.hello_darkness_message);
        String messageText = (String) messageView.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        Intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);


        startActivity(intent);
    }
}
