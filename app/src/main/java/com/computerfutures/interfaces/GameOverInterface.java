package com.computerfutures.interfaces;

public interface GameOverInterface {
    void checkmateOccurred(int owner_color);
    void ownerQuit(int owner_color);
    void isStalemate();
}
