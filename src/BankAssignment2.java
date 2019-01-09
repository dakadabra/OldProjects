import java.util.Scanner;

/**
 * 
 *  Simple Banking System: The computer starts out with an amount in the
 *  bank, and then asks the user to withdraw or deposit. The user than chooses
 *  the amount to withdraw or deposit, and then they can restart. The program
 *  keeps going until the user wants to finish.
 *
 * @author David Khazzam
 * @version 31 March 2014
 */

/*
 * The bank still has one customer but the customer can have at least
 * two accounts. In addition to being able to withdraw and deposit money
 * the customer can also transfer funds from one account to another.
 * The customer can only have a Line of Credit account.
*/



public class BankAssignment2 {
	
	public static void main (String[] args) {
Scanner console = new Scanner (System.in);

//declare starting balance
int savingsBalance = 300;
int chequingBalance = 500;
int creditBalance = 0;

int accountChoice = 0;
int choice1 = 0;
int EndChoice = 0;
int finishError = 0;

int withdrawAmount = 0;
int wError = 0;

int depositAmount = 0;
int dError = 0;

int tAccount = 0;
int transferAmount = 0;
int tError = 0;


System.out.println("Hello! Would you like to begin banking?");

//While user wants to continue, keep going
while (EndChoice == 0) {


	
	
System.out.println("You currently have:" + "\n" + savingsBalance + "$ in your SAVINGS account,"
		+ "\n" + chequingBalance + "$ in your CHEQUING account,"
		+ "\nand " + creditBalance + "$ in your LINE OF CREDIT account. (The limit of your LINE OF CREDIT is 5000$)"
		+ "\n\nWhich account do you want to use?"
		+ "\nIf you want to use your SAVINGS account, enter 1."
		+ "\nIf you want to use your CHEQUING account, enter 2."
		+ "\nIf you want to use your LINE OF CREDIT account, enter 3."
		+ "\nThen enter ENTER.");

accountChoice = console.nextInt();



if ((accountChoice < 1) || (accountChoice > 3)) {
	System.out.println("Please either enter 1, 2 or 3.\n");
	}



if (accountChoice == 1) {
	//Declare starting balance to user
	System.out.println("You have " + savingsBalance + "$ in your SAVINGS account.");
	
		
	System.out.println("\nWould you like to WITHDRAW, DEPOSIT or TRANSFER money?"
	+ "\nIf you would like to WITHDRAW, enter 0."
	+ "\nIf you would like to DEPOSIT, enter 1."
	+ "\nIf you would like to TRANSFER, enter 2"
	+ "\nThen enter ENTER.");
	
	choice1 = console.nextInt();
	
	if ((choice1 < 0) || (choice1 > 2)) {
	System.out.println("Please either enter 0, 1 or 2.\n");
	}
	
	
	if ((choice1 == 0) && (savingsBalance <= 0)){
	System.out.println("Sorry, but your SAVINGS account does not have enough money for you to be able to WITHDRAW.");
	}
	
	//If they chose withdraw
	if ((choice1 == 0) && (savingsBalance > 0)) {
	
		while (wError != 4) {	
		System.out.println("How much do you want to WITHDRAW? (Maximum 500$)"
		+ "\nType in the amount you want to WITHDRAW."
		+ "\nThen enter ENTER.");
		withdrawAmount = console.nextInt ();
		
		if (withdrawAmount > 500) {
		System.out.println("Sorry, the maximum withdrawal amount is 500$.");
		}
		
		if (withdrawAmount < 0) {
		System.out.println("Sorry, the amount entered is not valid because it is below 0.");
		}
		
		if ((withdrawAmount <= 500) && (withdrawAmount >= 0) && (withdrawAmount > savingsBalance)) {
		System.out.println("Sorry, the number entered exceeds the balance.");
		}
			
		if ((withdrawAmount <= 500) && (withdrawAmount >= 0) && (withdrawAmount <= savingsBalance)) {
		wError = 4;
		System.out.println("You are withdrawing " + withdrawAmount + "$.");
		
		//Changes balance accordingly
		savingsBalance -= withdrawAmount;
	}
	
	}
	
	
	
	System.out.println("You now have " + (savingsBalance) + "$ left in your account.");
	
	while (finishError != 4) {
		//Asks if user has finished
		finished();
		EndChoice = console.nextInt();
		
		if ((EndChoice < 0) || (EndChoice > 1)) {
			System.out.println("Please either enter 0 or 1.\n");
		}
		
		if ((EndChoice == 0) || (EndChoice == 1)) {
		finishError = 4;
		}
		
	}
	
	}
	
	
	
	
	//If they chose deposit
	if (choice1 == 1) {
		
		while (dError != 4) {	
		System.out.println("How much do you want to DEPOSIT?"
		+ "\nType in the amount you want to DEPOSIT."
		+ "\nThen enter ENTER.");
		depositAmount = console.nextInt ();
		
		if (depositAmount < 0) {
		System.out.println("Sorry, the amount entered is not valid.");
		}
			
		if (depositAmount >= 0) {
		dError = 4;
		System.out.println("You are depositing " + depositAmount + "$.");
		
		//Changes balance accordingly
		savingsBalance = savingsBalance + depositAmount;	
		}
	
	}
	
	
	System.out.println("You now have " + (savingsBalance) + "$ in you account.");
	
	while (finishError != 4) {
		//Asks if user has finished
		finished();
		EndChoice = console.nextInt();
		
		if ((EndChoice < 0) || (EndChoice > 1)) {
			System.out.println("Please either enter 0 or 1.\n");
		}
		
		if ((EndChoice == 0) || (EndChoice == 1)) {
		finishError = 4;
		}
		
	}

	}
	
	
	if ((choice1 == 2) && (savingsBalance <= 0)){
		System.out.println("Sorry, but your SAVINGS account does not have enough money for you to be able to TRANSFER.");
		}
	
	
	if ((choice1 == 2) && (savingsBalance > 0)) {
		
		while (tError != 4) {
		System.out.println("To which account would you like to TRANSFER?"
		+ "\nIf you would like to TRANSFER to your CHEQUING account, press 1."
		+ "\nIf you would like to TRANSFER to your LINE OF CREDIT account, press 2."
		+ "\nThen enter ENTER.");
		
		tAccount = console.nextInt();
		
		if (tAccount == 1) {
			System.out.println("How much do you want to TRANSFER?"
			+ "\nType in the amount you want to TRANSFER."
			+ "\nThen enter ENTER.");
			transferAmount = console.nextInt();
			tError = 4;
			chequingBalance += transferAmount;
			savingsBalance -= transferAmount;
			
			System.out.println("Your SAVINGS account now has " + savingsBalance + "$ and your CHEQUING account"
				+ " now has " + chequingBalance + "$.");
		}
		
		if (tAccount == 2) {
			System.out.println("How much do you want to TRANSFER?"
				+ "\nType in the amount you want to TRANSFER."
				+ "\nThen enter ENTER.");
			transferAmount = console.nextInt();
			tError = 4;
			creditBalance += transferAmount;
			savingsBalance -= transferAmount;
			
			System.out.println("Your SAVINGS account now has " + savingsBalance + "$ and your LINE OF CREDIT account"
				+ " now has " + creditBalance + "$.");
		}
	}
		
		while (finishError != 4) {
			//Asks if user has finished
			finished();
			EndChoice = console.nextInt();
			
			if ((EndChoice < 0) || (EndChoice > 1)) {
				System.out.println("Please either enter 0 or 1.\n");
			}
			
			if ((EndChoice == 0) || (EndChoice == 1)) {
			finishError = 4;
			}
			
		}
}

}
	
	
	
	
	
	
	
	
	
	
if (accountChoice == 2) {
	//Declare starting balance to user
	System.out.println("You have " + chequingBalance + "$ in your CHEQUING account.");
	
		
	System.out.println("\nWould you like to WITHDRAW, DEPOSIT or TRANSFER money?"
		+ "\nIf you would like to WITHDRAW, enter 0."
		+ "\nIf you would like to DEPOSIT, enter 1."
		+ "\nIf you would like to TRANSFER, enter 2"
		+ "\nThen enter ENTER.");
	
	choice1 = console.nextInt();
	
	if ((choice1 < 0) || (choice1 > 2)) {
	System.out.println("Please either enter 0 or 1.\n"
		+ "\nThen enter ENTER.");
	}
	
	
	if ((choice1 == 0) && (chequingBalance <= 0)){
		System.out.println("Sorry, but your CHEQUING account does not have enough money for you to be able to WITHDRAW.");
		}
		
	//If they chose withdraw
	if ((choice1 == 0) && (chequingBalance > 0)) {
	
		while (wError != 4) {	
			System.out.println("How much do you want to WITHDRAW? (Maximum 500$)"
				+ "\nType in the amount you want to WITHDRAW."
				+ "\nThen enter ENTER.");
		withdrawAmount = console.nextInt ();
		
		if (withdrawAmount > 500) {
		System.out.println("Sorry, the maximum withdrawal amount is 500$.");
		}
		
		if (withdrawAmount < 0) {
		System.out.println("Sorry, the amount entered is not valid because it is below 0.");
		}
		
		if ((withdrawAmount <= 500) && (withdrawAmount >= 0) && (withdrawAmount > chequingBalance)) {
		System.out.println("Sorry, the number entered exceeds the balance.");
		}
			
		if ((withdrawAmount <= 500) && (withdrawAmount >= 0) && (withdrawAmount <= chequingBalance)) {
		wError = 4;
		System.out.println("You are withdrawing " + withdrawAmount + "$.");
		
		//Changes balance accordingly
		chequingBalance -= withdrawAmount;
		}
	
	}
	
	
	
	System.out.println("You now have " + (chequingBalance) + "$ left in your account.");
	
	
	while (finishError != 4) {
		//Asks if user has finished
		finished();
		EndChoice = console.nextInt();
		
		if ((EndChoice < 0) || (EndChoice > 1)) {
			System.out.println("Please either enter 0 or 1.\n");
		}
		
		if ((EndChoice == 0) || (EndChoice == 1)) {
		finishError = 4;
		}
		
	}
	}
	
	
	
	
	
	//If they chose deposit
	if (choice1 == 1) {
		
		while (dError != 4) {	
			System.out.println("How much do you want to DEPOSIT?"
				+ "\nType in the amount you want to DEPOSIT."
				+ "\nThen enter ENTER.");
		depositAmount = console.nextInt ();
		
		if (depositAmount < 0) {
		System.out.println("Sorry, the amount entered is not valid.");
		}
			
		if (depositAmount >= 0) {
		dError = 4;
		System.out.println("You are depositing " + depositAmount + "$.");	
	
		//Changes balance accordingly
		chequingBalance += depositAmount;
		
		}
	
	}
		

	System.out.println("You now have " + (chequingBalance) + "$ in you account.");
	
	
	while (finishError != 4) {
		//Asks if user has finished
		finished();
		EndChoice = console.nextInt();
		
		if ((EndChoice < 0) || (EndChoice > 1)) {
			System.out.println("Please either enter 0 or 1.\n");
		}
		
		if ((EndChoice == 0) || (EndChoice == 1)) {
		finishError = 4;
		}
		
	}
		
	
	}
	
	
	
	if ((choice1 == 2) && (chequingBalance <= 0)){
		System.out.println("Sorry, but your CHEQUING account does not have enough money for you to be able to TRANSFER.");
		}
	
	
	if ((choice1 == 2) && (chequingBalance > 0)) {
		
		while (tError != 4) {
		System.out.println("To which account would you like to TRANSFER?"
			+ "\nIf you would like to TRANSFER to your SAVINGS account, press 1."
			+ "\nIf you would like to TRANSFER to your LINE OF CREDIT account, press 2."
			+ "\nThen enter ENTER.");
		
		tAccount = console.nextInt();
		
		if (tAccount == 1) {
			System.out.println("How much do you want to TRANSFER?"
				+ "\nType in the amount you want to TRANSFER."
				+ "\nThen enter ENTER.");
			transferAmount = console.nextInt();
			tError = 4;
			savingsBalance += transferAmount;
			chequingBalance -= transferAmount;
			
			System.out.println("Your CHEQUING account now has " + chequingBalance + "$ and your SAVINGS account"
				+ " now has " + savingsBalance + "$.");
		}
		
		if (tAccount == 2) {
			System.out.println("How much do you want to TRANSFER?"
				+ "\nType in the amount you want to TRANSFER."
				+ "\nThen enter ENTER.");
			transferAmount = console.nextInt();
			tError = 4;
			creditBalance += transferAmount;
			chequingBalance -= transferAmount;
			
			System.out.println("Your CHEQUING account now has " + chequingBalance + "$ and your LINE OF CREDIT account"
				+ " now has " + creditBalance + "$.");
		}
	}
		
		while (finishError != 4) {
			//Asks if user has finished
			finished();
			EndChoice = console.nextInt();
			
			if ((EndChoice < 0) || (EndChoice > 1)) {
				System.out.println("Please either enter 0 or 1.\n");
			}
			
			if ((EndChoice == 0) || (EndChoice == 1)) {
			finishError = 4;
			}
			
		}

}

}









if (accountChoice == 3){

	//Declare starting balance to user
		System.out.println("You have " + creditBalance + "$ in your LINE OF CREDIT account.");
		
			
		System.out.println("\nWould you like to WITHDRAW, DEPOSIT or TRANSFER money?"
		+ "\nIf you would like to WITHDRAW, enter 0."
		+ "\nIf you would like to DEPOSIT, enter 1."
		+ "\nIf you would like to TRANSFER, enter 2"
			+ "\nThen enter ENTER.");
		
		choice1 = console.nextInt();
		
		if ((choice1 < 0) || (choice1 > 2)) {
		System.out.println("Please either enter 0 or 1.\n");
		}
		
		
		
		if ((choice1 == 0) && (creditBalance < -2000)){
			System.out.println("Sorry, but your LINE OF CREDIT account does not have enough money for you to be able to WITHDRAW.");
			}
			
		//If they chose withdraw
		if ((choice1 == 0) && (creditBalance >= -2000)) {
		
			while (wError != 4) {	
				System.out.println("How much do you want to WITHDRAW? (Maximum 500$)"
					+ "\nType in the amount you want to WITHDRAW."
					+ "\nThen enter ENTER.");
			withdrawAmount = console.nextInt ();
			
			if (withdrawAmount > 500) {
			System.out.println("Sorry, the maximum withdrawal amount is 500$.");
			}
			
			if (withdrawAmount < 0) {
			System.out.println("Sorry, the amount entered is not valid because it is below 0.");
			}
			
			if ((withdrawAmount <= 500) && (withdrawAmount >= 0) && (withdrawAmount > creditBalance)) {
			System.out.println("Sorry, the number entered exceeds the balance.");
			}
				
			if ((withdrawAmount <= 500) && (withdrawAmount >= 0) && (withdrawAmount <= creditBalance)) {
			wError = 4;
			System.out.println("You are withdrawing " + withdrawAmount + "$.");
			
			//Changes balance accordingly
			creditBalance -= withdrawAmount;
			}
		
		}
		
		
		
		System.out.println("You now have " + (creditBalance) + "$ left in your account.");
		
		
		while (finishError != 4) {
			//Asks if user has finished
			finished();
			EndChoice = console.nextInt();
			
			if ((EndChoice < 0) || (EndChoice > 1)) {
				System.out.println("Please either enter 0 or 1.\n");
			}
			
			if ((EndChoice == 0) || (EndChoice == 1)) {
			finishError = 4;
			}
			
		}
		}
		
		
		
		
		
		//If they chose deposit
		if (choice1 == 1) {
			
			while (dError != 4) {	
				System.out.println("How much do you want to DEPOSIT?"
					+ "\nType in the amount you want to DEPOSIT."
					+ "\nThen enter ENTER.");
			depositAmount = console.nextInt ();
			
			if (depositAmount < 0) {
			System.out.println("Sorry, the amount entered is not valid.");
			}
				
			if (depositAmount >= 0) {
			dError = 4;
			System.out.println("You are depositing " + depositAmount + "$.");	
		
			//Changes balance accordingly
			creditBalance += depositAmount;
			
			}
		
		}
			

		System.out.println("You now have " + (creditBalance) + "$ in your account.");
		
		
		while (finishError != 4) {
			//Asks if user has finished
			finished();
			EndChoice = console.nextInt();
			
			if ((EndChoice < 0) || (EndChoice > 1)) {
				System.out.println("Please either enter 0 or 1.\n");
			}
			
			if ((EndChoice == 0) || (EndChoice == 1)) {
			finishError = 4;
			}
			
		}
			
		
		}
		
		
		
		
	if ((choice1 == 2) && (creditBalance < -2000)){
	System.out.println("Sorry, but your LINE OF CREDIT account does not have enough money for you to be able to TRANSFER.");
	}
		
		
	if ((choice1 == 2) && (creditBalance >= -2000)) {
			
			while (tError != 4) {
			System.out.println("To which account would you like to TRANFER?"
			+ "\nIf you would like to TRANSFER to your SAVINGS account, press 1."
			+ "\nIf you would like to TRANSFER to your CHEQUING account, press 2."
				+ "\nThen enter ENTER.");
			
			tAccount = console.nextInt();
			
			if (tAccount == 1) {
				System.out.println("How much do you want to TRANSFER?"
					+ "\nType in the amount you want to TRANSFER."
					+ "\nThen enter ENTER.");
				transferAmount = console.nextInt();
				tError = 4;
				savingsBalance += transferAmount;
				creditBalance -= transferAmount;
				
				System.out.println("Your LINE OF CREDIT account now has " + creditBalance + "$ and your SAVINGS account"
					+ " now has " + savingsBalance + "$.");
			}
			
			if (tAccount == 2) {
				System.out.println("How much do you want to TRANSFER?"
					+ "\nType in the amount you want to TRANSFER."
					+ "\nThen enter ENTER.");
				transferAmount = console.nextInt();
				tError = 4;
				chequingBalance += transferAmount;
				creditBalance -= transferAmount;
				
				System.out.println("Your LINE OF CREDIT account now has " + creditBalance + "$ and your CHEQUING account"
					+ " now has " + chequingBalance + "$.");
			}
		}
			
			while (finishError != 4) {
				//Asks if user has finished
				finished();
				EndChoice = console.nextInt();
				
				if ((EndChoice < 0) || (EndChoice > 1)) {
					System.out.println("Please either enter 0 or 1.\n");
				}
				
				if ((EndChoice == 0) || (EndChoice == 1)) {
				finishError = 4;
				}
				
			}

	}

	}









withdrawAmount = 0;
wError = 0;
depositAmount = 0;
dError = 0;
transferAmount = 0;
tError = 0;


}

//End Message
System.out.println("\nThank you for banking with us. Please come again soon.");

}
	
public static void finished(){
	//Asks if user has finished
	System.out.println("\nHave you finished banking? If you have, enter 1, if you have not, enter 0."
		+ "\nThen enter ENTER.");
	
}
	
	
	
	
	}