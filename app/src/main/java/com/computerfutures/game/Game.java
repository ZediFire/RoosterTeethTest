package com.computerfutures.game;

import android.app.Activity;
import android.content.Context;

import com.computerfutures.board.ChessBoard;
import com.computerfutures.interfaces.GameOverInterface;
import com.computerfutures.interfaces.MoveListenerInterface;
import com.computerfutures.pieces.ChessPiece;
import com.computerfutures.pieces.PieceMove;

import java.util.ArrayList;

public class Game implements MoveListenerInterface {

    ChessBoard chessBoard;
    private ArrayList<PieceMove> gameMoves;
    GameOverInterface gameOverInterfaceListener;
    Context ctx;
    public Game( Context context){

        chessBoard = new ChessBoard();
        chessBoard.setupBoard(ctx);
        gameMoves = new ArrayList<PieceMove>();

        if(ctx instanceof GameOverInterface)
            gameOverInterfaceListener = (GameOverInterface) ctx;
    }



    //prompt user to use the GUI to move the chess piece somehow
    public void play(){

    }


    @Override
    public void ChessPieceMoved(int owner_color, ChessPiece chessPiece) {
        PieceMove pieceMove = chessPiece.getLastMove();
        if(pieceMove != null && gameMoves != null){
            gameMoves.add(pieceMove);
        }
        if(isCheckMate(owner_color) ) {
            gameOverInterfaceListener.checkmateOccurred(owner_color);
            return;
        }
        if(isStaleMate() ) {
            gameOverInterfaceListener.isStalemate();
            return;
        }
        chessBoard.switchCurrentTurn();
    }

    //Determine if the opposite owner's king has any moves left
    private boolean isCheckMate(int owner_color){
        boolean isCheckMate = false;

        return isCheckMate;
    }

    //Determine if the either king has any moves left ???
    //Not sure what a stalemate is, only know that it means there's a tie of some sort
    private boolean isStaleMate(){
        boolean isStaleMate = false;
        return isStaleMate;
    }




}
