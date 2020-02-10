package com.example.relja.diplomskirad;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class profil extends Fragment {
    private Button dugme4;
    private EditText text2, text4, text6, text8;

    public profil(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_profil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        text2 = view.findViewById(R.id.imeProfil2);
        text4 = view.findViewById(R.id.telefonProfil2);
        text6 = view.findViewById(R.id.mailProfil2);
        text8 = view.findViewById(R.id.adresaProfil2);
        dugme4 = view.findViewById(R.id.prihvati);

                dugme4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (text2.isEnabled()){
                            text2.setEnabled(false);
                            text2.setCursorVisible(false);
                            text2.setBackgroundResource(android.R.color.transparent);
                        }else{
                            text2.setEnabled(true);
                            text2.setCursorVisible(true);
                            text2.setBackgroundResource(android.R.color.white);
                        }

                        if (text4.isEnabled()){
                            text4.setEnabled(false);
                            text4.setCursorVisible(false);
                            text4.setBackgroundResource(android.R.color.transparent);
                        }else{
                            text4.setEnabled(true);
                            text4.setCursorVisible(true);
                            text4.setBackgroundResource(android.R.color.white);
                        }

                        if (text6.isEnabled()){
                            text6.setEnabled(false);
                            text6.setCursorVisible(false);
                            text6.setBackgroundResource(android.R.color.transparent);
                        }else{
                            text6.setEnabled(true);
                            text6.setCursorVisible(true);
                            text6.setBackgroundResource(android.R.color.white);
                        }

                        if (text8.isEnabled()){
                            text8.setEnabled(false);
                            text8.setCursorVisible(false);
                            text8.setBackgroundResource(android.R.color.transparent);
                        }else{
                            text8.setEnabled(true);
                            text8.setCursorVisible(true);
                            text8.setBackgroundResource(android.R.color.white);
                        }
                    }
                });


            }
}
