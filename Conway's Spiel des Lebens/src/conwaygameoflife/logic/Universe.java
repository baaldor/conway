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
public interface Universe<T extends Cell> {
    public Collection<T> getCells();
    public void setCells(Collection<T> allCells);    
    public Neighbourhood<T> getNeighbourhoodForCell(T myCell);
    public void setNeighbourhoodForCell(T myCell, Neighbourhood<T> myNeighbourhood);
}
