package application;

public class PhraseList
{
	// phrase is used in Michael's test class, phrase is called in the no arguments
	// constructor
	// may move to its own test method so it is not called everytime a PhraseList
	// object is created
	private String	phrase	= "";

	// [0][i] = feeling phrase, [1][i] = time phrase, [2][i] = about phrase
	// [3][i] = foodItem phrase, [4][i] = insult phrase, [5][i] = verb phrase,
	// [6][i] = closing phrase
	private String[][]	phrases	= new String[][]
	{																													// jason
			new String[]
			{ "feel sad", "am angry", "am disappointed", "am irate", "feel guilty", "feel depressed", "feel ashamed",
					"feel guilty", "am perplexed", "feel skeptical" },
			new String[]
			{ "last week", "yesterday", "the day before yesterday", "tomorrow", "last year", "30 seconds ago",
					"a fortnight ago", "three days before yesterday", "a micro second ago",
					"a microcentury ago (52 minutes and 35.69 seconds for the commoner)" },
			// Adrienne about and foodItem
			new String[]
			{ "my visit to Ralp's Ranky Ribs", "my visit to Furry's Pizza ", "the dish I had at The Spinach Moose",
					"my visit to Sucky Burgers", "the quality of the food", "the smell that permiated your facility",
					"the moaning cat noise that was coming from the kitchen area",
					"the fact that you let a childrens bday party happen in the bar" },
			new String[]
			{ "your sandwhich", "the french fries", "the burger", "your bittery butter salad with stank berries",
					"the soup", "the lobster bisque", "your stinky pete pizza", "the steak", "your pineapple curry",
					"your sushi" },
			new String[]
			{ "a soggy napkin", "barf", "yesterday's news", "sweaty underpants", "assphalt", "the gunk in keyboards",
					"earwax", "ketchup and mint gum", "donkey breath", "raod kill", "the air in an old tire smells",
					"the time I ate tree bark" },
			new String[]
			{ "tasted", " looked", "were cooked", "felt", "smelled", "had a texture", "shined"},
			new String[]
			{ "With Love,", "Yours Truly,", "Sincerely,", "Kind Regards,", "Watch Yourself,", "Look behind you,",
					"Crying myself to sleep," }
	};

	// to get length of a row" 'phrases[0].length // 4

	// make a method that takes a string and makes first letter capital

	// We should never see the defaults, one string per phrase type

	private String		feeling	= phrases[0][(int) (Math.random() * phrases[0].length)];
	private String		time	= phrases[1][(int) (Math.random() * phrases[1].length)];
	private String		about	= phrases[2][(int) (Math.random() * phrases[2].length)];
	private String		food	= phrases[3][(int) (Math.random() * phrases[3].length)];
	private String		insult	= phrases[4][(int) (Math.random() * phrases[4].length)];
	private String		verb	= phrases[5][(int) (Math.random() * phrases[5].length)];
	private String		closing	= phrases[6][(int) (Math.random() * phrases[6].length)];

	// Michael Test

	public String[][] phraseTest()
	{
		return phrases;
	}

	// make getter methods for your list section
	/**
	 * getter method for PhraseList
	 * 
	 * @return a feeling phrase
	 */
	public String getFeeling()
	{
		return feeling;
	}

	/**
	 * getter method for PhaseList
	 * 
	 * @return time phrase
	 */
	public String getTime()
	{
		return time;
	}

	/**
	 * getter method for PhraseList
	 * 
	 * @return about phrase
	 */
	public String getAbout()
	{
		return about;
	}

	/**
	 * getter method for PhraseList
	 * 
	 * @return food phrase
	 */
	public String getFood()
	{
		return food;
	}

	/**
	 * getter method for PhraseList
	 * 
	 * @return insult phrase
	 */
	public String getInsult()
	{
		return insult;
	}

	/**
	 * getter method for PhraseList
	 * 
	 * @return verb from Phrase list
	 */
	public String getVerb()
	{
		return verb;
	}
	
	/**
	 * getter method for PhraseList
	 * 
	 * @return closing from Phrase list
	 */
	public String getClosing()
	{
		return closing;
	}


}