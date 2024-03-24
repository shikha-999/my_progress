package org.example.models;

public class Player {
    private long id;
    private String name;
    private Symbol symbol;//making it class for extensible symbol attr
    private PlayerType playerType;

    public Player(String name, Symbol symbol, PlayerType playerType, long id){
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
}
