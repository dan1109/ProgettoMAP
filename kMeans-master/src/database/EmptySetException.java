/*
 * 
 */
package database;

// TODO: Auto-generated Javadoc
/**
 * Eccezione per modellare la restituzione di un resultset vuoto.
 * @author sante
 *
 */
public class EmptySetException extends Exception{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new empty set exception.
	 */
	EmptySetException(){
		super("Resultset vuoto: la tabella inserita potrebbe non esistere all'interno del database.");
	}
}
