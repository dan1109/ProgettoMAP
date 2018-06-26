/*
 * 
 */
package data;

// TODO: Auto-generated Javadoc
/**
 * <p>Description: Modella un'eccezione controllata da considerare qualora il numero k di cluster inserito
 * da tastiera sia maggiore rispetto al numero di controidi generabili dall'insieme di transazioni.
 * @author sante
 */
public class OutOfRangeSampleSize extends Exception {
	
	/** Default serial version id. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new out of range sample size.
	 */
	OutOfRangeSampleSize(){
		super("\nIl numero k di cluster inserito da\n"
				+ "tastiera è fuori dal range\n"
				+ "del numero di centroidi generabili\n"
				+ "dall'insieme di transazioni.\n\n");
	}
}
