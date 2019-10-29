import java.util.Scanner;
public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber;
        int guess;
        secretNumber = 123;
        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();
        while ( guess == 5 )
        {
            System.out.println("\nLoop complete.");
            break;
        }
        System.out.println("You are correct. You win a prize!");
        keyboard.close();
    }
}