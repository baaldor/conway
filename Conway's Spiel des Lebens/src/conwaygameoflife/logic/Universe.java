/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

import java.util.Collection;

/**
 * The interface Universe is a bucket for all cells related to the current 
 * Conway game of Live.
 * @author BaalDor
 * @param <T>
 */
public interface Universe<T extends Cell> {
    public Collection<T> getCells();
    public void setCells(Collection<T> allCells);    

    /**
     * 
     * @param myCell
     * @return returns the neighbourhood of a given cell
     */
    public Neighbourhood<T> getNeighbourhoodForCell(T myCell);

    /**
     * sets the neighbourhood of a given cell
     * @param myCell the center of the neighbourhood
     * @param myNeighbourhood the neighbourhood of myCell
     */
    public void setNeighbourhoodForCell(T myCell, Neighbourhood<T> myNeighbourhood);
}
