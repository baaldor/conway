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
public class SimpleNeighbourhood implements Neighbourhood{
        List<Cell> currentNeighbors = new ArrayList<Cell>();
        
//Konstruktor
    public SimpleNeighbourhood(){}
    
//Methoden aus dem Interface
    @Override public Collection<Cell> getCells(){
        return this.currentNeighbors;
    }
    @Override public void setCells(Collection<Cell> allCells){
        this.currentNeighbors = (List)allCells;
    }
}
