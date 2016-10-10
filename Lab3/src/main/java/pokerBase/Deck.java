package pokerBase;
import pokerEnums.eSuit;
import pokerExceptions.DeckException;
import pokerEnums.eRank;



import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerEnums.eRank;
public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if (eSuit != eSuit.JOKER)
						
			
					deckCards.add(new Card(eSuit, eRank, iCardNbr++))
					}
			}
			 
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) {

		this();
		
		for (int x = 0; x<NbrOfJokers; x++){
			deckCards.add(new Card(eSuit.JOKER, eRank.JOKER,54));
			
			
		}
		
		Collections.shuffle(deckCards);
		
		
		
				
	}
	
	
	
	public int GetDeckSize(){
		return deckCards.size();
	}
	
	
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {

		this(NbrOfJokers);
		for(Card wild : Wilds){
			for (Card card : deckCards){
				if(bWild.geteSuit() == card.geteSuit() & Wilds.geteSuit() == card.geteSuit()){
				Card.setbWild(bWild));
				
				}
			
		}
	 
		
	}
	public deckCards;Draw() throws DeckException{
		
		if (deckCards.size() == 0){
			throw new DeckException(this);
		}
		
		}
			
		
		return deckCards.remove(0);
	}
}
