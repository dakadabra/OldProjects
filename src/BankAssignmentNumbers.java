import java.util.Scanner;

/**
 * 
 *  Simple Banking System: The computer starts out with an amount in the
 *  bank, and then asks the user to withdraw or deposit. The user than chooses
 *  the amount to withdraw or deposit, and then they can restart. The program
 *  keeps going until the user wants to finish.
 *
 * @author David Khazzam
 * @version 2 June 2014
 */

public class BankAssignmentNumbers {
	
	public static void main (String[] args) {
Scanner console = new Scanner (System.in);

//declare starting balance
int balance = 300;
int choice1 = 0;
int withdraw1 = 0;
int wchoice = 0;
int wError = 0;
int deposit1 = 0;
int dchoice = 0;
int dError = 0;



//While user wants to continue, keep going
while ((wchoice == 0) && (dchoice == 0)) {
	
	wError = 0;
	dError = 0;

//Declare starting balance to user
System.out.println("You have " + balance + " dollars in your bank account.");

	
System.out.println("\nWould you like to WITHDRAW money or DEPOSIT money?"
+ "\nIf you would like to withdraw, enter 0."
+ " If you would like to deposit, enter 1.");

choice1 = console.nextInt();


//If they chose withdraw
if (choice1 == 0) {

while (wError != 4) {	
System.out.println("How much do you want to withdraw? (Maximum 500$)");
withdraw1 = console.nextInt ();

if (withdraw1 > 500) {
System.out.println("Sorry, the maximum withdrawal amount is 500$.");
}

else if (withdraw1 < 0) {
System.out.println("Sorry, the amount entered is not valid.");
}

else if ((withdraw1 <= 500) && (withdraw1 >= 0) && (withdraw1 > balance)) {
System.out.println("Sorry, the number entered exceeds the balance.");
}
	
else if ((withdraw1 <= 500) && (withdraw1 >= 0) && (withdraw1 <= balance)) {
wError = 4;
System.out.println("You are withdrawing " + withdraw1 + "$.");	
}

}



//Changes balance accordingly
balance -= withdraw1;

System.out.println("You now have " + balance + "$ left in you account.");


//Asks if user has finished
 System.out.println("Have you finished banking? If you have, enter 1, if you have not, enter 0.");
 wchoice = console.nextInt();
}





//If they chose deposit
if (choice1 == 1) {
	
while (dError != 4) {	
System.out.println("How much do you want do deposit?");
deposit1 = console.nextInt ();

if (deposit1 < 0) {
System.out.println("Sorry, the amount entered is not valid.");
}
	
else if (deposit1 >= 0) {
dError = 4;
System.out.println("You are depositing " + deposit1 + "$.");	
}

}

//Changes balance accordingly
balance += deposit1;

System.out.println("You now have " + balance + "$ in you account.");


//Asks if user has finished
System.out.println("Have you finished banking? If you have, enter 1, if you have not, enter 0.");
	 
	 dchoice = console.nextInt();
}
}




//End Message
System.out.println("\nThank you for banking with us. Please come again soon.");

	}
}