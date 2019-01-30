package application;

import org.junit.Ignore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RCGTest {
	PhraseList phraseList;
	@Ignore
	@Before
	public void setUp() throws Exception{
	phraseList=new PhraseList();}
	@Ignore
	@Test
	public void phraseTest() {
		//phrase[0]
		Assert.assertEquals("feel sad","feel sad");
		Assert.assertEquals("am angry", "am angry");
		Assert.assertEquals("was disappointed", "was disappointed");
		Assert.assertEquals("...", "...");
		
		//phrase[1]
		
		Assert.assertEquals("last week","last week");
		Assert.assertEquals("yesterday","yesterday");
		Assert.assertEquals("the day before yesterday","the day before yesterday");
		Assert.assertEquals("tomorrow","tomorrow");
		Assert.assertEquals("last year","last year");
		Assert.assertEquals("30 seconds ago","30 seconds ago");
		
		//phrase[2]
		Assert.assertEquals("last week","last week");
		Assert.assertEquals("last week","last week");
		Assert.assertEquals("last week","last week");
		Assert.assertEquals("last week","last week");
		Assert.assertEquals("last week","last week");

		
		//Need to figure out a way to check whether or not the object being read in exists in the list
		//print out whole list of grammar rule and check each one to make sure that they make sense
		//grammar check in word
	}
		public String feel=phraseList.getFeeling();
		public String abt=phraseList.getAbout();
		public String tm=phraseList.getTime();
		public String food=phraseList.getFood();
		public String insult=phraseList.getInsult();
		public String verb=phraseList.getVerb();
		public String[][] phT=phraseList.phraseTest();

		public void PhraseListTest(int testNum) {
		if (testNum==0) {
			boolean containsF=false;
			for (String e:phT[0]){
				if (e.equals(feel)) {
					containsF=true;
					}
				}
			System.out.print(containsF);}
		
		else if (testNum==1) {
				boolean containsF=false;
				for (String e:phT[1]){
					if (e.equals(abt)) {
						containsF=true;
						}
					}
				System.out.print(containsF);}
		
		else if (testNum==2) {
				boolean containsF=false;
				for (String e:phT[2]){
					if (e.equals(tm)) {
						containsF=true;
							}
						}
				System.out.print(containsF);}
		
		else if (testNum==3) {
			boolean containsF=false;
			for (String e:phT[3]){
				if (e.equals(food)) {
					containsF=true;
						}
					}
			System.out.print(containsF);}
		
		else if (testNum==4) {
			boolean containsF=false;
			for (String e:phT[4]){
				if (e.equals(insult)) {
					containsF=true;
						}
					}
			System.out.print(containsF);}
		
		else if (testNum==5) {
			boolean containsF=false;
			for (String e:phT[5]){
				if (e.equals(verb)) {
					containsF=true;
						}
					}
			System.out.print(containsF);}
		
		PhraseListTest(1);
	}
		//System.out.print(testRule);
		//Assert.assertEquals("I" + pl.getFeeling() + pl.getAbout() + pl.getTime() + "because" + pl.getInsult() + pl.getVerb(),"I" + pl.getFeeling() + pl.getAbout() + pl.getTime() + "because" + pl.getInsult() + pl.getVerb() );
		
	}
	
	


