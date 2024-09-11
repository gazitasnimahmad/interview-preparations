package com.Interview.lowleveldesign.Chess;

import com.Interview.lowleveldesign.Chess.Pieces.Piece;

import java.util.List;

public class Game {

    private Board chessBoard;
    private List<Player> players;
    private Player activePlayer;

    public Game(Board chessBoard, List<Player> players) {
        this.chessBoard = chessBoard;
        this.players = players;
        this.activePlayer = players.get(0) ;//white will start first
    }

//    public boolean makeMove(Cell start, Cell end){
//        Piece piece = start.getPiece();
//
//        if(piece != null && piece.isWhite()==activePlayer)
//    }

    public Board getChessBoard() {
        return chessBoard;
    }

    public void switchPlayer(){
        activePlayer = activePlayer.equals(players.get(0)) ? players.get(1) : players.get(0);
    }

    public boolean isCheckmate(){
        return false;
    }

    public Player getCurrentPlayer(){
        return activePlayer;
    }
}
