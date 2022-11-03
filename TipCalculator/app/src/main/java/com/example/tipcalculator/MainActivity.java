package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipTotalTextView;
    TextView totalTextView;
    EditText billTotalEditText;
    Button tenPercentButton;
    Button fifteenPercentButton;
    Button twentyPercentButton;

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
        //grabs the widget with the ID "billTotalTextView", casts it to a TextView data type, then saves
        //it to the "billTotalTextView"
        billTotalEditText = (EditText)findViewById(R.id.billTotalEditText);

        tenPercentButton = (Button)findViewById(R.id.tenButton);
        fifteenPercentButton = (Button)findViewById(R.id.fifteenButton);
        twentyPercentButton = (Button)findViewById(R.id.twentyButton);

        tenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcTip(0.1);
            }
        });

        fifteenPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcTip(0.15);
            }
        });

        twentyPercentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcTip(0.20);
            }
        });
    }

    void calcTip(Double tipPercentage)
    {
        //get the bill price from the EditText widget
        //grabs the text from the EditText widget, converts it to a String, then converts
        //that string to a Double
        Double billTotal = Double.valueOf(billTotalEditText.getText().toString());

        //determine the tip
        Double tipTotal = billTotal * tipPercentage;



        //display the tip
        tipTotalTextView.setText("Tip - $" + String.format("%.2f", tipTotal));

        //determine the total
        Double total = billTotal + tipTotal;

        //display the total
        totalTextView.setText("Total - $" + String.format("%.2f", total));
    }
}