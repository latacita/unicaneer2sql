package es.unican.moses.sle.db.eer2sql.util;

import java.io.Serializable;

/**
 * Wrapper class.
 * This class store the multiplicity. Are positive values and the '*' indicate the infinity.
 * @author Adrian Fernandez San Marcos.
 * @version 25-03-2011
 */
public class UnboundedNatural implements Serializable, Comparable<Integer>{

	//private attribute
	private int value;
	
	/**
	 * Constructor. 
	 * Store into the class attribute its value.
	 * @param value: integer to indicate the value.
	 */
	public UnboundedNatural(int value){
		if(value <= -1){
			this.value = -1;
		}else{
			this.value = value;
		}
	}
	
	/**
	 * Method that returns the value of the class.
	 * @return a string with the value.
	 */
	public String value(){
		if(this.value == -1){
			return "*";
		}else{
			return ""+value;
		}
	}

	public int compareTo(Integer arg0) {
		if(this.value > arg0){
			return 1;
		}
		if(this.value < arg0){
			return -1;
		}
		return 0;
		
	}
	
	
}
