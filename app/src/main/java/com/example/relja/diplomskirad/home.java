package com.example.relja.diplomskirad;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class home extends Fragment {
    private Button dugmeLogin, dugme;
    private String text1;
    private String text3 = "Hemera";
    private EditText text2;

    public home() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_home, container, false);

    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dugmeLogin = view.findViewById(R.id.dugmeLogin);
        dugme = view.findViewById(R.id.dugme);
        text2 = view.findViewById(R.id.search);

        dugmeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), login.class) ;
                getActivity().startActivity(intent);
            }
        });

        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1 = text2.getText().toString();
                if (text1.equals(text3)){
                    Intent intent = new Intent(getActivity(), hemera.class) ;
                    getActivity().startActivity(intent);
                }else{
                    Toast.makeText(getActivity(), "Ne postoji takav kafic.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
