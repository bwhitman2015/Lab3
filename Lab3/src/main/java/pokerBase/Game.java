package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> PlayersInGame;
	
	public Game(UUID newTableID, ArrayList<Player> ListOfPlayers){
		this.setGameID(UUID.randomUUID());
		this.setTableID(newTableID);
		this.setPlayersInGame(ListOfPlayers);
		
	}
	
	

	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public ArrayList<Player> getPlayersInGame() {
		return PlayersInGame;
	}

	public void setPlayersInGame(ArrayList<Player> playersInGame) {
		PlayersInGame = playersInGame;
	}

	public Game(){
		this.GameID = UUID.randomUUID();
	}
}
