import java.util.ArrayList;
import java.util.List;



public class Player {
    //generated constructors using fields
	
	int score;
    
	List<Card> hand = new ArrayList<Card>();
    
    private String name;
    
    public Player() {
        score = 0;
    }

    public Player(String newName) {
        name = newName;
        score = 0;
    }
// print out when one card is drawn from top of the players hand
    public void describe() {
        System.out.printf("Player %s has the following cards: \n", name);
        for (Card card : hand) {
            card.describe();
        }
    }

    // gets top card of deck to players hand
    public Card flip() {
        return hand.remove(0);
    }

    
    // draws from each player hand to deck
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    //score is incremented when player draws to hand
   
    public void incrementScore() {
        score++;
    }

    // gets each players score
    public int getScore() {
        return score;
    }

    

    
	}


