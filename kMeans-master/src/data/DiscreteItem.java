/*
 * 
 */
package data;

// TODO: Auto-generated Javadoc
/**
 * <p>Description: Estende la classe Item e rappresenta una coppia Attributo,valore discreto.
 * Esempio Outlook="Sunny"
 * @author sante
 *
 */
class DiscreteItem extends Item {
	
	/**
	 * Instantiates a new discrete item.
	 *
	 * @param attribute the attribute
	 * @param value the value
	 */
	DiscreteItem(DiscreteAttribute attribute,String value){
		super(attribute,value);
	}
	
	/**
	 * Valuta la distanza tra due attributi discreti che corrisponde a 1
	 * se sono diversi, a 0 se sono uguali.
	 *
	 * @param a the a
	 * @return the double
	 */
	double distance(Object a) {
		//verifica se il valore dell'attributo sia uguale a quello di input
		if(this.getValue().equals(((DiscreteItem)a).getValue()))                                                                                                                     {
			return 0;
		}else {
			return 1;
		}
				
	}
}
