package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> familyMembers = new ArrayList<>();
        familyMembers.add(new Word(R.drawable.family_father, "әpә", "Father", R.raw.family_father));
        familyMembers.add(new Word(R.drawable.family_mother,"әṭa", "Mother", R.raw.family_mother));
        familyMembers.add(new Word(R.drawable.family_son,"angsi", "Son", R.raw.family_son));
        familyMembers.add(new Word(R.drawable.family_daughter,"tune", "Daughter", R.raw.family_daughter));
        familyMembers.add(new Word(R.drawable.family_older_brother,"taachi", "Older Brother", R.raw.family_older_brother));
        familyMembers.add(new Word(R.drawable.family_older_sister,"teṭe", "Older Sister", R.raw.family_older_sister));
        familyMembers.add(new Word(R.drawable.family_younger_brother,"chalitti", "Younger Brother", R.raw.family_younger_brother));
        familyMembers.add(new Word(R.drawable.family_younger_sister,"kolliti", "Younger Sister", R.raw.family_younger_sister));
        familyMembers.add(new Word(R.drawable.family_grandfather,"paapa", "Grandfather", R.raw.family_grandfather));
        familyMembers.add(new Word(R.drawable.family_grandmother,"ama", "Grandmother", R.raw.family_grandmother));


        ListView listView = findViewById(R.id.listFamily);
        WordAdapter adapter = new WordAdapter(this, familyMembers, R.color.category_family);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            mediaPlayer = MediaPlayer.create(FamilyActivity.this, familyMembers.get(i).getmMediaId());
            mediaPlayer.start();
        });
    }
}