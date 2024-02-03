package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    List<List<Cell>> board; //code to interface, not implementation(ArrayList x)

    //constructor
    public Board(int n) {
        //initialize a board of size*size
        this.dimension = n;
        board = new ArrayList<>(); //ROWS

        //initialize list<list<>>, each cell empty bydefault
        for (int i = 0; i < dimension; i++) {
            //at every row index adding new arraylist
            board.add(new ArrayList<>()); //COLS

            //making the i,j cell
            for(int j = 0; j< dimension; j++){
                board.get(i).add(new Cell(i, j));
            }
        }
    }
    public void displayBoard(){
        for(int i = 0; i< dimension; i++){
            for(int j = 0; j< dimension; j++){
                Cell cell = board.get(i).get(j);
                if(cell.getCellState().equals(CellState.EMPTY))
                    System.out.println("| |");
                else
                    System.out.println("|" + cell.getPlayer().getSymbol() +"|");
            }
        }
    }
}
