package com.example.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,btn23;
    Button btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39,btn40,btn41,btn42,btn43,btn44,btn45;
    Button btn46,btn47,btn48,btn49,btn50,btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,btn59;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        btn26 = findViewById(R.id.btn26);
        btn27 = findViewById(R.id.btn27);
        btn28 = findViewById(R.id.btn28);
        btn29 = findViewById(R.id.btn29);
        btn30 = findViewById(R.id.btn30);
        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);
        btn35 = findViewById(R.id.btn35);
        btn36 = findViewById(R.id.btn36);
        btn37 = findViewById(R.id.btn37);
        btn38 = findViewById(R.id.btn38);
        btn39 = findViewById(R.id.btn39);
        btn40 = findViewById(R.id.btn40);
        btn41 = findViewById(R.id.btn41);
        btn42 = findViewById(R.id.btn42);
        btn43 = findViewById(R.id.btn43);
        btn44 = findViewById(R.id.btn44);
        btn45 = findViewById(R.id.btn45);
        btn46 = findViewById(R.id.btn46);
        btn47 = findViewById(R.id.btn47);
        btn48 = findViewById(R.id.btn48);
        btn49 = findViewById(R.id.btn49);
        btn50 = findViewById(R.id.btn50);
        btn51 = findViewById(R.id.btn51);
        btn52 = findViewById(R.id.btn52);
        btn53 = findViewById(R.id.btn53);
        btn54 = findViewById(R.id.btn54);
        btn55 = findViewById(R.id.btn55);
        btn56 = findViewById(R.id.btn56);
        btn57 = findViewById(R.id.btn57);
        btn58 = findViewById(R.id.btn58);
        btn59 = findViewById(R.id.btn59);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null){
                    mediaPlayer.release();
                    mediaPlayer = null;
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip1);
                    mediaPlayer.start();
                }else {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip1);
                    mediaPlayer.start();
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null){
                    mediaPlayer.release();
                    mediaPlayer = null;
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip2);
                    mediaPlayer.start();
                }else{
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip2);
                    mediaPlayer.start();
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null){
                    mediaPlayer.release();
                    mediaPlayer = null;
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip3);
                    mediaPlayer.start();
                }else {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip3);
                    mediaPlayer.start();
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null){
                    mediaPlayer.release();
                    mediaPlayer = null;
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip4);
                    mediaPlayer.start();
                }else {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip4);
                    mediaPlayer.start();
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null){
                    mediaPlayer.release();
                    mediaPlayer = null;
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip5);
                    mediaPlayer.start();
                }else {
                    mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.clip5);
                    mediaPlayer.start();
                }

            }
        });

    }
}
