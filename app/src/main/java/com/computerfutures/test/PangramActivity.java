package com.computerfutures.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PangramActivity extends AppCompatActivity {

    EditText edtPangramTest;
    TextView tvPangramResults;
    Button btnSubmit, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pangram);

        edtPangramTest = (EditText) findViewById(R.id.edtPangramTest);
        tvPangramResults = (TextView) findViewById(R.id.tvPangramResults);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sentence = edtPangramTest.getText().toString();
                String pangramResults = getPangramMissingAlpha(sentence);
                tvPangramResults.setText(pangramResults);
            }
        });

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    /*

    The sentence “A quick brown fox jumps over the lazy dog” contains every single letter in the alphabet.
    Such sentences are called pangrams. You are to write a function, which takes a sentence, and returns all the letters it is missing
     (which prevent it from being a pangram).
     The sentence coming in can have upper and lowercase letters, but your return should be all lowercase letters,
     in alphabetical order. You should also ignore all non-US-ASCII characters.
     If the input sentence is already a pangram, print out the string NULL.
     */

    private String getPangramMissingAlpha(String sentence){
        String missingAlpha = "NULL";
        sentence = sentence.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = 0; i < alphabet.length; i++){
            char characterToCheck = alphabet[i];
            if(sentence.indexOf(characterToCheck) <0){
                sb.append(characterToCheck);
            }
        }
        if(sb.length() >0){
            missingAlpha = sb.toString();
        }
        return  missingAlpha;
    }
}