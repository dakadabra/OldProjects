package Programs;

//
// This program uses a method to calculate the square root of a number.
public class SquareIntegers {

		public static void main (String args[])
		{
			int result;   // store result of call to method square

			// loop 10 times
			for ( int counter = 1; counter <= 10; counter++ ) {
				result = square( counter );  // method call

				// print the result of one call to the method
				System.out.println ("The square of " + counter + " is " +
					result );

			} // end for


		} // end method main()



// square method declaration

		public static int square( int y )
		{
			return y * y;  // return square of y


		} // end method square

	} // end class SquareIntegers
