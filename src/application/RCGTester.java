package application;

public class RCGTester {
	// pulling in all of the components from PhraseList in order to test whether the
	// randomization works as it should
	PhraseList phraseList = new PhraseList();
	String feel = phraseList.getFeeling();
	String abt = phraseList.getAbout();
	String tm = phraseList.getTime();
	String food = phraseList.getFood();
	String insult = phraseList.getInsult();
	String verb = phraseList.getVerb();
	// building the array from the phrases in PhraseList
	String[][] phT = phraseList.phraseTest();

	/**
	 * runs tests
	 * 
	 * @param args
	 * Takes in the PhraseListTest arg and runs through a for loop going through every single 
	 * test case included in the PhraseListTest method. 
	 */

	// Test phrases to check whether test method runs correctly
	/*
	 * String feel="test"; String abt = "test"; String tm="test"; String food =
	 * "test"; String insult="test"; String verb ="test";
	 */

	public static void main(String[] args) {
		RCGTester rcgTest = new RCGTester();
		for (int i = 0; i < 6; i++) {
			rcgTest.PhraseListTest(i);
		}
	}

	/**
	 * 
	 * @param testNum
	 *  testNum is an integer taken in that determines which row of the array the user would
	 *  like to work on. The integers should only be between 1 and 5. 
	 * @return
	 * The method PhraseListTest is constructed to test the getter method and ensure that the 
	 * value obtained is in the correct array. If it is in the array, it outputs that the value
	 * is found in the correct array. If not, it outputs a statement indicating so. 
	 */

	// Takes in an argument that is a number, and conducts the test based on
	// corresponding number

	public boolean PhraseListTest(int testNum) {
		boolean containsF = false;
		if (testNum == 0) {
			for (String e : phT[0]) {
				if (e.equals(feel)) {
					containsF = true;
					if (containsF == true) {
						System.out.println("Feeling is in the correct array");
						break;
					}
				}
			}
			if (containsF == false) {
				System.out.println("Feeling is in the wrong array");
			}
		} else if (testNum == 1) {
			for (String e : phT[1]) {
				if (e.equals(tm)) {
					containsF = true;
					if (containsF == true) {
						System.out.println("Time is in the correct array");
						break;
					}
				}
			}
			if (containsF == false) {
				System.out.println("Time is in the wrong array");
			}
		}

		else if (testNum == 2) {
			for (String e : phT[2]) {
				if (e.equals(abt)) {
					containsF = true;
					if (containsF == true) {
						System.out.println("About is in the correct array");
						break;
					}
				}
			}
			if (containsF == false) {
				System.out.println("About is in the wrong array");
			}
		} else if (testNum == 3) {
			for (String e : phT[3]) {
				if (e.equals(food)) {
					containsF = true;
					if (containsF == true) {
						System.out.println("Food is in the correct array");
						break;
					}
				}
			}
			if (containsF == false) {
				System.out.println("Food is in the wrong array");
			}
		} else if (testNum == 4) {

			for (String e : phT[4]) {
				if (e.equals(insult)) {
					containsF = true;
					if (containsF == true) {
						System.out.println("Insult is in the correct array");
						break;
					}
				}
			}
			if (containsF == false) {
				System.out.println("Insult is in the wrong array");
			}
		} else if (testNum == 5) {
			for (String e : phT[5]) {
				if (e.equals(verb)) {
					containsF = true;
					if (containsF == true) {
						System.out.println("Verb is in the correct array");
						break;
					}
				}
			}
			if (containsF == false) {
				System.out.println("Verb is in the wrong array");
			}
		}
		return containsF;
	}

}
