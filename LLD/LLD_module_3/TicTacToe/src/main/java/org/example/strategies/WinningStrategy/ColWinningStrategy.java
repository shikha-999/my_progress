package org.example.strategies.WinningStrategy;

import org.example.models.Board;
import org.example.models.Move;
import org.example.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColWinningStrategy implements WinningStrategy{
    private Map<Integer, Map<Symbol, Integer>> colMap = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();


        if(!colMap.containsKey(col)){
            colMap.put(col, new HashMap<>());
        }
        Map<Symbol, Integer> symbolMap = colMap.get(col);
        //if in this row symbol is present, then increment the count
        //if not, then add the symbol to the row
        if (symbolMap.containsKey(symbol)) {
            symbolMap.put(symbol, symbolMap.get(symbol) + 1);
        } else {
            symbolMap.put(symbol, 1);
        }
        return symbolMap.get(symbol) == board.getDimension();
    }
}
