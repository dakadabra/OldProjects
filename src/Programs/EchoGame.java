package Programs;
import java.util.Scanner;



public class EchoGame {

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

  }
}
