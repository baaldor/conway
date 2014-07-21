/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

/**
 *
 * @author BaalDor
 */
public interface Cell<T extends CellState> {    
    public T getCellState();
    public void setCellState(T newCellState);
}
