package com.example.topsportsballteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] players = new String[] {"John Arbuckle", "Sarah Benedito", "Jean Billie", "Billie Sunshine", "Albert Alpacino", "Fettucini Revolution"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> playerAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, players);

        listView.setAdapter(playerAdapter);
    }
}