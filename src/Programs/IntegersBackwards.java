package Programs;
import java.util.Scanner;



public class IntegersBackwards {

  public static void main(String[] args) {


    //Uncomment each simple example below to run it.

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

  }
}
