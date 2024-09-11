package com.Interview.lowleveldesign.Chess.Pieces;

public abstract class Piece {

    private boolean isWhite;

    public Piece(boolean isWhite){
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }
}
