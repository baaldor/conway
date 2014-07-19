/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conwaygameoflife.logic;

/**
 *
 * @author Spooz
 */

//Mast of the Universe ist die Fassade (Kommunikation) zur Präsentationsebene

public interface MasterOfTheUniverse {
    public void buildUniverse();
    public Universe getUniverse();
    public void saveUniverse();
    public void nextRound();
    
}
