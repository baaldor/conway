/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

import java.util.Collection;

/**
 * This Universe knows its border what is important to grow.
 * @author BaalDor
 * @param <T> specifies the inherited class of Cell the universe is populated with
 */
public interface BoundedUniverse<T extends Cell> extends Universe<T> {
    public Collection<T> getBorder();
    public void setBorder(Collection<T> newBorder);
}
