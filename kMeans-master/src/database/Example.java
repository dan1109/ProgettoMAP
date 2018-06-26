/*
 * 
 */
package database;
import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * Modella una transazione letta dalla base di dati.
 *
 * @author sante
 */
public class Example implements Comparable<Example>{
	
	/** The example. */
	private List<Object> example=new ArrayList<Object>();

	/**
	 * Adds the.
	 *
	 * @param o the o
	 */
	public void add(Object o){
		example.add(o);
	}
	
	/**
	 * Gets the.
	 *
	 * @param i the i
	 * @return the object
	 */
	public Object get(int i){
		return example.get(i);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Example ex) {
		
		int i=0;
		for(Object o:ex.example){
			if(!o.equals(this.example.get(i)))
				return ((Comparable)o).compareTo(example.get(i));
			i++;
		}
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String str="";
		for(Object o:example)
			str+=o.toString()+ " ";
		return str;
	}
	
}
