package com.example.musicalstructureapp;

import android.view.View;
import android.widget.TextView;

/**
 * @version 1
 * @Author mahmoud
 * @since 17 oct 2019
 * this class holds all attributes needed for the custom adapter
 * to improve efficiency
 */
class ViewHolder {

    private TextView
            textsong_name,
            textartist_name;

    /**
     * this is the constructor of this class which initialize the class attributes
     *
     * @param convertView it is the view that holds the 2 text views
     */
    ViewHolder(View convertView) {
        textsong_name = convertView.findViewById(R.id.song_name);
        textartist_name = convertView.findViewById(R.id.artist_name);
    }

    /**
     * @return song text view
     * @Function retrieve song text view
     */
    TextView getTextsong_name() {
        return textsong_name;
    }

    /**
     * @return artist text view
     * @Function retrieve artist text view
     */
    TextView getTextartist_name() {
        return textartist_name;
    }
}
