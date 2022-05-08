package com.example.android.miwok;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList<>();

        numbers.add(new Word(R.drawable.number_one, "lutti", "One", R.raw.number_one));
        numbers.add(new Word(R.drawable.number_two, "otiiko", "Two", R.raw.number_two));
        numbers.add(new Word(R.drawable.number_three, "tolookosu", "Three", R.raw.number_three));
        numbers.add(new Word(R.drawable.number_four, "oyyisa", "Four", R.raw.number_four));
        numbers.add(new Word(R.drawable.number_five, "massokka", "Five", R.raw.number_five));
        numbers.add(new Word(R.drawable.number_six, "temmokka", "Six", R.raw.number_six));
        numbers.add(new Word(R.drawable.number_seven, "kenekaku", "Seven", R.raw.number_seven));
        numbers.add(new Word(R.drawable.number_eight, "kawinta", "Eight", R.raw.number_eight));
        numbers.add(new Word(R.drawable.number_nine, "wo’e", "Nine", R.raw.number_nine));
        numbers.add(new Word(R.drawable.number_ten, "na’aacha", "Ten", R.raw.number_ten));


        ListView listView = findViewById(R.id.listNumber);
        WordAdapter adapter = new WordAdapter(this, numbers, R.color.category_numbers);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            mediaPlayer = MediaPlayer.create(NumbersActivity.this, numbers.get(i).getmMediaId());
            mediaPlayer.start();
        });

    }
}
