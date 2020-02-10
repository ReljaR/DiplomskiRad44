package com.example.relja.diplomskirad;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.relja.diplomskirad.R;

public class adminInt extends Activity {

    private Button manje;
    private Button vise;
    private TextView vrijednost;
    private static int brojac = 10;
    private String stringV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manje = (Button) findViewById(R.id.button1);
        vise = (Button) findViewById(R.id.button2);
        vrijednost = (TextView) findViewById(R.id.textView1);

        manje.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d("src", "Spustanje vrijednosti...");
                brojac--;
                stringV = Integer.toString(brojac);
                vrijednost.setText(stringV);
            }
        });

        vise.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d("src", "Dizanje vrijednosti...");
                brojac++;
                stringV = Integer.toString(brojac);
                vrijednost.setText(stringV);
            }
        });

    }
}
