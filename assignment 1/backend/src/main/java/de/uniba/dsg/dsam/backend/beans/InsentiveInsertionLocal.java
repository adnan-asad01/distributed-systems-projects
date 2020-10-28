package de.uniba.dsg.dsam.backend.beans;


import de.uniba.dsg.dsam.model.PromotionalGiftDTO;

/**
 * Simple interface for a session bean that is not to be exposed to the outside world.
 *
 * @author schoenberger
 */
public interface InsentiveInsertionLocal {

    /**
     * Adds a new room to the database.
     *
     * @param promotionalGiftDto
     */
    public void insertInsentive(PromotionalGiftDTO promotionalGiftDto);
}
