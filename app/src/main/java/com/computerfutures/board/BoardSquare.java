package com.computerfutures.board;


import com.computerfutures.pieces.ChessPiece;

public class BoardSquare {
    private ChessBoard chessBoard;
    private int xPos;
    private int yPos;
    private int color;
    private ChessPiece pieceOnSquare = null;

    public BoardSquare(ChessBoard cb, int color, int xPos, int yPos){
        this.chessBoard = cb;
        this.color = color;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getColor(){
        return this.color;
    }

    public ChessPiece getPieceOnSquare(){
        return pieceOnSquare;
    }

    public int getXPos(){
        return  xPos;
    }

    public int getYPos(){
        return  yPos;
    }

    public void addChessPiece(ChessPiece piece){
        this.pieceOnSquare = piece;
    }

    public void removeChessPiece(){
        this.pieceOnSquare = null;
    }

}
