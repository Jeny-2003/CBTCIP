import java.util.*;

public class Task{
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MAX_ROUNDS = 3;


    public static void main (String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total number of rounds : 3");
        System.out.println("Attempts to guess number in each round : 10");

        for (int i = 1; i<= MAX_ROUNDS; i++)
        {
            int number = random.nextInt(MAX_RANGE) + MIN_RANGE;
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, MIN_RANGE, MAX_RANGE, MAX_ATTEMPTS);

            while (attempts < MAX_ATTEMPTS) {
                System.out.println("Enter your guess");
                int guess_number = scanner.nextInt();
                attempts = attempts + 1;

                if (guess_number == number) {
                    int score = MAX_ATTEMPTS -attempts;
                    totalScore = totalScore + score;
                    System.out.printf("hurray! number guessed successfully. attempts = %d. round score = %d\n",attempts, score);
                    break;
                    
                }
                else if (guess_number < number) {
                    System.out.printf("The number is greater than %d, attempts left = %d.\n",guess_number,MAX_ATTEMPTS - attempts);
                    
                }
                

                else if (guess_number > number) {
                    System.out.printf("The number is less than %d, attempts left = %d.\n",guess_number,MAX_ATTEMPTS - attempts);
                    
                }
                
            }

                if (attempts == MAX_ATTEMPTS) {
                    System.out.printf("\nRound = %d\n",i);
                    System.out.println("attempts = 0");
                    System.out.printf("the random number is : %d\n\n", number);
                }
        }

        System.out.printf("game over. total score = %d\n", totalScore);
        scanner.close();

    }
}