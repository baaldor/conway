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
public interface Neighbourhood<T extends Cell> {
    public Collection<T> getCells();
    public void setCells(Collection<T> allCells);
}
