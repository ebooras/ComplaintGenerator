package application;

import java.util.ArrayList;

public class PhraseList
{
	// phrase is used in Michael's test class, phrase is called in the no arguments
	// constructor
	// may move to its own test method so it is not called everytime a PhraseList
	// object is created
	private String phrase	= "";

	// [0][i] = feeling phrase, [1][i] = time phrase, [2][i] = about phrase
	// [3][i] = foodItem phrase, [4][i] = insult phrase, [5][i] = verb phrase,
	// [6][i] = closing phrase [7][i] = adjective phrases
	private static String[][]	phrases	= new String[][]
	{
			//Feeling phrases
			new String[]
			{ "feel sad", "am angry", "am disappointed", "am irate", "feel guilty", "feel depressed", "feel ashamed",
					"am perplexed", "feel skeptical", "feel hostility", "am confused","feel anxious" },
			//Time phrases
			new String[]
			{ "last week", "yesterday", "the day before yesterday", "tomorrow", "last year", "30 seconds ago",
					"a fortnight ago", "three days before yesterday", "a micro second ago",
					"a microcentury ago (52 minutes and 35.69 seconds for the commoner)","last night","this morning", "a week ago" },
			//About phrases
			new String[]
			{ "my visit to Ralp's Ranky Ribs", "my visit to Furry's Pizza ", "the dish I had at The Spinach Moose",
					"my visit to Sucky Burgers", "the quality of the food", "the smell that permiated your facility",
					"the moaning cat noise that was coming from the kitchen area",
					"the fact that you let a childrens bday party happen in the bar" },
			//Food item phrases
			new String[]
			{ "your sandwich", "the french fries", "the burger", "your bittery butter salad with stank berries",
					"the soup", "the lobster bisque", "your stinky pete pizza", "the steak", "your pineapple curry",
					"your sushi","the chips", "the cookies", "the hot dog" },
			//Insult phrases
			new String[]
			{ "a soggy napkin", "barf", "yesterday's news", "sweaty underpants", "assphalt", "the gunk in keyboards",
					"earwax", "ketchup and mint gum", "donkey breath", "road kill", "the air in an old tire smells",
					"the time I ate tree bark", "the bottom of my shoe!", "my grandma's dentures!", "regret and disappointment!"  },
			//Verb phrases
			new String[]
			{ "tasted", "looked", "were cooked", "felt", "smelled", "had a texture", "shined", "baked","steamed"},
			//Closing phrases
			new String[]
			{ "With Love,", "Yours Truly,", "Sincerely,", "Kind Regards,", "Watch Yourself,", "Look behind you,",
					"Crying myself to sleep," },
			//Adjective phrases
			new String[]
			{ "inedible", "bland", "morose", "disgusting", "watery", "salty","awful" }
	};

	// to get length of a row" 'phrases[0].length // 4

	//ArrayList holds phrases so they don't repeat within the same sentence
	private ArrayList<String> currentlyUsed = new ArrayList<String>();

	//Generates a random phrase from each respective phraseList
	private String		feeling	= phrases[0][(int) (Math.random() * phrases[0].length)];
	private String		time	= phrases[1][(int) (Math.random() * phrases[1].length)];
	private String		about	= phrases[2][(int) (Math.random() * phrases[2].length)];
	private String		food	= phrases[3][(int) (Math.random() * phrases[3].length)];
	private String		insult	= phrases[4][(int) (Math.random() * phrases[4].length)];
	private String		verb	= phrases[5][(int) (Math.random() * phrases[5].length)];
	private String		closing	= phrases[6][(int) (Math.random() * phrases[6].length)];
	private String		adj    	= phrases[7][(int) (Math.random() * phrases[7].length)];

	// doesn't do anything, don't use this method
	public String[][] phraseTest()
	{
		return phrases;
	}

	//tests the currentlyUsed arrayList
	public void listCurrentlyUsed(){
		for(String e : currentlyUsed) System.out.println(e);
	}
	
	public void listAllPhrases() {
		for(int r = 0; r < phrases.length; r++) {
			for(int c = 0; c < phrases[r].length; c++) {
				System.out.print(phrases[r][c] + " ");
			}
			System.out.println("");
		}
	}

	// make getter methods for your list section
	/**
	 * getter method for PhraseList
	 * add feeling phrases temporarily to currentlyUsed ArrayList to avoid repeats
	 * @return a feeling phrase
	 */
	public String getFeeling()
	{
		while(currentlyUsed.contains(feeling)) feeling = phrases[0][(int) (Math.random() * phrases[0].length)];
		currentlyUsed.add(feeling);
		return feeling;
	}

	/**
	 * getter method for PhaseList
	 * add time phrases temporarily to currentlyUsed ArrayList to avoid repeats
	 * @return time phrase
	 */
	public String getTime()
	{
		while(currentlyUsed.contains(time)) time = phrases[1][(int) (Math.random() * phrases[1].length)];
		currentlyUsed.add(time);
		return time;
	}

	/**
	 * getter method for PhraseList
	 * add about phrases temporarily to currentlyUsed ArrayList to avoid repeats
	 * @return about phrase
	 */
	public String getAbout()
	{
		while(currentlyUsed.contains(about)) about = phrases[2][(int) (Math.random() * phrases[2].length)];
		currentlyUsed.add(about);
		return about;
	}

	/**
	 * getter method for PhraseList
	 * add food items temporarily to currentlyUsed ArrayList to avoid repeats
	 * @return food phrase
	 */
	public String getFood()
	{
		while(currentlyUsed.contains(food)) food = phrases[3][(int) (Math.random() * phrases[3].length)];
		currentlyUsed.add(food);
		return food;
	}

	/**
	 * getter method for PhraseList
	 * add insults temporarily to currentlyUsed ArrayList to avoid repeats
	 * @return insult phrase
	 */
	public String getInsult()
	{
		while(currentlyUsed.contains(insult)) insult = phrases[4][(int) (Math.random() * phrases[4].length)];
		currentlyUsed.add(insult);
		return insult;
	}

	/**
	 * getter method for PhraseList
	 * add verbs temporarily to currentlyUsed ArrayList to avoid repeats
	 * @return verb from Phrase list
	 */
	public String getVerb()
	{
		while(currentlyUsed.contains(verb)) verb = phrases[5][(int) (Math.random() * phrases[5].length)];
		currentlyUsed.add(verb);
		return verb;
	}
	
	/**
	 * getter method for PhraseList
	 * add closing temporarily to currentlyUsed ArrayList to avoid repeats
	 * @return closing from Phrase list
	 */
	public String getClosing()
	{
		while(currentlyUsed.contains(closing)) closing = phrases[6][(int) (Math.random() * phrases[6].length)];
		currentlyUsed.add(closing);
		return closing;
	}
	
	/**
	 * getter method for PhraseList
	 * add adjectives temporarily to currentlyUsed ArrayList to avoid repeats
	 * @return adj from Phrase list
	 */
	public String getAdj()
	{
		while(currentlyUsed.contains(adj)) adj = phrases[7][(int) (Math.random() * phrases[7].length)];
		currentlyUsed.add(adj);
		return adj;
	}


	public void resetCurrentlyUsed() {
		currentlyUsed.clear();
	}

}