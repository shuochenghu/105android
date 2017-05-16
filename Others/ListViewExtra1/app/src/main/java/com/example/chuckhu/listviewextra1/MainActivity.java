package com.example.chuckhu.listviewextra1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.Create an array of words
        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        //2. Create a list of words
        //ArrayList<String> words = new ArrayList<String>();
        //words.add("one");
        //words.add("two");
        //words.add("three");
        //words.add("four");
        //words.add("five");
        //words.add("six");
        //words.add("seven");
        //words.add("eight");
        //words.add("nine");
        //words.add("ten");

        //3. Create a list of word objects
        //ArrayList<Word> words = new ArrayList<Word>();

        //words.add(new Word("one", "lutti"));
        //words.add(new Word("two", "otiiko"));
        //words.add(new Word("three", "tolookosu"));
        //words.add(new Word("four", "oyyisa"));
        //words.add(new Word("five", "massokka"));
        //words.add(new Word("six", "temmokka"));
        //words.add(new Word("seven", "kenekaku"));
        //words.add(new Word("eight", "kawinta"));
        //words.add(new Word("nine", "we'e"));
        //words.add(new Word("ten", "na'aacha"));


        //Verify the contents of the array by printing out each array element to the logs
        //Log.v("NumbersActivity", "Word at index 0: " + words[0]);
        //Log.v("NumbersActivity", "Word at index 1: " + words[1]);

        //Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        //Log.v("NumbersActivity", "Word at index 0: " + words.get(1));

        //在程式碼中加入TextView
        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        //TextView wordView =  new TextView(this);
        //wordView.setText(words.get(0));
        //rootView.addView(wordView);

        //TextView wordView2 =  new TextView(this);
        //wordView2.setText(words.get(1));
        //rootView.addView(wordView2);

        /*ArrayList<TextView> wordViews = new ArrayList<TextView>();
        for (int i=0; i<words.size(); i++) {
            wordViews.add(new TextView(this));
            wordViews.get(i).setText(words.get(i));
            rootView.addView(wordViews.get(i));
        }*/
        //or......
        /*for(int i=0; i<words.size(); i++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }*/

        //以下使用ListView & ArrayAdapter
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArrayAdapter<String> itemAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, words);

        //3.以下這樣寫有錯，因為原本ArrayAdapter的每個元素必須是單純TextView
        /*ArrayAdapter<Word> itemAdapter =
                new ArrayAdapter<Word>(this, R.layout.list_item, words);*/

        //3.正確如下
        //WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemAdapter);

    }
}