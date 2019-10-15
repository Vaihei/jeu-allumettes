package fr.test.MatchesGame;

public class Game {

	private Player playerOne = new Player();
	
	private AutoPlayer autoPlayer = new AutoPlayer();
	
	private int totalMatches;
	
	private static int lowerBound = 4;
	private static int upperBound = 21;

	
	public Game() {
		super();
		this.totalMatches = initTotalMatches();
	}
	
	
	public int initTotalMatches() {		
		return GameUtils.getRandomValueFromInterval(lowerBound, upperBound);
	}

	
	public Player getPlayerOne() {
		return playerOne;
	}

	public void setPlayerOne(Player playerOne) {
		this.playerOne = playerOne;
	}
	
	public AutoPlayer getAutoPlayer() {
		return autoPlayer;
	}

	public void setAutoPlayer(AutoPlayer autoPlayer) {
		this.autoPlayer = autoPlayer;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	
}
