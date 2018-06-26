/*
 * 
 */
package data;

import java.io.Serializable;
import java.util.Set;



// TODO: Auto-generated Javadoc
/**
 * <p>Description:Modella un generico item(coppia (attributo,valore),per esempio Outlook="Sunny");.
 *
 * @author sante
 */
public abstract class Item implements Serializable{
	
	/** The attribute. */
	private Attribute attribute; //attributo coinvolto nell'item
	
	/** The value. */
	private Object value; //valore assegnato all'attributo
	
	/**
	 * Inizializza i valori dei membri attributi.
	 *
	 * @param attribute riferimento ad oggetto di tipo Attribute
	 * @param value riferimento ad oggetto di tipo Object
	 */
	Item(Attribute attribute,Object value){
		this.attribute=attribute;
		this.value=value;
	}
	
	/**
	 * Gets the attribute.
	 *
	 * @return the attribute
	 */
	Attribute getAttribute() {
		return attribute;
	}
	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	Object getValue() {
		return value;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getValue().toString();
	}
	
	/**
	 * L'implementazione sarà diversa per item discreto e item continuo.
	 *
	 * @param a the a
	 * @return the double
	 */
	abstract double distance(Object a);
	
	/**
	 * Modifica il membro value ,assegnandogli il valore restituito da data.computePrototype(clusteredData,attribute)
	 * @param data riferimento ad un oggetto di classe Data
	 * @param clusteredData insieme di indici delle righe delle matrice in data che formano il cluster
	 */
	public void update(Data data,Set<Integer> clusteredData) {
		value=data.computePrototype(clusteredData, attribute);
	}
}
