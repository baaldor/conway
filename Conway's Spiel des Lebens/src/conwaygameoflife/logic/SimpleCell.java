/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conwaygameoflife.logic;

/**
 * This class implements the interface Cell and provides standard constructor
 * and getter/setter methods.
 * @author Schnapper
 * @param <T>
 */
public class SimpleCell<T extends CellState> implements Cell<T> {
    private T myCellState;
    
//Konstruktoren
   public SimpleCell(){}
   public SimpleCell(T newCellState){
       this.myCellState = newCellState;
   }
    
//Methoden aus dem Interface
    @Override public T getCellState(){
        return this.myCellState;
    }
    @Override public void setCellState(T newCellState){
        this.myCellState = newCellState;
    }
}
