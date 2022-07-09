package com.bridzelab;

import java.util.Random;
import java.util.Scanner;

public class TicTocToe {
    static char[] gameBoard = new char[10];
    static Scanner scanner = new Scanner(System.in);
    static char user = '1';
    static int userPosition;
    static int computerPosition;
    static char computerTurn;
    static char userTurn;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Toc toe Program");
        ticTacToe();
        createBoard();
        userChoose();
    }


    public static void createBoard() {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }

    public static char userChoose() {
        System.out.println("Enter your choice  X or O only");
        return scanner.next().toUpperCase().charAt(0);
    }

    public static void ticTacToe() {
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i] = ' ';
        }
    }

    public static void moveLocation() {
        if (user == '1') {
            System.out.print("Select the position in board from range [0 - 8] : ");
            userPosition = scanner.nextInt();

            switch (userPosition) {
                case 0:
                    if (gameBoard[0] == ' ') {
                        gameBoard[0] = userTurn;
                    }
                    break;
                case 1:
                    if (gameBoard[1] == ' ') {
                        gameBoard[1] = userTurn;
                    }
                    break;
                case 2:
                    if (gameBoard[2] == ' ') {
                        gameBoard[2] = userTurn;
                    }
                    break;
                case 3:
                    if (gameBoard[3] == ' ') {
                        gameBoard[3] = userTurn;
                    }
                    break;
                case 4:
                    if (gameBoard[4] == ' ') {
                        gameBoard[4] = userTurn;
                    }
                    break;
                case 5:
                    if (gameBoard[5] == ' ') {
                        gameBoard[5] = userTurn;
                    }
                    break;
                case 6:
                    if (gameBoard[6] == ' ') {
                        gameBoard[6] = userTurn;
                    }
                    break;
                case 7:
                    if (gameBoard[7] == ' ') {
                        gameBoard[7] = userTurn;
                    }
                    break;
                case 8:
                    if (gameBoard[8] == ' ') {
                        gameBoard[8] = userTurn;
                    }
                    break;
                default:
                    System.out.println("Choose correct number");

            }
        }
    }


    public static void computerMove() {
        boolean flag = false;
        while (true) {
            computerPosition= (int) (Math.random() * 8);
            switch (computerPosition) {
                case 0:
                    if (gameBoard[0] == ' ') {
                        gameBoard[0] = computerTurn;
                        flag = true;
                    }
                    break;

                case 1:
                    if (gameBoard[1] == ' ') {
                        gameBoard[1] = computerTurn;
                        flag = true;
                    }
                    break;

                case 2:
                    if (gameBoard[2] == ' ') {
                        gameBoard[2] = computerTurn;
                        flag = true;
                    }
                    break;

                case 3:
                    if (gameBoard[3] == ' ') {
                        gameBoard[3] = computerTurn;
                        flag = true;
                    }
                    break;

                case 4:
                    if (gameBoard[4] == ' ') {
                        gameBoard[4] = computerTurn;
                        flag = true;
                    }
                    break;

                case 5:
                    if (gameBoard[5] == ' ') {
                        gameBoard[5] = computerTurn;
                        flag = true;
                    }
                    break;

                case 6:
                    if (gameBoard[6] == ' ') {
                        gameBoard[6] = computerTurn;
                        flag = true;
                    }
                    break;

                case 7:
                    if (gameBoard[7] == ' ') {
                        gameBoard[7] = computerTurn;
                        flag = true;
                    }
                    break;

                case 8:
                    if (gameBoard[8] == ' ') {
                        gameBoard[8] = computerTurn;
                        flag = true;
                    }
                    break;

            }
            if (flag) {
                break;
            }

        }
    }


}