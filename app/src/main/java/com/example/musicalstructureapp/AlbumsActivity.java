package com.example.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * @Author mahmoud
 * @version 1
 * @since 16 oct 2019
 * @Description this is Albums Activity which has the media sorted by each type
 */
public class AlbumsActivity extends AppCompatActivity {

    /**
     * @Function this function is the entry point for any android app
     * @param savedInstanceState the current state of the app
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // types of media stored in array list to be displayed
        ArrayList<String> data = new ArrayList<>();
        data.add("Audio Books");
        data.add("Bluetooth");
        data.add("cassettes");
        data.add("MP3 Recordings");
        data.add("Music");
        data.add("Music Recordings");
        data.add("Podcasts");
        data.add("Records");
        data.add("WhatsApp Audio");

        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this, R.layout.simple_text_view, data);
        ListView listView = findViewById(R.id.activity_list);

        listView.setAdapter(adapter);

    }
}
