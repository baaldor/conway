/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.data;

import conwaygameoflife.logic.Cell;
import conwaygameoflife.logic.Neighbourhood;
import conwaygameoflife.logic.Universe;
import java.util.Collection;

/**
 * This class provides a basic algorithm to build an universe. 
 * The abstraction is deferred to the less complex tasks newUniverse, createAllCells and createNeighbourhood.
 * @author BaalDor
 */
public abstract class UniverseLessAbstractFactory<T extends Cell> extends UniverseAbstractFactory<T> {

    @Override
    public Universe<T> createUniverse() {
        Universe<T> theUniverse = this.newUniverse();
        Collection<T> allCells = this.createAllCells();
        
        for(T aCell:allCells){
            theUniverse.setNeighbourhoodForCell(aCell, this.createNeighbourhoodForCell(aCell));
        }
        
        return theUniverse;
    }
    /**
     * 
     * @return A fresh new blank Universe
     */
    abstract Universe<T> newUniverse();
    
    /**
     * 
     * @return all Cells that are to be added to new universe
     */
    abstract Collection<T> createAllCells();
    
    /**
     * 
     * @param aCell: the cell the neighbourhood is created for
     * @return the Neighbourhood for aCell
     */
     abstract Neighbourhood<T> createNeighbourhoodForCell(T aCell);
}
