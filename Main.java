public class Main
{
    private static String _studentName = "Andy Tran";
    private static int _studentPeriod = 1;//Enter Class Period#

	public static void main(String[] args) {
		
		testCard();
		testDeck();
		System.out.println(_studentName + " period: " + _studentPeriod);		
	}
	
	public static void testCard(){
	    System.out.println("Testing card class with individual card:");
	    Card c = new Card(3, 12);
	    System.out.println(c + "\n");
	    
	    Card c2 = new Card(1, 1, 100);
	    System.out.println(c2 + ", value = " + c2.getValue() + "\n");
	}
	
	public static void testDeck(){
	    Deck deck = new Deck(true);
		
		System.out.println(deck.getSize() + " cards in new deck.\n");
		
		System.out.println("Listing cards in deck:\n" + deck.getAllCards());
		deck.shuffle();
		System.out.println("Listing cards after shuffle:\n" + deck.getAllCards());
		
		System.out.println("Dealing first five cards:");
		for(int i = 0; i<5; i++){
		    System.out.println(deck.dealCard());
		}

		System.out.println("\n" + deck.getSize() + " cards remaining in deck.");
	}
}
//how to make a deck shuffler
//Collections.shuffle();
//https://books.trinket.io/thinkjava/chapter12.html
//https://stackoverflow.com/questions/20410615/java-arraylist-deck-class

