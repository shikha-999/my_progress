package org.example.controllers;

import java.util.List;

import org.example.models.Player;
import org.example.models.Game;
import org.example.strategies.WinningStrategy.WinningStrategy;

public class GameController {
    //start the game
    //difficulty required only for bot not all players
    //hence not passing difficulty
    public Game startGame(int boardDimension, List<Player> players,
                          List<WinningStrategy> winningStrategies){
        return null;
    }
    //play game
    public void makeMove(Game game){
        game.makeMove();
    }
    //display board
    public void displayBoard(Game game){
        game.printBoard();
    }
    //check winner
    public Player checkWinner(Game game){
        return game.getWinner();
    }
    public void undo(Game game){
        game.undo();
    }
}
