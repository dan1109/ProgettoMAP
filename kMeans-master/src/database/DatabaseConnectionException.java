/*
 * 
 */
package database;

// TODO: Auto-generated Javadoc
/**
 * Eccezione in caso di fallimento nella connessione al database.
 *
 * @author sante
 */
public class DatabaseConnectionException extends Exception{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new database connection exception.
	 */
	DatabaseConnectionException(){
		super("Connessione al database fallita.");
	}
}
