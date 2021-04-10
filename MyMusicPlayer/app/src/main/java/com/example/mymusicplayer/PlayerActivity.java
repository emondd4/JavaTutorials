package com.example.mymusicplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.io.File;
import java.util.ArrayList;

import static com.example.mymusicplayer.R.color.colorPrimaryDark;

public class PlayerActivity extends AppCompatActivity {

    TextView songTitle,startTimeText,endTimeText;
    Button btn_nxt,btn_play,btn_previous;
    SeekBar seekBar;

    static MediaPlayer myMediaPlayer;
    int position;
    int currentPosition = 0;
    int track;
    int flag=0;

    ArrayList<File> mySongs;
    String sname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        songTitle = findViewById(R.id.songTitle);
        btn_nxt = findViewById(R.id.next);
        btn_play = findViewById(R.id.play_pause);
        btn_previous = findViewById(R.id.previous);
        seekBar = findViewById(R.id.seekbar);
        startTimeText = findViewById(R.id.startingText);
        endTimeText = findViewById(R.id.endingText);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        getSupportActionBar().setTitle("Now Playing");

        //this handler is for handle the song current time and current seekbar progress
        final Handler updateSeekBar = new Handler();
        PlayerActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (myMediaPlayer != null){
                    currentPosition = myMediaPlayer.getCurrentPosition()/1000;
                    seekBar.setProgress(currentPosition);
                    startTimeText.setText(createTimerLabel(currentPosition));
                }
                updateSeekBar.postDelayed(this,1000);
            }
        });

//        //normal condition check if media player is not null to
        if (myMediaPlayer != null){
            myMediaPlayer.stop();
            myMediaPlayer.release();
        }

        //passing the extras putted from the main activity or item selection or song selection activity
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        mySongs = (ArrayList) bundle.getParcelableArrayList("songs");
        sname = mySongs.get(position).getName().toString();
        String songName = i.getStringExtra("songname");
        songTitle.setText(songName);
        songTitle.setSelected(true);
        position = bundle.getInt("pos",0);

        //calling method to play song
        NextSongOnLine();

        //seekbar color changing method
        seekBar.getProgressDrawable().setColorFilter(getColor(colorPrimaryDark),PorterDuff.Mode.MULTIPLY);
        seekBar.getThumb().setColorFilter(getColor(colorPrimaryDark), PorterDuff.Mode.SRC_IN);

        //completetion method error to make decision what to do after song end
        myMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                switch (what) {
                    case MediaPlayer.MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK:
                        Log.e("MediaPlayer Error", "MEDIA ERROR NOT VALID FOR PROGRESSIVE PLAYBACK " + extra);
                        break;
                    case MediaPlayer.MEDIA_ERROR_SERVER_DIED:
                        Log.e("MediaPlayer Error", "MEDIA ERROR SERVER DIED " + extra);
                        break;
                    case MediaPlayer.MEDIA_ERROR_UNKNOWN:
                        Log.e("MediaPlayer Error", "MEDIA ERROR UNKNOWN " + extra);
                        break;
                }
                return true;
            }
        });

        //seekbar user control methods
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (myMediaPlayer != null && fromUser){
                    myMediaPlayer.seekTo(progress*1000);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar.setMax(myMediaPlayer.getDuration()/1000);
                if (myMediaPlayer.isPlaying()){
                    btn_play.setBackgroundResource(R.drawable.ic_play);
                    myMediaPlayer.pause();
                    Toast.makeText(getApplicationContext(),"Paused",Toast.LENGTH_SHORT).show();
                }else{
                    btn_play.setBackgroundResource(R.drawable.ic_pause);
                    myMediaPlayer.start();
                    Toast.makeText(getApplicationContext(),"Played",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMediaPlayer.stop();
                myMediaPlayer.release();
                position = ((position + 1)%mySongs.size());
                Uri uri3 = Uri.parse(mySongs.get(position).toString());
                myMediaPlayer = MediaPlayer.create(getApplicationContext(),uri3);

                sname = mySongs.get(position).getName().toString();
                songTitle.setText(sname);

                myMediaPlayer.start();
                seekBar.setMax(myMediaPlayer.getDuration()/1000);

                //set End time of music
                endTimeText.setText(createTimerLabel(myMediaPlayer.getDuration()/1000));
                Toast.makeText(getApplicationContext(),"Next Song is Being Played",Toast.LENGTH_SHORT).show();
            }
        });
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMediaPlayer.stop();
                myMediaPlayer.release();
                position = ((position - 1)<0)?(mySongs.size()-1):(position -1);

                Uri uri2 = Uri.parse(mySongs.get(position).toString());
                myMediaPlayer = MediaPlayer.create(getApplicationContext(),uri2);

                sname = mySongs.get(position).getName().toString();
                songTitle.setText(sname);

                myMediaPlayer.start();
                seekBar.setMax(myMediaPlayer.getDuration()/1000);

                endTimeText.setText(createTimerLabel(myMediaPlayer.getDuration()/1000));
                Toast.makeText(getApplicationContext(),"Previous Song is Being Played",Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    //timelable creating for starting time
    public String createTimerLabel(int duration){
        String timerLabel = "";
        int min = duration / 60;
        int sec = duration % 60;
        timerLabel += min + ":";
        if (sec < 10) timerLabel += "0";
        timerLabel += sec;
        return timerLabel;
    }

    public void NextSongOnLine(){
        if (flag == 0){
            track = position;
            flag = 1;
        }else {
            position = ((position + 1)%mySongs.size());
        }
        if (track == position){
            Uri uri3 = Uri.parse(mySongs.get(position).toString());
            myMediaPlayer = MediaPlayer.create(getApplicationContext(),uri3);

            sname = mySongs.get(position).getName().toString();
            songTitle.setText(sname);

            myMediaPlayer.start();
            seekBar.setMax(myMediaPlayer.getDuration()/1000);

            //set End time of music
            endTimeText.setText(createTimerLabel(myMediaPlayer.getDuration()/1000));

        }
        track++;
        myMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                NextSongOnLine();
                Toast.makeText(getApplicationContext(),"Auto Playing Next Song",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
