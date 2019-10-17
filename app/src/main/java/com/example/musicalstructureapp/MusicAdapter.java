package com.example.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

/**
 * @Author mahmoud
 * @version 1
 * @since 17 oct 2019
 * this class overrides ArrayAdapter functionality to be able to display
 * 2 text data (textviews)as one text
 */
public class MusicAdapter<M> extends ArrayAdapter {

    /**
     * this is the constructor of this class which initialize the class attributes
     * @param context it is te class ae that will work with
     * @param data it is for the class that we are going to behave like
     */
    MusicAdapter(Context context, ArrayList<M> data) {
        super(context, 0, data);
    }

    /**
     * this function overrides getview to display 2 textviews
     * @param position it is the layout resource id
     * @param convertView original view before modifications
     * @param parent te group of te original view
     * @return  the modified view we need
     */
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_model, parent, false);
        }

        // view Holder to improve performance
        ViewHolder viewHolder = new ViewHolder(convertView);
        MusicData data = (MusicData) getItem(position);

        viewHolder.getTextsong_name().setText(data.getSong());
        viewHolder.getTextartist_name().setText(data.getArtist());

        return convertView;
    }
}
