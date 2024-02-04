/*TASK-1 :GUESS THE NUMBER GAME USING JAVA*/
import java.util.*;

class RandomNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;

        do {
            int roundScore = playRound(sc);
            totalScore += roundScore;

            System.out.println("Your Total Score is: " + totalScore);

            System.out.println("Do you want to play another round? (yes/no)");
            String playAgain = sc.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
				System.out.println("Your total Score is:"+totalScore);
                System.out.println("Thanks for playing! Exiting the game.");
                break;
            }
        } while (true);

        sc.close(); // Close the scanner to avoid resource leaks
    }

    private static int playRound(Scanner sc) {
        Random num = new Random();
        int score = 0;

        System.out.println("=======================================================");
        System.out.println("          WELCOME TO GUESS THE NUMBER GAME!!");
        System.out.println("=======================================================");
        System.out.println("Computer picked a random number between 1 to 100\nYou should guess the number in 5 chances");
        System.out.println("=======================================================");

        int number = num.nextInt(100) + 1;

        for (int i = 5; i > 0; i--) {
            System.out.println("You have " + i + " chances left");
            System.out.println("**********************************************************");
            System.out.println("Guess the number");
            int guess = sc.nextInt();

            if (guess == number) {
                switch (i) {
                    case 5:
                        score = 100;
                        break;
                    case 4:
                        score = 80;
                        break;
                    case 3:
                        score = 60;
                        break;
                    case 2:
                        score = 40;
                        break;
                    case 1:
                        score = 20;
                        break;
                    default:
                        score = 0;
                        break;
                }
                System.out.println("You guessed it right!!" + "\nYour Score for this round is: " + score);
                break;
            } else if (guess < number) {
                System.out.println("Your guess is Low!!");
            } else {
                System.out.println("Your guess is high!!");
            }
        }

        if (score == 0) {
            System.out.println("OOPS! You have 0 chances left\nThe number is: " + number + "\nYour Score for this round is: " + score);
        }

        return score;
    }
}
