import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
//        need a secret number
//        user needs to guess it - take input
//        if user too high or low, let them know
//        if guessed correctly, let them know

        int secretNumber = 9;
        System.out.println("Guess my secret number! ");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        System.out.println("Your guess was: " + guess);

        if(guess.equals(String.valueOf(secretNumber))){
            System.out.println("Nice, that is the correct number!");
        } else if(secretNumber < Integer.valueOf(guess)){
            System.out.println("Too high, guess again!");
        } else {
            System.out.println("Too low, guess again!");
        }
    }
}
