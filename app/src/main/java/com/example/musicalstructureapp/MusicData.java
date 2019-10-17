package com.example.musicalstructureapp;

/**
 * @Autor mahmoud
 * @version 1
 * @since 15 oct 2019
 * this class is for storing 2 text data (textviews)
 * to be able to display them as one text
 */
class MusicData {

    private String
            song,
            artist;


    /**
     * this is the constructor of this class which initialize the class attributes
     * @param song it is the song name
     * @param artist it is the artist name
     */
    MusicData(String song, String artist) {
        this.song = song;
        this.artist = artist;
    }

    /**
     * this function to access song name
     * @return song name
     */
    String getSong() {
        return song;
    }

    /**
     * this function to access song name
     * @return artist name
     */
    String getArtist() {
        return artist;
    }
}
