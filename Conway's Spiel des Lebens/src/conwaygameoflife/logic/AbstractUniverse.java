/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

import java.util.Collection;
import java.util.Map;

/**
 * This class implements the interface Universe and provides standard
 * getter/setter methods. It assumes the Cell-Neighbourhood-association to be
 * saved as a java.util.Map.
 * @author BaalDor
 * @param <T> the type of cells the universe is populated with.
 */
public abstract class AbstractUniverse<T extends Cell> implements Universe<T>{
    private Collection<T> allCells;
    private Map<T,Neighbourhood<T>> cellNeighbouhoodMapping;

    @Override
    public Collection<T> getCells() {
        return this.allCells;
    }

    @Override
    public void setCells(Collection<T> allCells) {
        this.allCells=allCells;
    }

    @Override
    public Neighbourhood<T> getNeighbourhoodForCell(T myCell) {
        return this.cellNeighbouhoodMapping.get(myCell);
    }

    @Override
    public void setNeighbourhoodForCell(T myCell, Neighbourhood<T> myNeighbourhood) {
        this.cellNeighbouhoodMapping.put(myCell, myNeighbourhood);
    }
    
}
