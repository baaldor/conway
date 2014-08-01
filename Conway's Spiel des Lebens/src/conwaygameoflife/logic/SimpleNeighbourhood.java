/*
 * benachbarte Zellen werden in einer ArrayList<Cell> abgelegt
 * 
 */

package conwaygameoflife.logic;

import java.util.Collection;

/**
 * This class implements the interface Neighbourhood and provides standard
 * getter and setter methods.
 * @author Schnapper
 * @param <T> the type of cells this neighbourhood consists of.
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
