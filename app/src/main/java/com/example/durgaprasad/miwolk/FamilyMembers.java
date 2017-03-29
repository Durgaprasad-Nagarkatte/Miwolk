package com.example.durgaprasad.miwolk;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("father", "әpә", R.drawable.family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister));
        words.add(new Word("grandmother", "ama",R.drawable.family_grandmother));
        words.add(new Word("grandfather", "paapa",R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                playSong(position);
            }
        });
    }

    private void playSong(int position) {
        switch (position) {
            case 0:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_father);
                mediaPlayer.start();
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_mother);
                mediaPlayer.start();
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_son);
                mediaPlayer.start();
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_daughter);
                mediaPlayer.start();
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_older_brother);
                mediaPlayer.start();
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_younger_brother);
                mediaPlayer.start();
                break;
            case 6:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_older_sister);
                mediaPlayer.start();
                break;
            case 7:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_younger_sister);
                mediaPlayer.start();
                break;
            case 8:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_grandmother);
                mediaPlayer.start();
                break;
            case 9:
                mediaPlayer = MediaPlayer.create(this, R.raw.family_grandfather);
                mediaPlayer.start();
                break;
        }
    }

}
