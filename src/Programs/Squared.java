package Programs;
public class Squared {


	public static void main(String[] args) {


	      int number = 0;    // Loop control variable
	      int maxValue = 100;  // Maximum value to display
	      int number2 = 3;


	         System.out.println("Just to see the numbers change in debug mode, lets change the values. ");

	         number = 12;
	         number2 = 6;
	      System.out.println("I will display a table of " +
	                         "numbers and their squares.");

	      // Display the table.
	      System.out.println("Number   Number Squared");
	      System.out.println("-----------------------");
	      for (number = 1; number <= maxValue; number++)
	      {
	         System.out.println(number + "\t\t" +   number * number);


	      }

	}
}
