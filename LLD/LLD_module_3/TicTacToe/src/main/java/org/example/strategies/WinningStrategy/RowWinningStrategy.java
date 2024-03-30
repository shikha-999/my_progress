package org.example.strategies.WinningStrategy;

import org.example.models.Board;
import org.example.models.Move;
import org.example.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    //use hashmap to store count of every symbol in a row
    private Map<Integer, Map<Symbol, Integer>> rowMap = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board){
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();

        if(!rowMap.containsKey(row)){
            rowMap.put(row, new HashMap<>());
        }
        Map<Symbol, Integer> currentRowMap = rowMap.get(row);
        //if in this row symbol is present, then increment the count
        //if not, then add the symbol to the row
        if (currentRowMap.containsKey(symbol)) {
            currentRowMap.put(symbol, currentRowMap.get(symbol) + 1);
        } else {
            currentRowMap.put(symbol, 1);
        }

        return currentRowMap.get(symbol) == board.getDimension();

    }
}
