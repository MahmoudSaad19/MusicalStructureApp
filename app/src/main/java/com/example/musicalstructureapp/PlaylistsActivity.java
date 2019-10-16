package com.example.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * @Author mahmoud
 * @version 1
 * @since 16 oct 2019
 * @Description this is playlists Activity which has the media sorted by the user
 */
public class PlaylistsActivity extends AppCompatActivity {

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
        data.add(new MusicData("Favorite","Empty Playlist"));
        data.add(new MusicData("Most Played","Empty Playlist"));
        data.add(new MusicData("Newly added","Empty Playlist"));
        data.add(new MusicData("Playlist","Empty Playlist"));
        data.add(new MusicData("current list","Empty Playlist"));
        data.add(new MusicData("Recently played","Empty Playlist"));
        data.add(new MusicData("My songs","Empty Playlist"));
        data.add(new MusicData("Daily Routine","Empty Playlist"));
        data.add(new MusicData("Sleep","Empty Playlist"));


        MusicAdapter<MusicData> adapter = new MusicAdapter<>(this,data);

        ListView listView = findViewById(R.id.activity_list);

        listView.setAdapter(adapter);

    }
}
