package com.example.musicalstructureapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @Author mahmoud
 * @version 1
 * @since 16 oct 2019
 * @AppFunction  this app is a structure for music app
 * @Description this is the main class , the starting point for the app
 * ##this class implements click listener interface to modify on click function
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // ** 6 ** global variables
    private TextView
            playButton,
            play_next,
            play_previous,
            shuffle,
            repeat,
            library;

    /**
     * @Function this function is the entry point for any android app
     * @param savedInstanceState the current state of the app
     */
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        variablesDefinitions();
        initiateUI();
         /*
          * this button uses on touch listener interface
          * it overrides on touch function to be able to hold its state on touches
          */
        playButton.setOnTouchListener(new View.OnTouchListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (playButton.isPressed()){
                    playButton.setPressed(false);
                    Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                    playButton.setBackground(getDrawable(R.drawable.ic_play_circle_outline_black_24dp));
                }
                else {
                    playButton.setPressed(true);
                    Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
                    playButton.setBackground(getDrawable(R.drawable.ic_pause_circle_outline_black_24dp));
                }
                return false;
            }
        });

    }

    /**
     * @Function this function initiate all the variables values
     */
    private void variablesDefinitions(){
        playButton = findViewById(R.id.play_button);
        play_next = findViewById(R.id.play_next);
        play_previous = findViewById(R.id.play_previous);
        shuffle = findViewById(R.id.shuffle);
        repeat = findViewById(R.id.repeat);
        library = findViewById(R.id.library);
    }

    /**
     * @Function this function initiate the on click listener function
     */
    private void initiateUI (){
        play_next.setOnClickListener(this);
        play_previous.setOnClickListener(this);
        shuffle.setOnClickListener(this);
        repeat.setOnClickListener(this);
        library.setOnClickListener(this);
    }

    /**
     * @Function this function overrides on click function in onclick listener interface
     * @param v it is the current view object
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play_next :
                Toast.makeText(this, "Play next ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.play_previous :
                Toast.makeText(this, "Play previous ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.shuffle :
                Toast.makeText(this, "Shuffle", Toast.LENGTH_SHORT).show();
                break;
            case R.id.repeat :
                Toast.makeText(this, "Repeat", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library :
                startActivity(new Intent(this,LibraryActivity.class));
                break;
            default:
                // just in case of potential errors ^_^
                Toast.makeText(this, "Don't do that ", Toast.LENGTH_LONG).show();
                break;
        }
    }



}
