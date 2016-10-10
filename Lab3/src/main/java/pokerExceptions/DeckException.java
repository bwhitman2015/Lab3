package pokerExceptions;

import pokerBase.Deck;

public class DeckException extends Exception {
	//not sure why ^^^ I'm getting red here
	
	private Deck x;
	
	public DeckException(Deck x){
		super();
		this.x = x;
		
	}
	public Deck getX() {
		return x;
	}
	

}
