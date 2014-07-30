/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conwaygameoflife.presentation;

import conwaygameoflife.logic.MasterOfTheUniverse;

/**
 * This is the facade to the presentation tier.
 * @author Spooz
 */
public interface Presenter {
    public void setMasterOfTheUniverse(MasterOfTheUniverse myMaster);
        
}
