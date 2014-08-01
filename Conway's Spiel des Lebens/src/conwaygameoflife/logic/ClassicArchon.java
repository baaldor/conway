/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

import java.util.Collection;

/**
 * The ClassicArchon is an implementation of AbstractArchon realizing the original
 * set of rules for Conway's Game of Live.
 * @author BaalDor
 */
public class ClassicArchon extends AbstractArchon<SimpleCell<BooleanCellState>>{

    @Override
    public CellState calculateNewCellstate(SimpleCell<BooleanCellState> myCell, Neighbourhood<SimpleCell<BooleanCellState>> myNeighbourhood) {
        BooleanCellState myBlnCellState=new BooleanCellState();
        
        Collection<SimpleCell<BooleanCellState>> allNeighbours=myNeighbourhood.getCells();
        int cntAliveCells=0;        
        
        for(SimpleCell<BooleanCellState> aSimpleBooleanCell:allNeighbours){
            if (aSimpleBooleanCell.getCellState().getState()) {
                ++cntAliveCells;
            } 
        }
        
        //Hier eine eine Unterscheidung mit If-Else-If machen, um im jeweiligen Fall den Wert vom Rückgabewert myBlnCellState zu setzen
       
        return myBlnCellState;
    }
      
    
}
