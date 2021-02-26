package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scannerVariable = new Scanner(System.in);
        String playerone = null;
        String playertwo = null;
        int zug1check = -1;
        int zug2check = -1;
        //If false dann player1 if true dann player2
        boolean player = false;



        int[] board = new int[9];
        for(int i = 0; i < board.length; i++){
            board[i] = 7;
        }
        printboard(board);
        getPlayers();


        //Erster Zug
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        player = true;

        //zweiter Zug
        System.out.println("Spieler 2 ist an der Reihe: ");
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        player = false;

        //Dritter Zug
        System.out.println("Spieler 1 ist an der Reihe: ");
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        player = true;

        //Vierter Zug
        System.out.println("Spieler 2 ist an der Reihe: ");
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        player = false;

        //Fünfter Zug
        System.out.println("Spieler 1 ist an der Reihe: ");
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        winnercheck(board);
        player = true;

        //Sechster Zug
        System.out.println("Spieler 2 ist an der Reihe: ");
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        winnercheck(board);
        player = false;

        //Siebter Zug
        System.out.println("Spieler 1 ist an der Reihe: ");
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        winnercheck(board);
        player = true;

        //Achter Zug
        System.out.println("Spieler 1 ist an der Reihe: ");
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        winnercheck(board);
        player = false;

        //Neunter Zug
        System.out.println("Spieler 1 ist an der Reihe: ");
        zug1class(player, playerone, playertwo, board, zug2check);
        printboard(board);
        winnercheck(board);
        player = true;





    }

    public static void printboard(int[] meinBoard){
        System.out.println( "|" + meinBoard[0] + "|" + meinBoard[1]+ "|" + meinBoard[2] + "|" );
        System.out.println("|" +"_____" + "|" );
        System.out.println("|" + meinBoard[3] + "|" + meinBoard[4]+ "|" + meinBoard[5] + "|" );
        System.out.println("|" + "_____" + "|" );
        System.out.println("|" + meinBoard[6] + "|" + meinBoard[7]+ "|" + meinBoard[8] + "|" );


    }
    public static void winnercheck(int[] meinBoard){
        if(meinBoard[0] == meinBoard[1] && meinBoard[0] == meinBoard[2] && meinBoard[0] != 7){
            if(meinBoard[0] == 0){
                System.out.println("Player 1 hat gewonnen!");
                System.exit(0);


            }
            else if(meinBoard[0] == 1){

                System.out.println("Player 2 hat gewonnen!");
                System.exit(0);


            }


        }
        else if(meinBoard[3] == meinBoard[4] && meinBoard[3] == meinBoard[4] && meinBoard[0] != 7){
            if(meinBoard[3] == 0){
                System.out.println("Player 1 hat gewonnen!");
                System.exit(0);


            }
            else if(meinBoard[3] == 1){

                System.out.println("Player 2 hat gewonnen!");
                System.exit(0);


            }


        }

        else if(meinBoard[6] == meinBoard[7] && meinBoard[6] == meinBoard[7] && meinBoard[0] != 7){
            if(meinBoard[6] == 0){
                System.out.println("Player 1 hat gewonnen!");
                System.exit(0);


            }
            else if(meinBoard[6] == 1){

                System.out.println("Player 2 hat gewonnen!");
                System.exit(0);


            }


        }

        else if(meinBoard[0] == meinBoard[3] && meinBoard[0] == meinBoard[6] && meinBoard[0] != 7){
            if(meinBoard[0] == 0){
                System.out.println("Player 1 hat gewonnen!");
                System.exit(0);


            }
            else if(meinBoard[0] == 1){

                System.out.println("Player 2 hat gewonnen!");
                System.exit(0);


            }


        }

        else if(meinBoard[1] == meinBoard[4] && meinBoard[1] == meinBoard[7] && meinBoard[0] != 7){
            if(meinBoard[1] == 0){
                System.out.println("Player 1 hat gewonnen!");
                System.exit(0);


            }
            else if(meinBoard[1] == 1){

                System.out.println("Player 2 hat gewonnen!");
                System.exit(0);


            }


        }

        else if(meinBoard[2] == meinBoard[5] && meinBoard[2] == meinBoard[8] && meinBoard[0] != 7){
            if(meinBoard[2] == 0){
                System.out.println("Player 1 hat gewonnen!");
                System.exit(0);


            }
            else if(meinBoard[2] == 1){

                System.out.println("Player 2 hat gewonnen!");
                System.exit(0);


            }


        }

        else if(meinBoard[0] == meinBoard[4] && meinBoard[0] == meinBoard[8] && meinBoard[0] != 7){
            if(meinBoard[0] == 0){
                System.out.println("Player 1 hat gewonnen!");
                System.exit(0);


            }
            else if(meinBoard[0] == 1){

                System.out.println("Player 2 hat gewonnen!");
                System.exit(0);


            }


        }

        else if(meinBoard[2] == meinBoard[4] && meinBoard[2] == meinBoard[6] && meinBoard[0] != 7){
            if(meinBoard[2] == 0){
                System.out.println("Player 1 hat gewonnen!");
                System.exit(0);


            }
            else if(meinBoard[2] == 1){

                System.out.println("Player 2 hat gewonnen!");
                System.exit(0);


            }


        }




    }



    public static void getPlayers(){
        Scanner scannerVariable = new Scanner(System.in);
        System.out.println("Spieler 1 Name :");
        String playerone = scannerVariable.nextLine();
        System.out.println("Spieler 2 Name :");
        String playertwo = scannerVariable.nextLine();
        System.out.println("Hallo " + playerone + " und " + playertwo );
        System.out.println("Spieler 1 ist am Zug. Wähle ein Feld!");



    }

    public static void zug1class(boolean player, String playerone1, String playertwo2, int[] meinBoard, int check){
        int[] board2 = meinBoard;
        boolean playercheck = player;
        int zug1check2 = check;
        Scanner scannerVariable = new Scanner(System.in);
        int zug = scannerVariable.nextInt();
        if (player == false){

            if(zug >= 9 || zug < 0){

                System.out.println("Dieses Feld gibt es nicht! Versuche es erneut!");
                zug1class(player, playerone1, playertwo2, board2,zug1check2 );
            }
            else if (zug < 9 || zug > 0){


                check = zug;
                System.out.println(check);
                meinBoard[zug] = 0;
            }
        }
        else if (player == true){

            if(zug >= 9 || zug < 0){

                System.out.println("Dieses Feld gibt es nicht! Versuche es erneut!");
                zug1class(player, playerone1, playertwo2, board2,zug1check2 );
            }
            else if (zug < 9 || zug > 0){


                check = zug;
                System.out.println(check);
                meinBoard[zug] = 1;
            }
        }



    }


}

