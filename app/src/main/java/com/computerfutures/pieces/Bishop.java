package com.computerfutures.pieces;

import com.computerfutures.board.BoardSquare;

import java.util.ArrayList;

public class Bishop extends ChessPiece{

    public Bishop(int owner, BoardSquare square) {
        super(owner, square);
    }

    @Override
    public ArrayList<BoardSquare> getPossibleMoves() {
        return null;
    }
}
