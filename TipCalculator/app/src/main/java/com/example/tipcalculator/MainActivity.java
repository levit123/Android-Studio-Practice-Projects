package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipTotalTextView;
    TextView totalTextView;
    EditText billTotalEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //grabs the widget with the ID "tipTotalTextView", casts it to a TextView data type, then saves
        //it to the "tipTotalTextView"
        tipTotalTextView = (TextView)findViewById(R.id.tipTotalTextView);
        //tipTotalTextView.setText("Why hello there!");
        //grabs the widget with the ID "totalTextView", casts it to a TextView data type, then saves
        //it to the "totalTextView"
        totalTextView = (TextView)findViewById(R.id.totalTextView);

        billTotalEditText = (EditText)findViewById(R.id.billTotalEditText);
    }
}