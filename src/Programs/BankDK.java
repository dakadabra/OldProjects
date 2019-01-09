package Programs;
import java.util.Scanner;

/*1. Change the code so that the bank can have 10 customers.
2.  The password is 6 characters long and has at least one of the following
	(capital letters, small letters, numbers and special characters
	which are ~!@#$%\^&*()\-_=+\|\[{\]};:'",<.>/?
3. Add a short comments to each logical code block.  e.g if statement
4. Comment each of the try-catch blocks.
5.  Change the program to be Bank + your initials.  e.g mine would be BankEB.java
6. Write the list of requirements of the program.
   a) Each customer has 2 accounts,
   b) The bank gives each customer 100 dollars when they open an account
   c) The customer needs to be able to deposit, withdraw, transfer and check their account balances.
   d) Passwords have to be 6 symbols long and must contain a capital letter, a minuscule letter, a number and a special character.
*/

public class BankDK {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		//Console screen = System.console();

		int MaxNumCustomers = 10;
		int NumAccountsPerCustomer = 2;
		int currentNumCustomers = 0;

		// indexed by customer, then account
		float[][] balance = new float[MaxNumCustomers][NumAccountsPerCustomer];
		String[] names = new String[MaxNumCustomers];
		String[] passwords = new String[MaxNumCustomers];
		String name = "Empty";
		//Always do
		while (true)
		{
			//asks user if they would like to bank
			String answer = new String();
			System.out.println("Welcome to BankDK!");
			System.out.println("Would you like to do some banking?  (y)es or (n)o?");
			//Checks text entered
			try {
				  answer = console.nextLine();
			}
			//If text entered is not what is expected (Does not work)
			catch(Exception e)
			{
				System.out.println("Invalid response.  Goodbye");
				return;
			}
			//text entered not "y" or "Y" stops program
			if (!answer.equalsIgnoreCase("y"))
			{
				System.out.println("Goodbye!");
				break;
			}

			System.out.println("Who are you?");

			//Checks text entered
			try {
				  answer = console.nextLine();
			}
			//If text entered is not expected
			catch(Exception e)
			{
				System.out.println("Invalid response.  Goodbye");
				return;
			}

			// look for the customer
			int customerIndex = -1;
			for (int i=0; i<MaxNumCustomers; i++)
			{
				//If the name already has an account, continues
				if (answer.equalsIgnoreCase(names[i]))
				{
					// found you!
					customerIndex = i;
					break;
				}
			}
			//If the name does not already have an account
			if (customerIndex == -1)
			{
				System.out.println("Could not find you in our database.  Checking if we can open you an new account...");
				// didn't find you - check if we can add an account
				if (currentNumCustomers >= MaxNumCustomers)
				{
					System.out.println("We have too many customers already.  Have a nice day");
					continue;
				}

				customerIndex = currentNumCustomers;
				currentNumCustomers++;
				name = answer;

				System.out.print("Congratulations!  We opened ");
				System.out.print(NumAccountsPerCustomer);
				System.out.println(" new accounts for you with $100 in each!");
				System.out.println("\nNow you need to pick a PIN - something 6 characters long,"
						+ "\nwith at least one capital letter,"
						+ "\none minuscule letter,"
						+ "\none number"
						+ "\nand one special character."
						+ "\n\nPlease enter a PIN now");
				System.out.println();
				// can only use readPassword if running from the command line.  Since I want to try this in the IDE...
				//char password[] = screen.readPassword("Enter your secret password: ");
				//Checks text entered
				try {
					  answer = console.nextLine();
				}
				//If entered text is not expected all their information is deleted
				catch(Exception e)
				{
					System.out.println("Invalid response.  Deleting accounts.  Goodbye");
					currentNumCustomers--;
					continue;
				}
				//If password length is six symbols long
				if (answer.length() == 6) {

					if (answer.matches(".*[A-Z].*")) {

						if (answer.matches(".*[a-z].*")) {

							if (answer.matches(".*[0-9].*")) {

								if (answer.matches(".*[\\~\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\_\\=\\+\\|\\[\\{\\]\\}\\;\\:\\'\\,\\<\\.\\>\\/\\?].*")){
								}

								else{
									System.out.println("Invalid response (No symbols). Deleting accounts.  Goodbye");
									currentNumCustomers--;
									customerIndex = -1;
									continue;
								}
							}

							else{
								System.out.println("Invalid response (No numbers). Deleting accounts.  Goodbye");
								currentNumCustomers--;
								customerIndex = -1;
								continue;
							}
						}

						else{
							System.out.println("Invalid response (No minuscules).  Deleting accounts.  Goodbye");

		/*This commented part was a test, ignore it.
		names.[customerIndex];
		passwords[customerIndex]--;
		balance[customerIndex][NumAccountsPerCustomer]--;*/

							currentNumCustomers--;
							customerIndex = -1;
							continue;
						}
					}

					else{
						System.out.println("Invalid response (No caps).  Deleting accounts.  Goodbye");
						currentNumCustomers--;
						customerIndex = -1;
						continue;
					}
				}

				else{
					System.out.println("Invalid response (No length).  Deleting accounts.  Goodbye");
					currentNumCustomers--;
					customerIndex = -1;
					continue;
				}

				//If entered password fits the requirements, it is their new password
				passwords[customerIndex] = answer;

				names[customerIndex] = answer;
				//Gives each of the customer's accounts 100$
				for (int i=0; i<NumAccountsPerCustomer; i++)
				{
					balance[customerIndex][i] = 100;
				}
			}
			//If they already have an account
			else
			{
				System.out.println("Please enter a PIN now");
				//Checks if entered password fits
				try {
					  answer = console.nextLine();
				}
				catch(Exception e)
				{
					System.out.println("Invalid response.  Goodbye");
					continue;
				}
				if (!answer.equals(passwords[customerIndex]))
				{
					System.out.println("Invalid response.  Goodbye");
					continue;
				}
			}
			System.out.print("Welcome ");
			System.out.println(name + ".");
			System.out.println();
			boolean done = false;
			//Only goes if done is false
			while (!done)
			{
				System.out.println("Would you like to (1) deposit, (2) withdraw, (3) transfer, (4) check balances, (5) finish");
				int numAnswer = 0;
				//Checks text entered
				try {
					numAnswer = console.nextInt();
				}
				//If text entered is not expected, ends program
				catch(Exception e)
				{
					System.out.println("Invalid response.  Goodbye");
					break;
				}
				//Checks values in switch statement for the one corresponding to the number entered
				switch (numAnswer)
				{
				//If they want to deposit
				case(1):
					System.out.println("Which account do you want to deposit to?");
					//Shows accounts and their balances
					for (int i=0; i<NumAccountsPerCustomer; i++)
					{
						System.out.print("Account (");
						System.out.print(i+1);
						System.out.print(") with balance $");
						System.out.println(balance[customerIndex][i]);
					}
					int accountNum = 0;
					//Checks text entered
					try {
						accountNum = console.nextInt();
					}
					//If text entered is not expected, ends program
					catch(Exception e)
					{
						System.out.println("Invalid response.");
						break;
					}
					//If they chose an account that is not there
					if (accountNum < 1 || accountNum > NumAccountsPerCustomer)
					{
						System.out.println("Invalid account number.");
						break;
					}
					System.out.println("How much do you want to deposit?");
					int depositNum = 0;
					//If text entered is valid, changes amount deposited
					try {
						depositNum = console.nextInt();
					}
					//If text entered is not expected, ends program
					catch(Exception e)
					{
						System.out.println("Invalid response.");
						break;
					}
					System.out.println("OK.  Done.");
					//Balance changed according to amount deposited
					balance[customerIndex][accountNum-1]+=depositNum;
					break;

				//If they chose to withdraw
				case(2):
					System.out.println("Which account do you want to withdraw from?");
				//Shows accounts and their balances
				for (int i=0; i<NumAccountsPerCustomer; i++)
					{
						System.out.print("Account (");
						System.out.print(i+1);
						System.out.print(") with balance $");
						System.out.println(balance[customerIndex][i]);
					}
					accountNum = 0;
					//If text entered is valid, chose from which account to deposit
					try {
						accountNum = console.nextInt();
					}
					//If text entered is not expected, ends program
					catch(Exception e)
					{
						System.out.println("Invalid response.");
						break;
					}
					//IF they chose and account that is not there, the program ends
					if (accountNum < 1 || accountNum > NumAccountsPerCustomer)
					{
						System.out.println("Invalid account number.");
						break;
					}
					System.out.println("How much do you want to withdraw?");
					int withdrawNum = 0;
					//If amount entered is valid, they withdraw that amount
					try {
						withdrawNum = console.nextInt();
					}
					//If text entered is not expected, ends program
					catch(Exception e)
					{
						System.out.println("Invalid response.");
						break;
					}
					//If the account does not have enough money
					if (balance[customerIndex][accountNum-1]<withdrawNum)
					{
						System.out.println("Not enough money in that account");
					}
					//Withdraw the amount entered
					else
					{
						System.out.println("OK.  Done.");
						balance[customerIndex][accountNum-1]-=withdrawNum;
					}
					break;

				case(3):
					System.out.println("Which account do you want to transfer from?");
					//Shows accounts and their balances
					for (int i=0; i<NumAccountsPerCustomer; i++)
					{
						System.out.print("Account (");
						System.out.print(i+1);
						System.out.print(") with balance $");
						System.out.println(balance[customerIndex][i]);
					}
					int accountNum1 = 0;
					//Checks if account entered is valid
					try {
						accountNum1 = console.nextInt();
					}
					//If text entered is not expected, ends program
					catch(Exception e)
					{
						System.out.println("Invalid response.");
						break;
					}
					//If they chose an account that is not there
					if (accountNum1 < 1 || accountNum1 > NumAccountsPerCustomer)
					{
						System.out.println("Invalid account number.");
						break;
					}
					int accountNum2 = 0;
					System.out.println("Which account do you want to transfer to?");
					//Checks if account entered is valid
					try {
						accountNum2 = console.nextInt();
					}
					//If text entered is not expected, ends program
					catch(Exception e)
					{
						System.out.println("Invalid response.");
						break;
					}
					//If they chose an account that is not there
					if (accountNum2 < 1 || accountNum2 > NumAccountsPerCustomer || accountNum2 == accountNum1)
					{
						System.out.println("Invalid account number.");
						break;
					}
					System.out.println("How much do you want to transfer?");
					int transferNum = 0;
					//Checks if amount entered is valid
					try {
						transferNum = console.nextInt();
					}
					//If text entered is not expected, ends program
					catch(Exception e)
					{
						System.out.println("Invalid response.");
						break;
					}
					//If they try to transfer too much money
					if (balance[customerIndex][accountNum1-1]<transferNum)
					{
						System.out.println("Not enough money in that account");
					}
					//If all is well, transfers money
					else
					{
						System.out.println("OK.  Done.");
						balance[customerIndex][accountNum1-1]-=transferNum;
						balance[customerIndex][accountNum2-1]+=transferNum;
					}
					break;

				case(4):
					//Shows accounts and their balances
					System.out.println("Account balance info:");
					for (int i=0; i<NumAccountsPerCustomer; i++)
					{
						System.out.print("Account (");
						System.out.print(i+1);
						System.out.print(") has balance $");
						System.out.println(balance[customerIndex][i]);
					}
					break;

				default:
					done = true;
					// eat the leftover \n from the nextInt
					console.nextLine();
					break;
				}
			}
		}
	}

}
