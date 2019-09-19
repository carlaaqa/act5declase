package com.example.carla.act5declase;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String colorHex = "#000000";
    SeekBar rColor, gColor, bColor;
    TextView RedText, GreenText, BlueText, TextViewHex;
    View CuadroColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View colorSample = findViewById(R.id.view);
        colorSample.setBackgroundColor(Color.parseColor(colorHex));

       rColor = findViewById(R.id.rColor);
       gColor = findViewById(R.id.gColor);
       bColor = findViewById(R.id.bColor);
       RedText = findViewById(R.id.RedText);
       GreenText = findViewById(R.id.GreenText);
       BlueText = findViewById(R.id.BlueText);
       CuadroColor = findViewById(R.id.view);
       TextViewHex = findViewById(R.id.TextViewHex);

        rColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String hex = "#" + ColorUtils.decimalTohex(rColor.getProgress()) +
                        ColorUtils.decimalTohex(gColor.getProgress()) +
                        ColorUtils.decimalTohex(bColor.getProgress());
                RedText.setText("R: " + progress);
                TextViewHex.setText(hex);
                CuadroColor.setBackgroundColor(Color.parseColor(hex));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        gColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String hex = "#" + ColorUtils.decimalTohex(rColor.getProgress()) +
                        ColorUtils.decimalTohex(gColor.getProgress()) +
                        ColorUtils.decimalTohex(bColor.getProgress());
                GreenText.setText("R: " + progress);
                TextViewHex.setText(hex);
                CuadroColor.setBackgroundColor(Color.parseColor(hex));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        bColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String hex = "#" + ColorUtils.decimalTohex(rColor.getProgress()) +
                        ColorUtils.decimalTohex(gColor.getProgress()) +
                        ColorUtils.decimalTohex(bColor.getProgress());
                BlueText.setText("R: " + progress);
                TextViewHex.setText(hex);
                CuadroColor.setBackgroundColor(Color.parseColor(hex));
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
