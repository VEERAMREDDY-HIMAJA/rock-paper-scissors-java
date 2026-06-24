import java.util.Scanner;
import java.util.Random;
public class ROCKPAPERSCISSORS{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       Random rand=new Random();
       System.out.println("How many rounds do you want to play?");
       int rounds=sc.nextInt();
       int userScore = 0;
       int computerScore = 0;
       int draws = 0;
       for(int i=1;i<=rounds;i++)
       {
        System.out.println("Round "+i);
        System.out.println("Enter Rock, Paper or Scissors:");
        String user=sc.next().toLowerCase();
       while((!user.equals("rock"))&& (!user.equals("paper"))&&(!user.equals("scissors")))
       {
        System.out.println("Invalid Input");
        System.out.println("Enter Rock,Paper or Scissors:");
        user=sc.next().toLowerCase();
       }
       int randomNum=rand.nextInt(3);
       String computerChoice="";
       switch(randomNum)
       {
        case 0:
            computerChoice="rock";
            break;
        case 1:
            computerChoice="paper";
            break;
        case 2:
            computerChoice="scissors";
            break;        

       }
       System.out.println("You chose: " + user);
      System.out.println("Computer chose: " + computerChoice);
       if(user.equals(computerChoice))
       {
        
        draws++;
        System.out.println("Round "+i+" is a draw");
       }
       else if((user.equals("paper") && computerChoice.equals("rock"))||
    (user.equals("scissors") && computerChoice.equals("paper"))|| (user.equals("rock") && computerChoice.equals("scissors")))
       {
         
         userScore++;
         System.out.println("You won round "+i);
       }
    else
      {
    
      computerScore++;
      System.out.println("Computer won round "+i);
      }
      System.out.println("You: " + userScore);
      System.out.println("Computer: " + computerScore);
      System.out.println("Draws: " + draws);
      
    }
    System.out.println("====Final Result====");
    System.out.println("You: " + userScore);
    System.out.println("Computer: " + computerScore);
    System.out.println("Draws: " + draws);
    if(userScore>computerScore)
      {
        System.out.println("You Wins!!");
      }
      else if(userScore==computerScore)
      {
        System.out.println("It's a Draw!!");
      }
      else
      {
        System.out.println("Computer Wins!!");
      }
     
      
    

    sc.close();




    }
    
}

