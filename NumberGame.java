import java.io.*;
import java.util.Scanner;
public class NumberGame
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int chances=8;
      int finals=0;
      boolean playAgain=true;
      System.out.println("Welcome Buddy!");
      System.out.println("Hey Buddy you have about  "+chances+" chances to Win the Game");  
      while(playAgain)
      {
        int random=getrandomN(1,100);
        boolean guess=false;
        for(int i=0; i<chances; i++)
        {
          System.out.println("Chance"+(i+1)+" Enter your guess:");
          int user=sc.nextInt();
          if(user==random)
          {
            guess=true;
            finals+=1;
            System.out.println("You Won it.");
            break;
          }
            else if(user>random)
            {
              System.out.println("Two High");
            }
            else
            {
            System.out.println("Two Low");
          }
        }
        if(guess=false)
        {
          System.out.println("Sorry Buddy. You lost chances. The Number is "+random);
        }
        System.out.println("Do you want to play Again(y/n)");
        String PA=sc.next();
        playAgain=PA.equalsIgnoreCase("y");
      }
      System.out.println("That's it Buddy, Hope you enjoyed it");
      System.out.println("Here is your Score :"+finals);
   }
       public static int getrandomN(int min, int max)
       {
         return (int)(Math.random()*(max-min+1)+min);
       }
 }

      