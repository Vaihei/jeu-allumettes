package fr.test.MatchesGame;

public class LetsPlayWithMatches {

	public static void main(String[] args) {
		
		Game gameOne = new Game();
		int remainingMatches = gameOne.getTotalMatches();
		
		System.out.println("Le nombre d'allumettes est : " + remainingMatches);
		System.out.println("___________________________________________");
		
		while(remainingMatches > 0) {
			// PlayerOne plays first.
			int matchesPOne = gameOne.getPlayerOne().gameOn();
			
			if(matchesPOne != 0) {
				try {
					remainingMatches = GameUtils.soustractMatches(remainingMatches, matchesPOne);
				} catch (Exception e) {
					System.out.println("Joueur 1, nous ne pouvez pas choisir un nombre inférieur au total des allumettes restantes. Vous perdez votre tour.");
				}
				GameUtils.displayMatches(remainingMatches);
				
				System.out.println("---------------------------------------");
 
				// Player Auto plays second. 
				int matchesPAuto = gameOne.getAutoPlayer().thinkStrategic(remainingMatches);
				
				try {
					remainingMatches = GameUtils.soustractMatches(remainingMatches, matchesPAuto);
				} catch (Exception e) {
					System.out.println("Joueur Auto, nous ne pouvez pas choisir un nombre inférieur au total des allumettes restantes. Vous perdez votre tour.");
				}
				GameUtils.displayMatches(remainingMatches);
				
				System.out.println("___________________________________________");

			}
		}
		
		gameOne.getPlayerOne().terminateInput();
		System.out.println("Fin de la partie.");	
	}
}
