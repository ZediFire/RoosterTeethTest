package com.computerfutures.pieces;

import com.computerfutures.board.BoardSquare;

import java.util.ArrayList;

public class Queen extends ChessPiece{
    public Queen(int owner, BoardSquare square) {
        super(owner, square);
    }

    @Override
    public ArrayList<BoardSquare> getPossibleMoves() {
        return null;
    }
}
