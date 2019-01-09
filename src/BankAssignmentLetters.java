import java.util.Scanner;

public class BankAssignmentLetters {
	
	public static void main (String[] args) {
Scanner console = new Scanner (System.in);

int balance = 0;
String choice1 = "A";
int withdraw1 = 0;
String choice2 = "No";
int deposit1 = 0;
String choice3 = "No";


System.out.println("You have " + balance + " dollars in your bank account.");

while ((choice2 == "No") &&  (choice3 == "No")) {
System.out.println("Would you like to WITHDRAW money or DEPOSIT money?");

choice1 = console.nextLine();

System.out.println("You are going to " + choice1 + " money.");

if (choice1 == "WITHDRAW") 
	System.out.println("How much do you want do withdraw?");

withdraw1 = console.nextInt ();

System.out.println("You want to withdraw" + withdraw1);

//User might not be fast enough
 System.out.println("You have" + (balance - withdraw1) + "left in you account.");
	
 System.out.println("Are you done? If you are, write Yes, if you aren't, write No.");

 choice2 = console.nextLine();


if (choice1 == "DEPOSIT")
	
	System.out.println("How much do you want do deposit?");

	deposit1 = console.nextInt ();

	System.out.println("You want to deposit" + deposit1);

	//User might not be fast enough
	 System.out.println("You now have" + (balance + deposit1) + " in you account.");
		
	 System.out.println("Are you done? If you are, write Yes, if you aren't, write No.");

	 choice3 = console.nextLine();
}




	
	System.out.println("\n Bye now! Come again!");

	}
}



/* Verification:
 
String verification = "No";


 while (verification == "No") 
	{ 
System.out.println("\nWould you like to WITHDRAW money or DEPOSIT money?"
+ "\nIf you would like to withdraw, insert 0."
+ " If you would like to deposit, insert 1.");

choice1 = console.nextInt();


  if (choice1 == 0)
//Asks user if they are sure they want to withdraw money
System.out.println("Are you sure you want to withdraw money?"
		+ "\nIf yes, inset 1. If not, insert 0");

if (choice1 == 1)
//Asks user if they are sure they want to deposit money
System.out.println("Are you sure you want to deposit money?"
		+ "\nIf yes, inset 1. If not, insert 0");

if ((choice1 != 0) && (choice1 != 1))
System.out.println("Please insert either 0 or 1.");

//Next line is their choice
verification = console.nextLine(); 

} 
 
 */



