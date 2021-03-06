package application;

public class GrammarRule
{
	private String sentence = "default";

	public GrammarRule()
	{

	}

	/**
	 * This constructor is optional, GrammarRule(int num) is primary
	 * may alter in version two for more flexible usage
	 * GrammarRule generates a sentences structure from  
	 * @param num
	 * random number 1-4
	 * @param pL
	 * a PhraseList object
	 */
	public GrammarRule(int num, PhraseList pL)
	{
		// use all PhraseList get methods to construct sentence
		// pl.getFeeling/time/about/food/insult/verb
		switch (num)
		{
		// Adrienne create sentence structures
		// todo need to make first letter of all sentences capital, substring would be a
		// good way to easily do this if we start a sentence with a phrase
		case 1:
			sentence = "I " + pL.getFeeling() + " about " + pL.getAbout() + " " + pL.getTime() + ".";
			break;
		case 2:
			// example
			sentence = CapFirstLetter(pL.getFood()) + " " + pL.getVerb() + " like " + pL.getInsult() + "!";
			break;
		case 3:
			sentence = CapFirstLetter(pL.getFood()) + " " + pL.getVerb() + " like " + pL.getInsult() + " and I " + pL.getFeeling()
					+ " about " + pL.getAbout() + " :(";
			break;
		case 4:
			sentence = CapFirstLetter(pL.getTime()) + " I had " + pL.getFood() + " which tasted like " + pL.getInsult() + ", I now "
					+ pL.getFeeling() + " about " + pL.getAbout() + ".";
		}
	}
	
	/**
	 * GrammarRule builds a sentence structure 
	 * based in random number
	 * @param num
	 * random number 1-4
	 */
	public GrammarRule(int num) {
		PhraseList pL = new PhraseList();
			// use all PhraseList get methods to construct sentence
			// pl.getFeeling/time/about/food/insult/verb
		switch (num)
		{
		// Adrienne create sentence structures
		// todo need to make first letter of all sentences capital, substring would be a
		// good way to easily do this if we start a sentence with a phrase
		case 1:
			sentence = "I " + pL.getFeeling() + " about " + pL.getAbout() + " " + pL.getTime() + "." + "\n\n" + pL.getClosing() + "\n";
			break;
		case 2:
			// example
			sentence = CapFirstLetter(pL.getFood()) + " " + pL.getVerb() + " like " + pL.getInsult() + "!" + "\n\n" + pL.getClosing() + "\n";
			break;
		case 3:
			sentence = CapFirstLetter(pL.getFood()) + " " + pL.getVerb() + " like " + pL.getInsult() + " and I " + pL.getFeeling()
					+ " about " + pL.getAbout() + " :(" + "\n\n" + pL.getClosing() + "\n";
			break;
		case 4:
			sentence = CapFirstLetter(pL.getTime()) + " I had " + pL.getFood() + " which tasted like " + pL.getInsult() + ", I now "
					+ pL.getFeeling() + " about " + pL.getAbout() + ".\n\n" + pL.getClosing() + "\n";
		}
	}

	/**
	 * getter for sentence
	 * GrammarRule method
	 * @return
	 * sentence in form of string
	 */
	public String getSentence() 
	{
		return sentence;
	}// make a method that takes a string and makes first letter capital
	
	/**
	 * Takes a string and capitalizes first sentence
	 * used when a phrase is starting a sentence
	 * @param s
	 * Requires argument of string
	 * @return string with first letter capitalized
	 */
	public String CapFirstLetter(String s)
	{
		String newStr = "";
		newStr += Character.toUpperCase(s.charAt(0));
		newStr += s.substring(1);
		return newStr;
	}
}


