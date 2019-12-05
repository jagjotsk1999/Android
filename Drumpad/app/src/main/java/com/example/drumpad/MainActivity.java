package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*public int randomColor()
    {
        Random random= new Random();
        return Color.argb(255, random.nextInt(256), random.nextInt(256),
                random.nextInt(256));
    }*/

    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
    int[] colors={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.drum};
    int[] magic={R.drawable.magic,R.drawable.magic1,R.drawable.magic2};
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1=MediaPlayer.create(MainActivity.this, R.raw.one);
        m2=MediaPlayer.create(MainActivity.this, R.raw.two);
        m3=MediaPlayer.create(MainActivity.this, R.raw.three);
        m4=MediaPlayer.create(MainActivity.this, R.raw.four);
        m5=MediaPlayer.create(MainActivity.this, R.raw.fv);
        m6=MediaPlayer.create(MainActivity.this, R.raw.sixth);
        m7=MediaPlayer.create(MainActivity.this, R.raw.seventh);
        m8=MediaPlayer.create(MainActivity.this, R.raw.eighth);
        /*b=findViewById(R.id.one);
                Random random= new Random();
                int c=Color.argb(255, random.nextInt(256), random.nextInt(256),
                        random.nextInt(256));
                b.setBackgroundColor(c);*/
            }

    @Override
    public void onClick(View view) {
    int id= view.getId();
    int c=(int)Math.abs(Math.round(Math.random()*magic.length-1));
    view.setBackgroundResource(magic[c]);
    switch(id)
    {
        case R.id.one:
            m1.start();
            //Toast.makeText(MainActivity.this, "one", Toast.LENGTH_SHORT).show();
            //Toast.makeText(MainActivity.this,""+c, Toast.LENGTH_SHORT).show();
            //findViewById(view.getId()).setBackgroundColor(R.drawable.one);
            break;
        case R.id.two:
            m2.start();
            break;
        case R.id.three:
            m3.start();
            break;
        case R.id.four:
            m4.start();
            break;
        case R.id.five:
            m5.start();
            break;
        case R.id.six:
            m6.start();
            break;
        case R.id.seven:
            m7.start();
            break;
        case R.id.eight:
            m8.start();
            break;
    }
    }
}
