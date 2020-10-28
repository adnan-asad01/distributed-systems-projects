package de.uniba.dsg.dsam.backend.beans;


import de.uniba.dsg.dsam.model.BeverageDTO;

/**
 * Simple interface for a session bean that is not to be exposed to the outside world.
 *
 * @author schoenberger
 */
public interface BeverageInsertionLocal {

    /**
     * Adds a new room to the database.
     *
     * @param rrd
     */
    public void insertRoom(BeverageDTO rrd);
}
