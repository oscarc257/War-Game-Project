
public class Card{
	
	
	//1. create private fields of values and names 
	
	private int value;
	private String type;



// Generated constructor
	public Card(int value, String type) {
		
		this.value = value;
		this.type = type;
		// ends constructor
		}

	


	
	public String toString() {
	
		//create string builder for variable to print out
		StringBuilder displayCard = new StringBuilder();
		
		int value = 0;
	// else if to determine each type of card in deck	
	if (value == 1) {
	  System.out.println("Two");
	}else if (value == 2) {
		System.out.println("Three");
	}else if (value == 3) {
		System.out.println("Four");
	}else if (value == 4) {
		System.out.println("Five");
	}else if (value == 5) {
		System.out.println("Six");
    }else if (value == 6) {
    	System.out.println("Seven");
    }else if (value == 7) {
    	System.out.println("Eight");
    }else if (value == 8) {
    	System.out.println("Nine");
    }else if (value == 9) {
    	System.out.println("Ten");
    }else if (value == 10) {
    	System.out.println("Jack");
    }else if (value == 11) {
    	System.out.println("Queen");
    }else if (value == 12) {
    	System.out.println("King");
    }else if (value == 13) {
    	System.out.println("Ace");
    
  }
		displayCard.append(" of ");// output to print on console
		return displayCard.toString(); // returned result of string builder
	}
	
	
	
	
	public void describe() {
        System.out.printf("Card: %s with value of %d\n", type, value);
	
	
	}

//getters and setters
	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	

}
