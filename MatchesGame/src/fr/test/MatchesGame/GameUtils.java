package fr.test.MatchesGame;

import java.util.Arrays;
import java.util.Random;

public class GameUtils {

	public static boolean isInInterval(final int valueToTest, int[] choiceValues) {
		boolean isInInterval = Boolean.FALSE;
		if (Arrays.binarySearch(choiceValues, valueToTest) >= 0) {
			isInInterval = Boolean.TRUE;
		}
		return isInInterval;
	}

	public static int getRandomValueFromInterval(int lowerBound, int upperBound) {
		Random rand = new Random();
		int randomInt = lowerBound + rand.nextInt((upperBound + 1) - lowerBound);
		return randomInt;
	}

	public static void displayMatches(int remainingMatches) {
		System.out.println("Il reste " + remainingMatches + " allumettes.");
	}

	public static int soustractMatches(int matches, int matchesToRetrieve) throws Exception {
		int remainingMatches = 0;

		if (matches > matchesToRetrieve) {
			remainingMatches = matches - matchesToRetrieve;
		}
		return remainingMatches;
	}

}
