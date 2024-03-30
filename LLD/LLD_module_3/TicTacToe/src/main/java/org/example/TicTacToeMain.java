package org.example;

import org.example.controllers.GameController;
import org.example.models.*;
import org.example.strategies.WinningStrategy.*;
import org.example.strategies.WinningStrategy.WinningStrategy;
import org.example.strategies.playingStrategy.EasyBotPlayingStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) throws Exception {
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);
        Character response;

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        System.out.println("-----Welcome to Tic Tac Toe-----");
        do {
            System.out.println("Do you want to play with BOT or HUMAN?");
            System.out.println("Enter 1 for BOT and 2 for HUMAN");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("-----You will be playing with a BOT-----");

                List<Player> players = new ArrayList<>();
                System.out.println("Enter you NAME and SYMBOL(other than 'O')");
                String name = scanner.next();
                Symbol symbol = new Symbol(scanner.next().charAt(0));

                players.add(new Player(name, symbol, PlayerType.HUMAN, 1L));
                players.add(new Bot("BOT", new Symbol('O'), PlayerType.BOT, 2L, BotDifficultyLevel.EASY, new EasyBotPlayingStrategy()));

                //start the game
                Game game = gameController.startGame(3, players, winningStrategies);

                //start playing the game
                while (gameController.getGameState(game) == GameState.IN_PROGRESS) {
                    //display board
                    System.out.println("This is current state of board : ");
                    gameController.displayBoard(game);

                    //do you want to undo?
                    //if yes cal UNDO functionality else call makeMove
                    gameController.makeMove(game);
                }
                if (gameController.getGameState(game) == GameState.ENDED) {
                    System.out.println("Game is finished");
                    gameController.displayBoard(game);
                    System.out.println("Winner is : " + gameController.checkWinner(game).getName());
                } else {
                    System.out.println("Game is DRAWN");
                }

            } else if (choice == 2) {
                System.out.println("-----You will be playing with another HUMAN(s)-----");
                System.out.println("Enter the dimension of the board");
                int dimension = scanner.nextInt();
                int numberOfPlayers = dimension - 1;

                //players
                List<Player> players = new ArrayList<>();
                System.out.println("enter the NAME and SYMBOL of " + numberOfPlayers + " players");
                for (int i = 0; i < numberOfPlayers; i++) {
                    String name = scanner.next();
                    Symbol symbol = new Symbol(scanner.next().charAt(0));
                    players.add(new Player(name, symbol, PlayerType.HUMAN, i + 1L));
                }

                //start the game
                Game game = gameController.startGame(dimension, players, winningStrategies);

                //start playing the game
                while (gameController.getGameState(game) == GameState.IN_PROGRESS) {
                    //display board
                    System.out.println("This is current state of board : ");
                    gameController.displayBoard(game);

                    //do you want to undo?
                    //if yes cal UNDO functionality else call makeMove
                    gameController.makeMove(game);
                }
                if (gameController.getGameState(game) == GameState.ENDED) {
                    System.out.println("Game is finished");
                    gameController.displayBoard(game);
                    System.out.println("Winner is : " + gameController.checkWinner(game).getName());
                } else {
                    System.out.println("Game is DRAWN");
                }
            }

            System.out.println("do you want to start a new game ? Y/N");
            response = scanner.next().charAt(0);
        }while(response == 'Y');
        System.out.println("-----Exiting the Game-----");
    }
}