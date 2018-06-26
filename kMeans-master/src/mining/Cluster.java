/*
 * 
 */
package mining;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import data.Data;
import data.Tuple;

// TODO: Auto-generated Javadoc
/**
 * <p>Description:Rappresenta un insieme di righe di data con il relativo centroide.
 * @author sante
 *
 */
public class Cluster implements Serializable{
	
	/** The centroid. */
	private Tuple centroid;

	/** The clustered data. */
	private Set<Integer> clusteredData=new HashSet<Integer>(); //contiene le righe di data facenti parte del Cluster
	
	/*Cluster(){
		
	}*/

	/**
	 * Instantiates a new cluster.
	 *
	 * @param centroid the centroid
	 */
	Cluster(Tuple centroid){
		this.centroid=centroid;
	}
		
	/**
	 * Gets the centroid.
	 *
	 * @return the centroid
	 */
	Tuple getCentroid(){
		return centroid;
	}
	
	/**
	 * Calcola il nuovo centroide del Cluster.
	 *
	 * @param data riferimento ad oggetto Data
	 */
	void computeCentroid(Data data){
		for(int i=0;i<centroid.getLength();i++){
			centroid.get(i).update(data,clusteredData);
		}	
	}
	
	/**
	 * Return true se la tupla cambia cluster.
	 *
	 * @param id indice di riga
	 * @return true, if successful
	 */
	boolean addData(int id){
		return clusteredData.add(id);	
	}
	
	/**
	 * Verifica se una transazione è clusterizzata nell'array corrente.
	 *
	 * @param id indice di riga
	 * @return true, if successful
	 */
	boolean contain(int id){
		return clusteredData.contains(id);
	}
	

	/**
	 * Rimuove la tupla che ha cambiato il cluster.
	 *
	 * @param id indice di riga della tupla
	 */
	void removeTuple(int id){
		clusteredData.remove(id);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String str="Centroid=(";
		for(int i=0;i<centroid.getLength();i++)
			str+=" "+centroid.get(i);
		str+=")\n";
		return str;
	}
	
	/**
	 * To string.
	 *
	 * @param data the data
	 * @return the string
	 */
	public String toString(Data data){
		String str="Centroid=(";
		for(int i=0;i<centroid.getLength();i++)
			str+=centroid.get(i)+ " ";
		str+=")\nExamples:\n";
		Integer[] array=new Integer[clusteredData.size()];
		clusteredData.toArray(array);
		for(int i=0;i<array.length;i++){
			str+="[";
			for(int j=0;j<data.getNumberOfAttributes();j++)
				str+=data.getAttributeValue(array[i], j)+" ";
			str+="] dist="+getCentroid().getDistance(data.getItemSet(array[i]))+"\n";
			
		}
		str+="\nAvgDistance="+getCentroid().avgDistance(data,array);
		return str;
		
	}
}
