public class Card	  	   	  	      	  	 	    	
{	  	   	  	      	  	 	    	
  private String suit;	  	   	  	      	  	 	    	
  private int value;	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  public void setValue(int value)	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
     this.value = value;	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  public Card(String suit, int value)	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
    this.suit = suit;	  	   	  	      	  	 	    	
    this.value = value;	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  public String getSuit()	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
     return suit;	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  public int getValue()	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
     return this.value;	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  public String convertToString(int num)	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
    String cardValue;	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
    if(value == 1)	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
        cardValue = "Ace";	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
    else if(value == 11)	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
        cardValue = "Jack";	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
    else if(value == 12)	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
        cardValue = "Queen";	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
    else if(value == 13)	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
        cardValue = "King";	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
    else	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
        cardValue = String.valueOf(value);	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
    return cardValue + " of "+ this.suit;	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
}