package com.Interview.lowleveldesign.Chess;

import com.Interview.lowleveldesign.Chess.Pieces.Piece;

public class Cell {

    int x,y;
    Piece piece;

    public Cell(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
