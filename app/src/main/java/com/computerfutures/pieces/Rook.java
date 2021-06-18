package com.computerfutures.pieces;

import com.computerfutures.board.BoardSquare;

import java.util.ArrayList;

public class Rook extends ChessPiece{
    public Rook(int owner, BoardSquare square) {
        super(owner, square);
    }

    @Override
    public ArrayList<BoardSquare> getPossibleMoves() {
        return null;
    }
}
