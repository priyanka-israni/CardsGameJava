import java.util.*;	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
public class Main	  	   	  	      	  	 	    	
{	  	   	  	      	  	 	    	
  public static void main(String[] args)	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
    Scanner sc=new Scanner(System.in);	  	   	  	      	  	 	    	
    int count=0;	  	   	  	      	  	 	    	
    int flag = 0;	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
    Deck card1 = new Deck();	  	   	  	      	  	 	    	
    Deck card2 = new Deck();	  	   	  	      	  	 	    	
    card1.shuffle();	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
    //BRONZE	  	   	  	      	  	 	    	
    System.out.println("Draw 5 random cards");	  	   	  	      	  	 	    	
    for(int i=0; i<5; i++)	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
      Card cardDraw = card1.draw();	  	   	  	      	  	 	    	
      if (cardDraw != null)	  	   	  	      	  	 	    	
      {	  	   	  	      	  	 	    	
        System.out.println(cardDraw.getValue()+" of "+ cardDraw.getSuit());	  	   	  	      	  	 	    	
      }	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
    //SILVER	  	   	  	      	  	 	    	
    Card cardDraw = card1.draw();	  	   	  	      	  	 	    	
    System.out.println("First card draw");	  	   	  	      	  	 	    	
    Card cardDraw1 = card1.draw();	  	   	  	      	  	 	    	
    if (cardDraw1 != null)	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
      System.out.println(cardDraw1.getValue()+" of "+ cardDraw1.getSuit());	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  System.out.println("higher or lower?");	  	   	  	      	  	 	    	
  String input = sc.nextLine();	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  do	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
    System.out.println("Second card draw");	  	   	  	      	  	 	    	
    cardDraw = card2.draw();	  	   	  	      	  	 	    	
    if (cardDraw != null)	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
      System.out.println(cardDraw.getValue()+" of "+ cardDraw.getSuit());	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
    if(input.equals("higher"))	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
      if(cardDraw1.getValue() < cardDraw.getValue())	  	   	  	      	  	 	    	
      {	  	   	  	      	  	 	    	
        System.out.println("correct, it is higher!");	  	   	  	      	  	 	    	
        flag=1;	  	   	  	      	  	 	    	
        count = count+1;	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
      }	  	   	  	      	  	 	    	
      else if(cardDraw1.getValue() == cardDraw.getValue())	  	   	  	      	  	 	    	
      {	  	   	  	      	  	 	    	
        flag=0;	  	   	  	      	  	 	    	
        System.out.println("same");	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
      }	  	   	  	      	  	 	    	
      else if(cardDraw1.getValue() > cardDraw.getValue())	  	   	  	      	  	 	    	
      {	  	   	  	      	  	 	    	
        System.out.println("wrong, its lower");	  	   	  	      	  	 	    	
        flag=0;	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
      }	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
    if(input.equals("lower"))	  	   	  	      	  	 	    	
    {	  	   	  	      	  	 	    	
      if(cardDraw1.getValue() > cardDraw.getValue())	  	   	  	      	  	 	    	
      {	  	   	  	      	  	 	    	
        System.out.println("correct, it is lower!");	  	   	  	      	  	 	    	
        flag=1;	  	   	  	      	  	 	    	
        count = count+1;	  	   	  	      	  	 	    	
      }	  	   	  	      	  	 	    	
      else if(cardDraw1.getValue() == cardDraw.getValue())	  	   	  	      	  	 	    	
      {	  	   	  	      	  	 	    	
        flag=0;	  	   	  	      	  	 	    	
        System.out.println("same");	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
      }	  	   	  	      	  	 	    	
      else if(cardDraw1.getValue() < cardDraw.getValue())	  	   	  	      	  	 	    	
      {	  	   	  	      	  	 	    	
        flag=0;	  	   	  	      	  	 	    	
        System.out.println("wrong, its higher");	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
      }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
    }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  if (flag==1)	  	   	  	      	  	 	    	
  {	  	   	  	      	  	 	    	
   int value = cardDraw.getValue();	  	   	  	      	  	 	    	
   cardDraw1.setValue(value);	  	   	  	      	  	 	    	
    System.out.println("higher or lower?");	  	   	  	      	  	 	    	
    input = sc.nextLine();	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
	  	   	  	      	  	 	    	
  } while(flag==1);	  	   	  	      	  	 	    	
  System.out.println("score = "+count);	  	   	  	      	  	 	    	
  }	  	   	  	      	  	 	    	
}