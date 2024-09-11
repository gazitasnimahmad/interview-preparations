package com.Interview.lowleveldesign.Chess;

import com.Interview.lowleveldesign.Chess.Pieces.*;

public class Board {
    private Cell[][] cells;

    public Board() {
        this.cells = new Cell[8][8];
        resetboard();
    }

    public void resetboard(){
        // initilization logic
        // Setting White Pieces
        cells[0][0] = new Cell(0,0,new Rook(true));
        cells[0][1] = new Cell(0,1,new Knight(true));
        cells[0][2] = new Cell(0,2,new Bishop(true));
        cells[0][3] = new Cell(0,3,new Queen(true));
        cells[0][4] = new Cell(0,4,new King(true));
        cells[0][5] = new Cell(0,5,new Bishop(true));
        cells[0][6] = new Cell(0,6,new Knight(true));
        cells[0][7] = new Cell(0,7,new Rook(true));
        for(int j=0; j<8 ; j++){
            cells[1][j] = new Cell(1,j,new Pawn(true));
        }
        //Setting Black Pieces
        cells[7][0] = new Cell(7,0,new Rook(false));
        cells[7][1] = new Cell(7,1,new Knight(false));
        cells[7][2] = new Cell(7,2,new Bishop(false));
        cells[7][3] = new Cell(7,3,new Queen(false));
        cells[7][4] = new Cell(7,4,new King(false));
        cells[7][5] = new Cell(7,5,new Bishop(false));
        cells[7][6] = new Cell(7,6,new Knight(false));
        cells[7][7] = new Cell(7,7,new Rook(false));
        for(int j=0; j<8 ; j++){
            cells[6][j] = new Cell(6,j,new Pawn(false));
        }
        // Defining rest of the cells having no pieces
        for(int i=2;i<6;i++){
            for( int j=0; j<8; j++){
                cells[i][j] = new Cell(i,j,null);
            }
        }

    }

    public Cell getCell(int x, int y){
        return cells[x][y];
    }
}
