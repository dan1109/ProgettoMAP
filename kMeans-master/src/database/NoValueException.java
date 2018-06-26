/*
 * 
 */
package database;

// TODO: Auto-generated Javadoc
/**
 * Modella l’assenza di un valore all’interno di un resultset.
 *
 * @author sante
 */
public class NoValueException extends Exception{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new no value exception.
	 */
	NoValueException(){
		super("Valore non trovato all'interno del resultset");
	}
}
