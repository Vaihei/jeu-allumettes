package fr.test.MatchesGame;

public class AutoPlayer extends Player {

	private int lowerBound = choiceValues[0];
	private int upperBound = choiceValues[2];
	
	@Override
	public int gameOn() {		
		int matches = GameUtils.getRandomValueFromInterval(lowerBound, upperBound);
		return matches;
	}

	public int thinkStrategic(int remainingMatches) {
		int matches = 0;
		
		for(int i = 0; i < choiceValues.length; i++) {
			if(remainingMatches - choiceValues[i] == 4) {
				matches = choiceValues[i];
				break;
			}
		}
		
		if(matches == 0 && remainingMatches <= upperBound) {
			matches = remainingMatches;
		}
		else if (matches == 0){
			matches = GameUtils.getRandomValueFromInterval(lowerBound, upperBound);
		}
		System.out.println("Le joueur Auto retire " + matches + " allumettes.");
		return matches;
	}
	
}
