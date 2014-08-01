/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

import java.util.Collection;

/**
 * The AbstractArchon implements the Archon interface and provides a basic
 * algorithm to runNextRound. A class derived from AbstractArchon only has to
 * implement the method calculateNewCellstate for a given cell and its neighbourhood.
 * @author BaalDor
 * @param <T> the type of cells the Archon can handle especially when calculating
 * the next round.
 */
public abstract class AbstractArchon<T extends Cell> implements Archon<T>{
   
    private Universe<T> myUniverse;       

    @Override
    public void setUniverse(Universe<T> myUniverse) {
        this.myUniverse=myUniverse;
    }

    @Override
    public void runNextRound() {
        Neighbourhood<T> myNeighbourhood;
        Collection<T> allCells=myUniverse.getCells();
        
        for (T aCell:allCells){
            myNeighbourhood=myUniverse.getNeighbourhoodForCell(aCell);
            aCell.setCellState(this.calculateNewCellstate(aCell, myNeighbourhood));
        }
    }
    
    public abstract CellState calculateNewCellstate(T myCell, Neighbourhood<T> myNeighbourhood);
}
