/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conwaygameoflife.logic;

/**
 *
 * @author Schnapper
 */
public class SimpleCell implements Cell {
    private CellState myCellState;
    
//Konstruktoren
   public SimpleCell(){}
   public SimpleCell(CellState newCellState){
       this.myCellState = newCellState;
   }
    
//Methoden aus dem Interface
    @Override public CellState getCellState(){
        return this.myCellState;
    }
    @Override public void setCellState(CellState newCellState){
        this.myCellState = newCellState;
    }
}
