package com.android.launcher2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.android.launcher.R;

/**
 * Created by Fraggel on 16/11/13.
 */
public class jiayuLauncherConfig extends Activity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
    SeekBar s1 =null;
    SeekBar s2 =null;
    SeekBar s3 =null;
    SeekBar s4=null;
    TextView t1=null;
    TextView t2=null;
    TextView t3=null;
    TextView t4=null;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiayu_launcher_config);
        s1 =(SeekBar)findViewById(R.id.seekBar);
        s2 =(SeekBar)findViewById(R.id.seekBar2);
        s3 =(SeekBar)findViewById(R.id.seekBar3);
        s4 =(SeekBar)findViewById(R.id.seekBar4);
        t1 =(TextView)findViewById(R.id.textView3);
        t2 =(TextView)findViewById(R.id.textView4);
        t3 =(TextView)findViewById(R.id.textView6);
        t4 =(TextView)findViewById(R.id.textView7);

        s1.setOnSeekBarChangeListener(this);
        s2.setOnSeekBarChangeListener(this);
        s3.setOnSeekBarChangeListener(this);
        s4.setOnSeekBarChangeListener(this);
        Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            if(seekBar.getId()==R.id.seekBar){
               t1.setText(String.valueOf(progress));
            }else if(seekBar.getId()==R.id.seekBar2){
                t2.setText(String.valueOf(progress));
            }else if(seekBar.getId()==R.id.seekBar3){
                int percent=0;
                if(progress==0){
                    percent=50;
                }
                if(progress==1){
                    percent=75;
                }
                if(progress==2){
                    percent=100;
                }
                if(progress==3){
                    percent=125;
                }
                if(progress==4){
                    percent=150;
                }
                t4.setText(String.valueOf(percent)+"%");

            }else if(seekBar.getId()==R.id.seekBar4){
                t3.setText(String.valueOf(progress));
            }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(View v) {
        Utils.setSharedPreferences(getApplicationContext(),"mScroolX","7");
        System.exit(0);
        return;
    }
}