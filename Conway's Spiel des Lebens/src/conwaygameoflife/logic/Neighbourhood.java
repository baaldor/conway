/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

import java.util.Collection;

/**
 * The interface Neighbourhood represents the cells in neighbourhood to a given
 * cell.
 * @author BaalDor
 * @param <T> the type of cells the neighbourhood consists of.
 */
public interface Neighbourhood<T extends Cell> {
    public Collection<T> getCells();
    public void setCells(Collection<T> allCells);
}
