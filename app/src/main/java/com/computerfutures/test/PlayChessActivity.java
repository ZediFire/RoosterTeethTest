package com.computerfutures.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.computerfutures.game.Game;
import com.computerfutures.interfaces.GameOverInterface;

public class PlayChessActivity extends AppCompatActivity implements GameOverInterface {

    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_chess);
        Game game = new Game(this);
        game.play();
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void checkmateOccurred(int owner_color) {
        //display some winning screen, maybe with balloons??
    }

    @Override
    public void ownerQuit(int owner_color) {
        //display that one player has quit
    }

    @Override
    public void isStalemate() {
        //display stalemate and ask if the users would like a rematch
    }
}