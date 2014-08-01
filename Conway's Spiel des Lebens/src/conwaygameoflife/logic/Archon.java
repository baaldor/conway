/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//super kommentar von ronron
package conwaygameoflife.logic;

/**
 * The Archon gets an universe assigned and can run one round in Conway's Game 
 * of Live. That means he can calculate the cells next state for everey cell in 
 * the assigned universe.
 * @author BaalDor
 * @param <T> the type of cells the Archon can handle especially when calculating
 * the next round.
 */
public interface Archon<T extends Cell> {
    public void setUniverse(Universe<T> myUniverse);
    public void runNextRound();
}
