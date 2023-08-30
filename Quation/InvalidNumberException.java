package org.prctice.DSA.FAANGM.Quation;

public class InvalidNumberException extends Exception {
	
	public InvalidNumberException() {
	  super("it should be between 1 to 10");
	  
	}
	public InvalidNumberException(String as) {
		super(as);
	}

}
