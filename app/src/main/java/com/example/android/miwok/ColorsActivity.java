package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors = new ArrayList<>();
        colors.add(new Word(R.drawable.color_red,"weṭeṭṭi", "Red", R.raw.color_red));
        colors.add(new Word(R.drawable.color_green,"chokokki", "Green", R.raw.color_green));
        colors.add(new Word(R.drawable.color_brown,"ṭakaakki", "Brown", R.raw.color_brown));
        colors.add(new Word(R.drawable.color_gray,"ṭopoppi", "Gray", R.raw.color_gray));
        colors.add(new Word(R.drawable.color_black,"kululli", "Black", R.raw.color_black));
        colors.add(new Word(R.drawable.color_white,"kelelli", "White", R.raw.color_white));
        colors.add(new Word(R.drawable.color_dusty_yellow,"ṭopiisә", "Dusty Yellow", R.raw.color_dusty_yellow));
        colors.add(new Word(R.drawable.color_mustard_yellow,"chiwiiṭә", "Mustard Yellow", R.raw.color_mustard_yellow));


        ListView listView = findViewById(R.id.listColor);
        WordAdapter adapter = new WordAdapter(this, colors, R.color.category_colors);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, colors.get(i).getmMediaId());
                mediaPlayer.start();
            }
        });
    }
}