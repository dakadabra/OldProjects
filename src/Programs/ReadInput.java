package Programs;
import java.util.*;   // so that I can use Scanner

public class ReadInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your age.  (If you do not want to play anymore enter -1999.)\n");

        int age = 0;

        while (age != -1999) {  // keep going until -1999 is entered.

            //System.out.print("\n Lets play again.  How old are you? (If you don't want to play anymore enter -1999.) \n");
            age = console.nextInt();
            System.out.println();   // Print one is a blank line
            if (age < 0) {
              System.out.println(age + " years old! You are not born yet!");
            }
            else if (age > 100) {
            	System.out.println(age + "! You turned a hundred, " + (age-100) + " years ago!");
            }
            else if ((age > 0) && (age < 6)) {
            	System.out.println(age + "! Dude, you are too young.  Do you have permission to use this computer?");
            }
            else {
            	System.out.println(age + " You will turn 100 in " + (100-age) + " years.");
            }
            System.out.println();   // Print one is a blank line
            System.out.println("Lets play again.  How old are you? (If you don't want to play anymore enter -1999.)");

        }
        //can only get here when loop ends: age == -1999
        System.out.println("\n Bye now! Come again!");


    }

}
