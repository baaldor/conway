/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.logic;

/**
 * A class implementing this interface can restructure the assigned universe. Especially it can let it grow.
 * @author BaalDor
 */
public interface Architect {
    public void setBoundedUniverse(BoundedUniverse someBoundedUniverse);
    public void restructureUniverse();
}
