package com.computerfutures.pieces;

import com.computerfutures.board.BoardSquare;

public class PieceMove {
    private ChessPiece chessPiece;
    private BoardSquare fromPosition;
    private BoardSquare toPosition;

    public ChessPiece getChessPiece(){
        return chessPiece;
    }

    public BoardSquare getFromPosition() {
        return fromPosition;
    }

    public BoardSquare getToPosition() {
        return toPosition;
    }

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }

    public void setFromPosition(BoardSquare fromPosition) {
        this.fromPosition = fromPosition;
    }

    public void setToPosition(BoardSquare toPosition) {
        this.toPosition = toPosition;
    }
}
