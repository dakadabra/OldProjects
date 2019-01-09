package Programs;
import java.util.Scanner;


/**
 * Various examples of loops.
 *
 * The follow code snippets are solutions to the following problems:
 *
 * 1) Echo each line the user types until they enter nothing.
 * 2) Print out all the words to the song "99 Bottles of Beer"
 * 3) Print all the powers of 2 that are less than 5000.
 * 4) Print backwards all the positive even integers starting with 100.
 *    (That is: 100, 98, 96, 94.... 2.)
 * 5) Print the numbers 1 through 10 on one line, with a comma after each
 *    except the last one.  So, the list should be look exactly like:
 *    1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
 *
 * @author Zach Tomaszewski
 * @version 06 Oct 2009
 */
public class LoopExample {

  public static void main(String[] args) {


	  Scanner keybd = new Scanner(System.in);

    //Uncomment each simple example below to run it.

 //=======================================================================
 // =============================LOOP EXAMPLE 1===========================
 //=======================================================================
 //=======================================================================
    //
    // 1) An echo game: take whatever the user types and print it back to them.
    //    Keep doing this until they enter nothing.
    //
    // This solution initializes input in a way to ensure the loop always
    // starts the first time.
    //
  /*  String input = "something";   //so that we enter the loop the first time
    while (!input.equals(""))  {  //or use length or isEmpty methods
      System.out.print("Enter something: ");
      input = keybd.nextLine();
      System.out.println(input);
    }
   */



 //=======================================================================
 // =============================LOOP EXAMPLE 2===========================
 //=======================================================================
 //=======================================================================
    //
    // 1b) Sometimes it's simpler just to use a boolean variable to control
    // your while loop
    //
/*    boolean keepAsking = true;
    while (keepAsking)  {
      System.out.print("Enter something: ");
      String input = keybd.nextLine();
      if (input.length() == 0) {
        keepAsking = false;
      }else {
        System.out.println(input);
      }
    }
*/    //This version stops printing as soon as the user enters nothing.
    //Note a different way to recognizing an empty String
    //(.length() rather than .equals)





 //=======================================================================
 // =============================LOOP EXAMPLE 3===========================
 //=======================================================================
 //=======================================================================
    //
    // 1c) This way works too, but requires duplicating most of the
    // while's body before the while loop.  This is not a problem
    // with only a couple lines, but it is bad practice if you start
    // duplicating more than that.
    //
/*    System.out.print("Enter something: ");
    String input = keybd.nextLine();
    while (input.length() > 0) {
      System.out.println("You said: " + input);
      System.out.print("Enter something: ");
      input = keybd.nextLine();
      System.out.println();
    }

*/
    //
    // Other options: A do-while loop would also work well for this problem.
    //

 //=======================================================================
 // =============================LOOP EXAMPLE 4===========================
 //=======================================================================
 //=======================================================================


    //
    // 2) Print out all the words to the song "99 Bottles of Beer"
    //
/*    for (int x = 99; x > 0; x--) {
      System.out.println(x + " bottles of beer on the wall, ");
      System.out.println(x + " bottles of beer.");
      System.out.println("Take one down, pass it around:");
      System.out.println((x - 1) + " bottles of beer on the wall.");
      System.out.println();
    }
    // Note how we have to use (x - 1), rather than x--, to avoid decrementing
    // x twice each time through the loop.

*/

/*
 //=======================================================================
 // =============================LOOP EXAMPLE 5===========================
 //=======================================================================
 //=======================================================================

    //
    // 2b) Using a while loop and the prefix decrement operator
    // to good effect.
    //
    int beers = 99;
    while (beers > 0) {
      System.out.println(beers + " bottles of beer on the wall");
      System.out.println(beers + " bottles of beer");
      System.out.println("Take one down, pass it around");
      System.out.println(--beers + " bottles of beer on the wall.");
      System.out.println();
    }

*/


/*
 //=======================================================================
 // =============================LOOP EXAMPLE 6===========================
 //=======================================================================
 //=======================================================================
    //
    // 3) Print all the powers of 2 that are less than 5000.
    // So, we want: 2, 4, 8, 16, 32, 64, ... 4096.
    //
    for (int exp = 1; Math.pow(2, exp) < 5000; exp++) {
      System.out.println("2^" + exp + " = " + (int) Math.pow(2, exp));
    }
*/

	/*

 //=======================================================================
 // =============================LOOP EXAMPLE 7===========================
 //=======================================================================
 //=======================================================================


    //
    // 3b) Here, "power" is the current power of 2.  Each time through the
    // loop, it gets * 2, to give the next power.  The exponent is just
    // tracked for output purposes.
    //
    int power = 2;
    int exponent = 1;  //optional; we really only need power
    while (power < 5000) {
      System.out.println("2^" + exponent + " = " + power);
      power *= 2;
      exponent++;
    }
*/
/*
 //=======================================================================
 // =============================LOOP EXAMPLE 8===========================
 //=======================================================================
 //=======================================================================


    //
    // 3c) If don't care to track the exponent, 3b could be done instead
    //     as a simple for loop.  This is an example of how a loop counter
    //     can be altered in other ways than a simple increment or decrement.
    //
    for (int power = 2; power < 5000; power *= 2) {
      System.out.println(power);
    }
*/

/*

 //=======================================================================
 // =============================LOOP EXAMPLE 9===========================
 //=======================================================================
 //=======================================================================


    //
    // 3d) In fact, we could even do the full version of 3b as a for loop.
    // However, this is quite complex and so the first form, or some mix,
    // would probably be clearer.
    //
    for (int power = 2, exponent = 1; power < 5000; power *= 2, exponent++) {
      System.out.println("2^" + exponent + " = " + power);
    }

*/

/*
 //=======================================================================
 // =============================LOOP EXAMPLE 10===========================
 //=======================================================================
 //=======================================================================

    //
    // 4) Print backwards all the positive even integers starting with 100.
    // (That is: 100, 98, 96, 94.... 2.)
    //
    for (int i = 100; i > 0; i--) {
      //go backwards through all positive ints from 100 through 1
      //printing only the even ones
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
*/
/*
 //=======================================================================
 // =============================LOOP EXAMPLE 11===========================
 //=======================================================================
 //=======================================================================

    //
    //4b) Or, we could just hit only the even numbers using the for loop.
    //    Note, too, a different ending condition than 4a.
    //
    for (int i = 100; i >= 2; i -= 2) {
      System.out.println(i);
    }
*/

  //=======================================================================
  // =============================LOOP EXAMPLE 12 =========================
  //=======================================================================
  //=======================================================================

/*
    //
    // 5) Print the numbers 1 through 10 on one line, with a comma after
    // each except the last one.  So, the list should be look exactly like:
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
    //
    int i; //declare i out here so we can use it after the loop
    for (i = 1; i < 10; i++) {
      System.out.print(i + ", ");
    }
    System.out.println(i + ".");
*/

/*
   //=======================================================================
  // =============================LOOP EXAMPLE 13 =========================
  //=======================================================================
  //=======================================================================

    //
    // 5b) Or, if we wanted to keep i within the loop...
    //
    for (int i = 1; i <= 10; i++) {
      System.out.print(i);
      if (i < 10) {
        System.out.print(", ");
      }
    }
    System.out.println(".");
*/


  }
}
