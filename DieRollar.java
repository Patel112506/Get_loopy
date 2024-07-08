import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int rollCount = 0;
            int die1, die2, die3;

            System.out.println("Throwing dice until we get a triple...");

            do {
                rollCount++;
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%d: %d %d %d (sum: %d)%n", rollCount, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.println("Triple found!");

            System.out.print("Do you want to play again? (Y/N): ");
            String response = in.nextLine().trim().toUpperCase();
            if (!response.equals("Y")) {
                playAgain = false;
            }
        }

        in.close();
    }
}
