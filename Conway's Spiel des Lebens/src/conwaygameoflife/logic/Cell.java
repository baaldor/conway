/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

/**
 * The interface Cell represents a basic cell in Conway's Game of Live.
 * @author BaalDor
 * @param <T>  the type of CellState this cell has.
 */
public interface Cell<T extends CellState> {    
    public T getCellState();
    public void setCellState(T newCellState);
}
