/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

/**
 *
 * @author BaalDor
 */
public abstract class AbstractCell implements Cell {
    private CellState myCellState;
    
    public AbstractCell(CellState myCellState){
        this.myCellState=myCellState;
    }            

    @Override
    public CellState getCellState() {
        return this.myCellState;
    }

    @Override
    public void setCellState(CellState newCellState) {
       this.myCellState=newCellState;
    }    
}
