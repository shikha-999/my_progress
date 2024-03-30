package org.example.strategies.WinningStrategy;

import org.example.models.Board;
import org.example.models.Move;
import org.example.models.Symbol;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{
    //2 hashmaps to store count of symbols in both diagonals
    private Map<Symbol, Integer> leftDiagonalMap = new HashMap<>();
    private Map<Symbol, Integer> rightDiagonalMap = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        if(row == col){
            //cell is present in left diagonal
            if(leftDiagonalMap.containsKey(symbol)){
                leftDiagonalMap.put(symbol, leftDiagonalMap.get(symbol) + 1);
            }else{
                leftDiagonalMap.put(symbol, 1);
            }
        }
        if (row + col == board.getDimension() - 1){
            //call is present in right diagonal
            if(rightDiagonalMap.containsKey(symbol)){
                rightDiagonalMap.put(symbol, rightDiagonalMap.get(symbol) + 1);
            }else{
                rightDiagonalMap.put(symbol, 1);
            }
        }
//        Symbol symbol1 = move.getPlayer().getSymbol();
        //check if any of the diagonals has all the cells filled with the same symbol for winning
        if((row == col && leftDiagonalMap.get(symbol) == board.getDimension())) {
            return true;
        }
        if((row + col == board.getDimension() - 1 && rightDiagonalMap.get(symbol) == board.getDimension()))
            return true;
        return false;
    }
}
