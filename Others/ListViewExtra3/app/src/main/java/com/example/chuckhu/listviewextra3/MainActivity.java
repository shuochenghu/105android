package com.example.chuckhu.listviewextra3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3. Create a list of word objects
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "we'e"));
        words.add(new Word("ten", "na'aacha"));


        WordAdapter adapter = new WordAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);

    }
}
