/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
        Deck deck1 = new Deck(new String[]{"3", "5", "7", "Ace"}, new String[]{"Spades", "Diamonds", "Hearts", "Clubs"}, new int[]{3, 5, 7, 10});
        Deck deck2 = new Deck(new String[]{"4", "6", "9", "Jack"}, new String[]{"Spades", "Diamonds", "Hearts", "Clubs"}, new int[]{4, 6, 9, 10});
        Deck deck3 = new Deck(new String[]{"2", "2", "6", "King"}, new String[]{"Spades", "Diamonds", "Hearts", "Clubs"}, new int[]{2, 2, 6, 10});
        
        Deck deck4 = new Deck(new String[]{"A", "B", "C"}, new String[]{"Giraffes", "Lions"}, new int[]{2, 1, 6});

        System.out.println("Deck 1's Size : " + deck1.size());
        System.out.println("Deck 2's Size : " + deck2.size());
        System.out.println("Deck 3's Size : " + deck3.size());
        System.out.println("Deck 4's Size : " + deck4.size());

        System.out.println("Card Dealt from deck 1 : " + deck1.deal());
        System.out.println("Card Dealt from deck 2 : " + deck2.deal());
        System.out.println("Card Dealt from deck 3 : " + deck3.deal());
        System.out.println("Card Dealt from deck 4 : " + deck4.deal());

        System.out.println(deck1);
        System.out.println(deck2);
        System.out.println(deck3);
        System.out.println(deck4);
    }
}
