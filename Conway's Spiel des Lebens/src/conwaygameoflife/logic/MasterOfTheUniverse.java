/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conwaygameoflife.logic;

import conwaygameoflife.data.Speicherzwerg;

/**
 * Mast of the Universe ist die Fassade (Kommunikation) zur Präsentationsebene.
 * @author Spooz
 */
public interface MasterOfTheUniverse {
    public void buildUniverse();
    public Universe getUniverse();
    public void saveUniverse();
    public void nextRound();
    public void setSpeicherzwerg(Speicherzwerg myZwerg);
}
