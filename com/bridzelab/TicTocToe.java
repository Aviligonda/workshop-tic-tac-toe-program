package com.bridzelab;

public class TicTocToe {
    static char[] gameBoard = new char[10];

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Toc toe Program");
        createBoard();

    }

    public static void createBoard() {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }

}
