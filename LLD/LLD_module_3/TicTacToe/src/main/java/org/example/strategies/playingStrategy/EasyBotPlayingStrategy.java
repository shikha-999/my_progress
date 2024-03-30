package org.example.strategies.playingStrategy;

import org.example.models.Board;
import org.example.models.Cell;
import org.example.models.CellState;
import org.example.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {
        //in easy
        //bot will make move in first available cell
        //iterate over every cell

        for(List<Cell> row : board.getBoard()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    //bot will make a move at this cell
                    return new Move(cell, null);
                }
            }
        }
//        for(int i=0; i < board.getDimension(); i++){
//            for(int j=0; j< board.getDimension(); j++){
//                Cell cell = board.getBoard().get(i).get(j);
//                if(cell.getCellState().equals(CellState.EMPTY)){
//                    //make a move
//                }
//            }
//        }
        return null;
    }
}
