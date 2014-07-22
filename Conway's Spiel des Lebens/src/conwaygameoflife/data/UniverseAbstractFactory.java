/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaygameoflife.data;

import conwaygameoflife.logic.Cell;
import conwaygameoflife.logic.Universe;

/**
 * Abstract Factory building the Universe.
 * All neccessary information is passed within the context.
 * @author BaalDor
 */
public abstract class UniverseAbstractFactory<T extends Cell> {
    private Context myContext;
    
    public abstract Universe<T> createUniverse();
    
    /**
     * 
     * @param contextUniverseIsBuildFrom : contains all information necessary to create a universe
     */
    public void setContext(Context contextUniverseIsBuildFrom){
        this.myContext=contextUniverseIsBuildFrom;
    };
}
