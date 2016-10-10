package pokerExceptions;

import pokerBase.Hand;

public class HandException extends Exception {
	// and here ^^^
	private Hand y;
	
	public HandException(Hand y) {
		super();
		this.y = y;
		
	}
	/*public getY(){
		return y;
		*/
		
	}

}
