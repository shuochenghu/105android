package com.example.chuckhu.listviewextra2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Create a list of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //Verify the contents of the array by printing out each array element to the logs
        //Log.v("NumbersActivity", "Word at index 0: " + words[0]);
        //Log.v("NumbersActivity", "Word at index 1: " + words[1]);

        Log.v("MainActivity", "Word at index 0: " + words.get(0));
        Log.v("MainActivity", "Word at index 1: " + words.get(1));
        Log.v("MainActivity", "Word at index 2: " + words.get(2));



        ArrayAdapter<String> itemAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, words);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(itemAdapter);

    }
}