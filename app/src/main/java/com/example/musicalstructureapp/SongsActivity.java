package com.example.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * @Author mahmoud
 * @version 1
 * @since 16 oct 2019
 * @Description this is songs Activity which has all the media as songs
 */
public class SongsActivity extends AppCompatActivity {

    /**
     * @Function this function is the entry point for any android app
     * @param savedInstanceState the current state of the app
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // just any data to fill in the items
        ArrayList<MusicData> data = new ArrayList<>();
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));
        data.add(new MusicData("01.Song Name","Artist Name"));


        MusicAdapter<MusicData> adapter = new MusicAdapter<>(this,data);

        ListView listView = findViewById(R.id.activity_list);

        listView.setAdapter(adapter);
    }
}
