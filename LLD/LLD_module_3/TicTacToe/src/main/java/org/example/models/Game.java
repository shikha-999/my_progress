package org.example.models;
import org.example.exceptions.GameInvalidationException;
import org.example.strategies.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

//builder steps
//1. private attributes and constructor(Game(...)) of outer Game class
//2. public setter and getters of outer Game class
//3. create Public Static Builder getBuilder() method

//4. create inner --> Public Static class builder
//5. create private attributes (those parameters mentioned in Private constructor of outer class..taken from user)
//6. create Private builder()
//7. create public setters of the attributes --> return type Builder --> return this
//8. create public build() (validation logic and return Game Object...return new Game(...))

public class  Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private Player winner;
    private int nextMovePlayerIndex; //which player has turn
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players,
                List<WinningStrategy> winningStrategies){
        //create baord
        this.board = new Board(dimension);
        this.players = players;
        this.gameState = GameState.IN_PROGRESS;
        this.nextMovePlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.winningStrategies = winningStrategies;
//        this.winner = null; //bydefault
    }

    //Builder pattern
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void printBoard(){
        board.displayBoard();
    }
    public void undo(){

    }

    private boolean validateMove(Move move){
        //validate the move
        //1. check if the cell is empty (get row and get col and check if cell is empty)
        //2. check if the cell is within the board
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        if(        (row < 0 || row >= board.getDimension())
                || (col < 0 || col >= board.getDimension())
                ||  (!board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY))){
            return false;
        }
        return true;
    }

    private boolean checkWinner(Board board, Move move){
        //check if the move made by the player has made him win
        //iterate through all the winning strategies(since its a list)
        //it has row, col, diagonal strategies
        for(WinningStrategy winningStrategy: winningStrategies){
            if(winningStrategy.checkWinner(move, board)){
                return true;
            }
        }
        return false;
    }
    public void makeMove(){
        //current player to make the move
        Player currentPlayer = players.get(nextMovePlayerIndex);
        System.out.println("It is "+ currentPlayer.getName() + "'s move");
        Move move = currentPlayer.makeMove(this.board);

        System.out.println(currentPlayer.getName() + " has made a move at Row: " + move.getCell().getRow() +
                " and Col: " + move.getCell().getCol() + ".");

        //validate the move before we apply the move on board
        if(!validateMove(move)){
            System.out.println("Invalid move made by player: " + currentPlayer.getName());
            return;
        }
        //if move is valid, apply the move on board
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell finalCellToMakeMove = board.getBoard().get(row).get(col);

        //change the finalCellToMakeMove state
        finalCellToMakeMove.setCellState(CellState.FILLED);

        //set the player who made the move
        finalCellToMakeMove.setPlayer(currentPlayer);

        //add the move to the list of moves
        Move finalMove = new Move(finalCellToMakeMove, currentPlayer);
        moves.add(finalMove);

        //move the index to next player
        nextMovePlayerIndex = (nextMovePlayerIndex + 1) % players.size();

        //once player made a move, check the winner
        if(checkWinner(board, finalMove)){
            gameState = GameState.ENDED;
            winner = currentPlayer;
        }else if(moves.size() == board.getDimension() * board.getDimension()) {
            gameState = GameState.DRAW;
        }
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    //builder class
    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        //private constructor
        private Builder(){
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.dimension = 0;
        }

        //setter methods
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private boolean validate(){
            //validations
            //1. only 1 bot is allowed per game (iterate through list of players, and increase counter on number of bots, if BOTS>1 return false)
            //2. no 2 players should have same symbol (iterate through list of symbols, and increase counter on number of symbols, if symbols>1 return false)
            return true;
        }

        public Game build() throws Exception {
            //validate
            if (!validate())
                throw new GameInvalidationException("Invalid game");

            return new Game(dimension, players, winningStrategies);
            //create game object
        }
    }
}
