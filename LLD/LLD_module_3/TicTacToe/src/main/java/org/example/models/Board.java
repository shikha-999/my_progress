package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    List<List<Cell>> board; //code to interface, not implementation(ArrayList x)

    public int getDimension() {
    return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    //constructor
    public Board(int n) {
        //initialize a board of size*size
        this.dimension = n;
        board = new ArrayList<>(); //ROWS

        //initialize list<list<>>, each cell empty bydefault
        for (int i = 0; i < n; i++) {
            //at every row index adding new arraylist
            board.add(new ArrayList<>()); //COLS

            //making the i,j cell
            for(int j = 0; j< n; j++){
                board.get(i).add(new Cell(i, j));
            }
        }
    }
    public void displayBoard(){
        for(int i = 0; i< dimension; i++){
            for(int j = 0; j< dimension; j++){
                Cell cell = board.get(i).get(j);
                if(cell.getCellState().equals(CellState.EMPTY))
                    System.out.print("|   |");
                else
                    System.out.print("| " + cell.getPlayer().getSymbol().getSymbol() +" |");
            }
            System.out.println();
        }
    }
}
