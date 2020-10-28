package de.uniba.dsg.dsam.exceptions;

/**
 * Application exception for encapsulating exceptions during accessing server functionality.
 * 
 * @author schoenberger
 *
 */
public class RoomMgtPersistenceException extends Exception {

	public RoomMgtPersistenceException() {
	}

	public RoomMgtPersistenceException(String message) {
		super(message);
	}

	public RoomMgtPersistenceException(Throwable cause) {
		super(cause);
	}

	public RoomMgtPersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

}
