package com.example.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * @Author mahmoud
 * @version 1
 * @since 16 oct 2019
 * @Description this library class holds all other sections of the App
 * ##this class implements click listener interface to modify on click function
 */
public class LibraryActivity extends AppCompatActivity implements View.OnClickListener {

    // global variables
    LinearLayout albums, artists, songs, playlists;

    /**
     * @Function this function is the entry point for any android app
     * @param savedInstanceState the current state of the app
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        variablesDefinitions();
        initiateUI();
    }

    /**
     * @Function this function initiate all the variables values
     */
    private void variablesDefinitions() {
        albums = findViewById(R.id.albums);
        artists = findViewById(R.id.artist);
        songs = findViewById(R.id.songs);
        playlists = findViewById(R.id.playlists);
    }

    /**
     * @Function this function initiate the on click listener function
     */
    private void initiateUI() {
        albums.setOnClickListener(this);
        artists.setOnClickListener(this);
        songs.setOnClickListener(this);
        playlists.setOnClickListener(this);
    }

    /**
     * @Function this function overrides on click function in onclick listener interface
     * @param v it is the current view object
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.albums:
                startActivity(new Intent(LibraryActivity.this, AlbumsActivity.class));
                break;
            case R.id.artist:
                startActivity(new Intent(LibraryActivity.this, ArtistsActivity.class));
                break;
            case R.id.songs:
                startActivity(new Intent(LibraryActivity.this, SongsActivity.class));
                break;
            case R.id.playlists:
                startActivity(new Intent(LibraryActivity.this, PlaylistsActivity.class));
                break;
            default:
                // just in case of potential errors ^_^
                Toast.makeText(this, "Potential Error", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
