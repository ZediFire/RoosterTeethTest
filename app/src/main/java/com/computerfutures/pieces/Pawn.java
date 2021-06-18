package com.computerfutures.pieces;

import com.computerfutures.board.BoardSquare;

import java.util.ArrayList;

public class Pawn extends ChessPiece {

    public Pawn(int owner, BoardSquare square) {
        super(owner, square);
    }

    @Override
    public ArrayList<BoardSquare> getPossibleMoves() {
        return null;
    }
}
