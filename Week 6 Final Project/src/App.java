
public class App {

	public static void main(String[] args) {
		// Instantiate a Deck and and player 1 and player 2

	    Deck deck = new Deck();
        Player player1 = new Player("1");
        Player player2 = new Player("2");
        deck.shuffle();

        //used for loop to iterate 52 times a player draws
        
        for (int i = 0; i < 52; i++) {
            if ( i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

       
        // iterate 26 times and call flip method to determine the score of both players
        
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
            }
        }

        // end of game, output results.
        
        System.out.printf("Player1 score = %d\n", player1.getScore());
        System.out.printf("Player2 score = %d\n", player2.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player1 wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player2 wins!");
        } else {
            System.out.println("It is a DRAW!");
        }
		
		
		
	}


}
