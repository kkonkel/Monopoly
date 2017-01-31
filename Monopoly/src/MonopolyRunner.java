import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyRunner
	{
		public static void main(String[] args)
			{
				ArrayList <spaces> board = new ArrayList <spaces>();
				
				begining();				
			}

		public static void begining()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello welcome to monoply. What is your name?");
				String playerName = userInput.nextLine();
				System.out.println("Ok "+playerName+". Would you like to start?");
				Scanner userInput3 = new Scanner(System.in);
				String playerGoesFirst = userInput3.next();
				if(playerGoesFirst.equals("yes"))
					{
					playerOneTurn();
					}
//				else
//					{
//					aiTurn();	
//					}
			}
		public static void playerOneTurn()
		{
			Scanner userInput4 = new Scanner(System.in);
			System.out.println("type 'roll' to roll your dice");
			String rollYesOrNo = userInput4.nextLine();
			if(rollYesOrNo.equals("roll"))
				{
					diceRoll();
				}
		}
		public static void aiTurn()
		{
				System.out.println("It is the ");
		}
		public static int diceRoll()
		{
			int diceRoll1=(int)(Math.random()*6);
			int diceRoll2=(int)(Math.random()*6);
			int sum = diceRoll1+diceRoll2;
			System.out.println("You rolled a "+diceRoll1+" and a "+diceRoll2+" for a sum of "+sum);
			return sum;
		}
	}
