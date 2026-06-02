import java.util.*;
public class task10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int ans = random.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            if (guess < ans) {
                System.out.println("Too low!");
            } else if (guess > ans) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (guess != ans);
    }
}