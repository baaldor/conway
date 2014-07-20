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
public abstract class AbstractArchon implements Archon{
    private Universe myUniverse;       

    @Override
    public void setUniverse(Universe myUniverse) {
        this.myUniverse=myUniverse;
    }

    @Override
    public void runNextRound() {
        Neighbourhood myNeighbourhood;
        Collection<Cell> allCells=myUniverse.getCells();
        
        for (Cell aCell:allCells){
            myNeighbourhood=myUniverse.getNeighbourhoodForCell(aCell);
            aCell.setCellState(this.calculateNewCellstate(aCell, myNeighbourhood));
        }
    }
    
    public abstract CellState calculateNewCellstate(Cell myCell, Neighbourhood myNeighbourhood);
}
