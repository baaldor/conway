/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

/**
 *
 * @author BaalDor
 */
public interface Cell {    
    public CellState getCellState();
    public void setCellState(CellState newCellState);
}
