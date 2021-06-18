package com.computerfutures.board;

import android.app.Activity;
import android.content.Context;

import com.computerfutures.pieces.ChessPiece;

import java.util.ArrayList;

public class ChessBoard {

    private BoardSquare[][] boardSquares;
    ArrayList<ChessPiece> blackChessPieces = new ArrayList<ChessPiece>();
    ArrayList<ChessPiece> whiteChessPieces = new ArrayList<ChessPiece>();
    private boolean isWhiteTurn = true;

    public ChessBoard() {
        this.boardSquares = new BoardSquare[8][8];
    }

    public BoardSquare[][] getBoardSquares() {
        return boardSquares;
    }
    public boolean getCurrentTurn(){
        return  isWhiteTurn;
    }
    public void switchCurrentTurn(){
        isWhiteTurn = !isWhiteTurn;
    }

    //Places the pieces in the proper order on the chess board
    public void setupBoard(Context ctx){

    }
}
