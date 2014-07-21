/*
 * benachbarte Zellen werden in einer ArrayList<Cell> abgelegt
 * 
 */

package conwaygameoflife.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Schnapper
 */
public class SimpleNeighbourhood<T extends Cell> implements Neighbourhood<T>{
    Collection<T> currentNeighbours;        
        
//Konstruktor
    public SimpleNeighbourhood(){}
    
//Methoden aus dem Interface
    @Override public Collection<T> getCells(){
        return this.currentNeighbours;
    }
    @Override public void setCells(Collection<T> allCells){
        this.currentNeighbours = allCells;
    }
}
