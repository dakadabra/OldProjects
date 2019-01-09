package Programs;
import java.util.Scanner;
/**
 *
 *  Hi-Lo number game: The computer picks a number between 1 and 100
 *  and then asks the user to guess the number.  After the customer guesses
 *  the number, the program tells the user whether each guess is too high or low.
 *  The program keeps going until the user guesses the number correctly.
 *
 * @author Zach Tomaszewski
 * @version 06 Oct 2009
 */
public class GuessANumber {

  public static void main(String[] args) {


	  Scanner keybd = new Scanner(System.in);

    // declare a variable to store the generated random number and initialize it to 0;
    int randomNumber = 0;

    // Generate a random number between one and a hundred using the
    // random number generating method in the java Math library.
    //
    randomNumber =(int) (Math.random() * 100) + 1;  //1 to 100

    // Prompt the user to try and guess the number.
    System.out.println("Try to guess what number I have in mind (1 to 100).");

    int guess = 0;

    // Allow the user to keep guessing as long as their guess is not equal to the randomNumber.
    while (guess != randomNumber) {

        System.out.print("Enter your guess: ");
        guess = keybd.nextInt();

        // If the guess is too low print "Too Low"
        // if too high print "Too high"
        // if it is equal we will exist the loop, congratulate the user and end the game.
        if (guess < randomNumber)
        {
          System.out.println("Too low.");
        }
        else if (guess > randomNumber)
        {
          System.out.println("Too high.");
        }

    }
    //We can only get here when loop ends which is when: guess == target
    System.out.println("Congratulations! You have guessed the number!");

  }
}
