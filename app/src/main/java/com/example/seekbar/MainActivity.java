package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    TextView tvshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar=findViewById(R.id.seekBar);
        tvshow=findViewById(R.id.tvshow);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int p=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                p=progress;
                tvshow.setTextSize(p);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}