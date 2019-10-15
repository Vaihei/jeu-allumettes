package fr.test.MatchesGame;

import java.util.Scanner;

public class Player {
	
	protected final static int[] choiceValues = {1,2,3};

	private int failedAttempt;
	
	private static Scanner scan = new Scanner(System.in);
	
	
	public Player() {
		super();
		this.failedAttempt = 0;
	}
	

	public int gameOn() {
		int matches = 0;

		while(matches == 0 && failedAttempt < 3) {
			String inputPlayer = readPlayerChoice();

			if (validateChoice(inputPlayer)) {
				matches = Integer.parseInt(inputPlayer);
			} else {
				failedAttempt++;
			}
		}
		return matches;
	}

	protected boolean validateChoice(String inputPlayer) {
		boolean isValidated = Boolean.FALSE;
		
		if (inputPlayer.length() == 1 && Character.isDigit(inputPlayer.charAt(0))) {
			int matchesTemp = Integer.parseInt(inputPlayer);
			isValidated = GameUtils.isInInterval(matchesTemp, choiceValues);
		}
		return isValidated;
	}

	private static String readPlayerChoice() {
		System.out.println("Player 1, choisissez un nombre entre 1 et 3: ");
		final String playerInput = scan.nextLine();
		return playerInput;
	}

	public void terminateInput() {
		scan.close();
	}

}
