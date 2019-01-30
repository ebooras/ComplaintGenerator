package application;

public class PhraseListTest {

	// class is testing each getter method to assure no repeats are randomly chosen
	public static void main(String[] args) {
		PhraseList pl = new PhraseList();
		pl.resetCurrentlyUsed(); 
		
		
		// test feeling phrases
		for(int i = 0; i < 9; i++) System.out.println(i + ") " + pl.getFeeling());
		System.out.println("Currently used feeling phrases:");
		pl.listCurrentlyUsed();
		pl.resetCurrentlyUsed();
		
		// test time phrases
		for(int i = 0; i < 10; i++) System.out.println(i + ") " + pl.getTime());
		System.out.println("Currently used time phrases:");
		pl.listCurrentlyUsed();
		pl.resetCurrentlyUsed();
		
		// test about phrases
		for(int i = 0; i < 8; i++) System.out.println(i + ") " + pl.getAbout());
		System.out.println("Currently used about phrases:");
		pl.listCurrentlyUsed();
		pl.resetCurrentlyUsed();
		
		// test food phrases
		for(int i = 0; i < 10; i++) System.out.println(i + ") " + pl.getFood());
		System.out.println("Currently used food phrases:");
		pl.listCurrentlyUsed();
		pl.resetCurrentlyUsed();
		
		// test insult phrases
		for(int i = 0; i < 12; i++) System.out.println(i + ") " + pl.getInsult());
		System.out.println("Currently used insult phrases:");
		pl.listCurrentlyUsed();
		pl.resetCurrentlyUsed();
		
		// test verb phrases
		for(int i = 0; i < 7; i++) System.out.println(i + ") " + pl.getVerb());
		System.out.println("Currently used verb phrases:");
		pl.listCurrentlyUsed();
		pl.resetCurrentlyUsed();
		
		// test closing phrases
		for(int i = 0; i < 7; i++) System.out.println(i + ") " + pl.getClosing());
		System.out.println("Currently used closing phrases:");
		pl.listCurrentlyUsed();
		pl.resetCurrentlyUsed();
		
	}

}
