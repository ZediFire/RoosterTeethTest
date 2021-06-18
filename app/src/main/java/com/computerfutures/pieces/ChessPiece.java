package com.computerfutures.pieces;

import com.computerfutures.board.BoardSquare;

import java.util.ArrayList;

public abstract class ChessPiece {
    private BoardSquare currentSquare;
    private int owner_color;
    private ArrayList<PieceMove> moveHistory;


    public ChessPiece(int owner, BoardSquare square) {
        this.owner_color = owner;
        this.currentSquare = square;
        moveHistory = new ArrayList<PieceMove>();
    }

    //moves the actual chess piece with replacement if necessary
    public void move(BoardSquare endSquare) {
        PieceMove pieceMove = new PieceMove();
        pieceMove.setChessPiece(this);
        pieceMove.setFromPosition(currentSquare);
        ChessPiece piece = endSquare.getPieceOnSquare();
        if (isLegalMove(endSquare)) {
            if (piece != null) {
                endSquare.removeChessPiece();
            }
            currentSquare.removeChessPiece();
            ;
            currentSquare = endSquare;
            currentSquare.addChessPiece(this);

            pieceMove.setFromPosition(endSquare);
            moveHistory.add(pieceMove);
        }

    }

    //determines if user attempted move is within the possible moves for the piece
    public boolean isLegalMove(BoardSquare endSquare) {
        boolean isLegal = false;
        ArrayList<BoardSquare> possibleMoves = getPossibleMoves();
        for (int i = 0; i < possibleMoves.size(); i++) {
            BoardSquare possibleMove = possibleMoves.get(i);
            if (endSquare.getXPos() == possibleMove.getXPos() && endSquare.getYPos() == possibleMove.getYPos()) {
                isLegal = true;
                break;
            }
        }
        return isLegal;

    }

    //add the move to an array of moves - maybe users can walk backwards through previous moves during gameplay?
    public PieceMove getLastMove() {
        PieceMove pieceMove = null;
        if (moveHistory.size() > 0)
            pieceMove = moveHistory.get(moveHistory.size() - 1);
        return pieceMove;
    }

    public int getOwner_color() {
        return owner_color;
    }

    //Must be extended, each piece has its own rules for moving
    public abstract ArrayList<BoardSquare> getPossibleMoves();
}
