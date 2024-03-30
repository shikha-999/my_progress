package org.example.models;

import java.util.Scanner;

public class Player {
    private long id;
    private String name;
    private Symbol symbol;//making it class for extensible symbol attr
    private PlayerType playerType;

    public Player(String name, Symbol symbol, PlayerType playerType, long id) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board board) {
        Scanner sc = new Scanner(System.in);
        //ask the player to provide the index to make a move
        System.out.println("Please tell the row index to make a move");
        int rowNumber = sc.nextInt();

        System.out.println("Please tell the row index to make a move");
        int colNumber = sc.nextInt();

        return new Move(new Cell(rowNumber, colNumber), this);//this is player making the move (current object)

    }
}