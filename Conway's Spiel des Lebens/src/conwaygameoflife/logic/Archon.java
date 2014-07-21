/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//super kommentar von ronron
package conwaygameoflife.logic;

/**
 *
 * @author BaalDor
 */
public interface Archon<T extends Cell> {
    public void setUniverse(Universe<T> myUniverse);
    public void runNextRound();
}
