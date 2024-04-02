import java.util.List;	  	   	  	      	  	 	    	
import java.util.ArrayList;	  	   	  	      	  	 	    	
import java.util.*;	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
public class Deck	  	   	  	      	  	 	    	
{	  	   	  	      	  	 	    	
  private ArrayList<Card> cards;	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  public Deck()	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
    cards = new ArrayList<Card>();	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
    ArrayList<String> suits = new ArrayList<>();	  	   	  	      	  	 	    	
    suits.add("diamond");	  	   	  	      	  	 	    	
    suits.add("heart");	  	   	  	      	  	 	    	
    suits.add("club");	  	   	  	      	  	 	    	
    suits.add("spade");	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
    for (String suit : suits)	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
      for (int value = 1; value <= 13; value++)	  	   	  	      	  	 	    	
      {	  	   	  	      	  	 	    	
        cards.add(new Card(suit, value));	  	   	  	      	  	 	    	
      }	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  public void shuffle()	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
    Collections.shuffle(cards);	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  public Card draw()	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
    if (cards.isEmpty())	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
      return null;	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
    else	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
      return cards.remove(0);	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
}