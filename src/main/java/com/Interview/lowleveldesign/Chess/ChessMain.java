package com.Interview.lowleveldesign.Chess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChessMain {
    public static void main(){
        Board chessBoard1 = new Board();
        List<Player> players = new ArrayList<>();
        players.add(new Player("tasnim",true));
        players.add(new Player("ayush",false));

        Game game = new Game(chessBoard1,players);

        Scanner sc = new Scanner(System.in);

        while(true){

//            System.out.println("Current Player: " + (game.getCurrentPlayer() ? "White" : "Black"));
            System.out.println("Enter your move (format: startX startY endX endY): ");
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            int endX = sc.nextInt();
            int endY = sc.nextInt();


            Cell startCell = game.getChessBoard().getCell(startX,startY);
            Cell endCell = game.getChessBoard().getCell(endX,endY);

//            if(game.makeMove(startCell,endCell))
//                System.out.print(" Move is successful");
//            else
//                System.out.print(" Invalid , try again");


            if(game.isCheckmate() ==true){
                System.out.print(game.getCurrentPlayer() + " is the winner");
                break;
            }

            game.switchPlayer();
        }


    }
}
