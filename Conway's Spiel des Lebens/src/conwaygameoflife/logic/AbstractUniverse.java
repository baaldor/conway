/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author BaalDor
 */
public abstract class AbstractUniverse implements Universe{
    private Collection<Cell> allCells;
    private Map<Cell,Neighbourhood> cellNeighbouhoodMapping;

    @Override
    public Collection<Cell> getCells() {
        return this.allCells;
    }

    @Override
    public void setCells(Collection<Cell> allCells) {
        this.allCells=allCells;
    }

    @Override
    public Neighbourhood getNeighbourhoodForCell(Cell myCell) {
        return this.cellNeighbouhoodMapping.get(myCell);
    }

    @Override
    public void setNeighbourhoodForCell(Cell myCell, Neighbourhood myNeighbourhood) {
        this.cellNeighbouhoodMapping.put(myCell, myNeighbourhood);
    }
    
}
