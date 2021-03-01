package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean[] fieldtakencheck = new boolean[9];
        for(int i = 0; i < 9; i++) {
            fieldtakencheck[i] = false;
        }
        int[] board = new int[9];

        //If False Player one ist an der Reihe
        boolean currentplayer = false;


        //Zeigt Board
        System.out.println("Die Reihenfolge der Felder:");
        for(int i = 0; i < 9; i++) {
            board[i] = i;
        }

        printBoard(board);


        //Set Board to default value 7
        for(int i = 0; i < 9; i++) {
            board[i] = 7;
        }

        zug(board,currentplayer, fieldtakencheck);
        currentplayer = true;
        printBoard(board);

        zug(board, currentplayer, fieldtakencheck);
        currentplayer = false;
        printBoard(board);


        zug(board,currentplayer, fieldtakencheck);
        currentplayer = true;
        printBoard(board);


        zug(board, currentplayer, fieldtakencheck);
        currentplayer = false;
        printBoard(board);


        zug(board,currentplayer, fieldtakencheck);
        currentplayer = true;
        printBoard(board);
        checkWinner(board);


        zug(board, currentplayer, fieldtakencheck);
        currentplayer = false;
        printBoard(board);
        checkWinner(board);


        zug(board,currentplayer, fieldtakencheck);
        currentplayer = true;
        printBoard(board);
        checkWinner(board);


        zug(board, currentplayer, fieldtakencheck);
        currentplayer = false;
        printBoard(board);
        checkWinner(board);


        zug(board,currentplayer, fieldtakencheck);
        currentplayer = true;
        printBoard(board);
        checkWinner(board);


        }
    public static void checkWinner(int[] board){
        if(board[0] == board[1] && board[0] == board[2]){
            if (board[0] == 0){
                System.out.println("Spieler 1 hat gewonnen!");
                System.exit(0);

            }
            else if(board[0] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }
        else if(board[3] == board[4] && board[3] == board[5]){
            if(board[3] == 0){
                System.out.println("Spieler 1 hat gewonnen");
                System.exit(0);
            }
            else if(board[3] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }

        else if(board[6] == board[7] && board[6] == board[8]){
            if(board[6] == 0){
                System.out.println("Spieler 1 hat gewonnen");
                System.exit(0);
            }
            else if(board[6] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }
        else if(board[3] == board[4] && board[3] == board[5]){
            if(board[3] == 0){
                System.out.println("Spieler 1 hat gewonnen");
                System.exit(0);
            }
            else if(board[3] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }
        else if(board[0] == board[3] && board[0] == board[6]){
            if(board[0] == 0){
                System.out.println("Spieler 1 hat gewonnen");
                System.exit(0);
            }
            else if(board[0] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }
        else if(board[1] == board[4] && board[1] == board[7]){
            if(board[1] == 0){
                System.out.println("Spieler 1 hat gewonnen");
                System.exit(0);
            }
            else if(board[1] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }
        else if(board[2] == board[5] && board[2] == board[8]){
            if(board[2] == 0){
                System.out.println("Spieler 1 hat gewonnen");
                System.exit(0);
            }
            else if(board[2] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }
        else if(board[0] == board[4] && board[0] == board[8]){
            if(board[0] == 0){
                System.out.println("Spieler 1 hat gewonnen");
                System.exit(0);
            }
            else if(board[0] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }
        else if(board[2] == board[4] && board[2] == board[6]){
            if(board[2] == 0){
                System.out.println("Spieler 1 hat gewonnen");
                System.exit(0);
            }
            else if(board[2] == 1){
                System.out.println("Spieler 2 hat gewonnen!");
                System.exit(0);
            }
        }
        else {
            //Do Nothing
        }

    }



    public static void printBoard(int[] meinBoard){
        System.out.println(meinBoard[0] + "|" + meinBoard[1] +  "|" + meinBoard[2]);
        System.out.println("_____");
        System.out.println(meinBoard[3] + "|" + meinBoard[4] +  "|" + meinBoard[5]);
        System.out.println("_____");
        System.out.println(meinBoard[6] + "|" + meinBoard[7] +  "|" + meinBoard[8]);


    }

    public static  void zug(int[] meinBoard, boolean player, boolean[] fieldtakencheck){
        Scanner scanner = new Scanner(System.in);


        if(player == false){
            System.out.println("Spieler 1 ist an der Reihe.Wähle ein Feld: ");
            int feld = scanner.nextInt();
            if(feld > 9 || feld < 0) {
                System.out.println("Dieses Feld gibt es nicht.Wähle ein Feld von 0-8!");
                zug(meinBoard, player, fieldtakencheck);
            }
            else {
                if(fieldtakencheck[feld] == true){
                    System.out.println("Dieses Feld ist belegt! ");
                    zug(meinBoard, player, fieldtakencheck);
                }
                else{
                    meinBoard[feld] = 0;
                    fieldtakencheck[feld] = true;

                }

            }



        }
        else if (player == true){
            System.out.println("Spieler 2 ist an der Reihe.Wähle ein Feld: ");
            int feld = scanner.nextInt();
            if(feld > 9 || feld < 0) {
                System.out.println("Dieses Feld gibt es nicht.Wähle ein Feld von 0-8!");
                zug(meinBoard, player, fieldtakencheck);
            }
            else {
                if(fieldtakencheck[feld] == true){
                    System.out.println("Dieses Feld ist belegt! ");
                    zug(meinBoard, player, fieldtakencheck);
                }
                else{
                    meinBoard[feld] = 1;
                    fieldtakencheck[feld] = true;

                }

            }

        }

    }



}
