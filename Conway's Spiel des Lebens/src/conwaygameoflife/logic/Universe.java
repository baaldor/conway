/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

import java.util.Collection;

/**
 *
 * @author BaalDor
 */
public interface Universe {
    public Collection<Cell> getCells();
    public void setCells(Collection<Cell> allCells);    
    public Neighbourhood getNeighbourhoodForCell(Cell myCell);
    public void setNeighbourhoodForCell(Cell myCell, Neighbourhood myNeighbourhood);
}
