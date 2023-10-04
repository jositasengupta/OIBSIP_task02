package game;

import java.util.Scanner;

	public class Final {
		 public static void numberguessing()
		    {
		        Scanner sc=new Scanner(System.in);
		        String play = "yes";
		        while(play.contentEquals("yes"))
		        {
		        int limit,round,score,guess,randomNumber;
		        
		        score=0;
		        round=3;

		        while(round!=0)
		        {
		            if(round==3)
		            {
		                limit=10;
		            }
		            else if(round==2)
		            {
		                limit=5;
		            }
		            else
		            {
		                limit=3;
		            }
		        
		            guess=1+(int)(100*Math.random());
		        
		            System.out.println("You are in round "+(3-round+1)+" and you have "+limit+" chances for your guess");
		            while(limit!=0)
		            {
		                System.out.println("Enter your guess between 1 and 100:");
		                randomNumber=sc.nextInt();
		                limit--;

		                if(randomNumber==guess)
		                {
		                    System.out.println("Congratulations!You guessed the right number!");
		                    break;
		                }
		                else if(randomNumber<guess)
		                {
		                    System.out.println("Nope! The number is lower. Guess again.");
		                }
		                else
		                {
		                    System.out.println("Nope! The number is higher. Guess again.");
		                }
		            }
		            score=score+limit*10;
		            round--;
		        }
		        System.out.println("You score is "+score+"/180");
		        System.out.println("Would you like to play again? yes or no: ");
		        play = sc.next().toLowerCase();
		        }
		        sc.close();
		    }
		    public static void main(String[] args)
		    {
		        numberguessing();
		    }
		}



