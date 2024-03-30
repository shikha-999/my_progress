package org.example.controllers;

import java.util.List;

import org.example.models.GameState;
import org.example.models.Player;
import org.example.models.Game;
import org.example.strategies.WinningStrategy.WinningStrategy;

public class GameController {
    //start the game
    //difficulty required only for bot not all players
    //hence not passing difficulty
    public Game startGame(int boardDimension, List<Player> players,
                          List<WinningStrategy> winningStrategies) throws Exception {

        return Game
                .getBuilder()
                .setDimension(boardDimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
    //play game
    //can neglect Game game in parameters
    public void makeMove(Game game){
        //2 kind of moves -> player and bot make moves
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
    public GameState getGameState(Game game){
        return game.getGameState();
    }
}
