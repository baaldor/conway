/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

/**
 * This class implements the interface CellState and encapsulates a boolean as
 * a cells state.
 * @author BaalDor
 */
public class BooleanCellState implements CellState {
    private boolean state;

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
}
