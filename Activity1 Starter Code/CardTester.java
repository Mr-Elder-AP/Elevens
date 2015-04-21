/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("5", "Clubs", 5);
		Card card2 = new Card("5", "Clubs", 5);
		Card card3 = new Card("7", "Diamonds", 7);
		
		System.out.println("Card1 == Card2 : " + card1.matches(card2));
		System.out.println("Card1 == Card3 : " + card1.matches(card3));
		System.out.println("Card2 == Card3 : " + card2.matches(card3));
		
		System.out.println("\n\nTo String Tests");
		
		//To Strings
		System.out.println("Card 1 : " + card1);
		System.out.println("Card 2 : " + card2);
		System.out.println("Card 3 : " + card3);
	}
}
