package pokerBase;
import java.util.UUID;


public class Player {
	private UUID PlayerID;
	private String PlayerName;
	private int PlayerPosition;
	
	public Player(UUID playerID, String playerName, int playerPosition){
	
	setPlayerID(UUID.randomUUID());
	setPlayerName(playerName);
	setPlayerPosition(playerPosition);
	}

	public UUID getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(UUID playerID) {
		PlayerID = playerID;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getPlayerPosition() {
		return PlayerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		PlayerPosition = playerPosition;
	}
	
	

}
