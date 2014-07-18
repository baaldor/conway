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
public interface Universe {
    public Collection<Cell> getCells();
    public Neighbourhood getNeighbourhoodForCell(Cell myCell);
}
