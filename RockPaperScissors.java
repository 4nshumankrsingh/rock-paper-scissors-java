import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("ROCK, PAPER, SCISSORS!!");
        System.out.println("************************");
        String[] choices = {"ROCK", "PAPER", "SCISSORS"};
        String playerChoice;
        String playAgain;
        int score = 0;
        String computerChoice;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            System.out.print("What's your move? (Rock / Paper / Scissors): ");
            playerChoice = scanner.nextLine().toUpperCase();
            if(!playerChoice.equals("ROCK") && !playerChoice.equals("PAPER") && !playerChoice.equals("SCISSORS")) {
            System.out.println("Enter a valid choice!");
        }
        computerChoice = choices[random.nextInt(3)];
        System.out.printf("You chose '%s'\n", playerChoice);
        System.out.printf("And the computer chose '%s'\n", computerChoice);
        if(playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        }
        else if((playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) || (playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER")) || (playerChoice.equals("PAPER") && computerChoice.equals("ROCK"))) {
            System.out.println("You win!");
            score++;
        }
        else if((playerChoice.equals("PAPER") && computerChoice.equals("SCISSORS")) || (playerChoice.equals("ROCK") && computerChoice.equals("PAPER")) || (playerChoice.equals("SCISSORS") && computerChoice.equals("ROCK"))) {
            System.out.println("You lose!");
            score--;
        }
        System.out.printf("Your score is: %d\n", score);
        
        System.out.print("Do you want to play again? (yes/no): ");
        playAgain = scanner.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("Thank you for playing!");


        scanner.close();
    }
}