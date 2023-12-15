import java.util.Random;
import java.util.Scanner;
public class TaskTwo {
        static int min_number = 1;
        static int max_number = 100;
        static int max_attempt = 10;
        static int max_round = 2;

        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int totalScore = 0;
            System.out.println("NUMBER GUESSING GAME");
            System.out.println("Total number of round you can play : "+ max_round);
            System.out.println("In each round you have 10 attempts to \"Guess The Number\" ");
            for (int i = 1; i <= max_round; i++) {
                int number = random.nextInt(max_number) + min_number;
                int currAttempts = 0;

                System.out.printf("Round Number %d: Guess the number in between %d and %d in %d attempts.\n", i, min_number, max_number,
                        max_attempt);
                while (currAttempts < max_attempt){
                    System.out.println("Enter Your Guess : ");
                    int guess_number = scanner.nextInt();
                    currAttempts = currAttempts + 1;
                    if (guess_number == number) {
                        int score = max_attempt - currAttempts;
                        totalScore = totalScore + score;
                        System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round %d score = %d\n",
                                currAttempts,i, score);
                        break;
                    }else if (guess_number < number) {
                        System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guess_number,
                                max_attempt - currAttempts);
                    }else{
                        System.out.printf("The number is less than %d. Attempts Left = %d.\n", guess_number,
                                max_attempt - currAttempts);
                    }
                }

                if (currAttempts < max_attempt) {
                    System.out.printf("Round = %d\n",i);
                    System.out.println("Attempts = 0");
                    System.out.printf("The Random Number Is : %d\n", number);
                }else{
                    System.out.printf("You lose in this round,The correct number is %d\n",number);
                    System.out.println("This round score is :0");
                }

            }
            System.out.printf("\nGame Completed.....\nYour total score is = %d\n", totalScore);
            scanner.close();
        }
}


