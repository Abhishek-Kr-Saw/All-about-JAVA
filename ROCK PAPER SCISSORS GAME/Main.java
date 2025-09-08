import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        // ROCK PAPER SCISSORS GAME
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        String[] choice = {"rock" , "paper" , "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{ 
            System.out.println("Enter your choice (rock,paper,scissors): ");
            playerChoice = sc.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && 
                !playerChoice.equals("scissors")){
                    System.out.println("Invalid choice!!");
                    continue;
                }

            computerChoice = choice[ran.nextInt(3)];
            System.out.println("Computer choice : "+computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!!");
            }else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))
            ){
                System.out.println("You win!!");
            }else{
                System.out.println("You loss!!");
            }

            System.out.print("Play again (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        sc.close();
    }
}
