package com.example.resumeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button workHistoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workHistoryButton = (Button)findViewById(R.id.workHistoryButton);

        workHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goToTheOtherActivity);
            }
        });
    }
}