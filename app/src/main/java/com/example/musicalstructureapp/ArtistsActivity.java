package com.example.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * @Author mahmoud
 * @version 1
 * @since 16 oct 2019
 * @Description this is Artist Activity which has the media sorted by each artist name
 */
public class ArtistsActivity extends AppCompatActivity {

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
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));
        data.add(new MusicData("artist name","no of songs"));


        MusicAdapter<MusicData> adapter = new MusicAdapter<>(this,data);

        ListView listView = findViewById(R.id.activity_list);

        listView.setAdapter(adapter);
    }
}
