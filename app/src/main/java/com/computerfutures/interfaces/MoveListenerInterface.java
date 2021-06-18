package com.computerfutures.interfaces;

import com.computerfutures.pieces.ChessPiece;

public interface MoveListenerInterface {
    void ChessPieceMoved(int owner_color, ChessPiece chessPiece);
}
