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
