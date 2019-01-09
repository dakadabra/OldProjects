import java.util.Scanner;

public class Password_code {
	
	public static void main (String[] args) {
		Scanner console = new Scanner (System.in);
		
		String pass = "Empty";
		int notDone = 0;
		
		System.out.println ("Welcome!"
				+ "\nPlease enter a password.");
		
		while (notDone == 0) {
			int points = 5;
			System.out.println ("\nRequirements for a good password:"
					+ "\nBe from 8 to 20 characters long,"
					+ "\nhave at least 1 capital letter,"
					+ "\n1 minuscule letter,"
					+ "\n1 number,"
					+ "\nand 1 special character."
					+ "\n\nThen press Enter.");
			
				  pass = console.nextLine();
	
				  if ((pass.length() >= 8) && (pass.length() <= 20)) {
					  points ++; 
				  }
				  
				  else {
					  points --;
				  }
				  
				  
				  if (pass.matches(".*[A-Z].*")) {
					  points ++;
				  }
				  
				  else {
					  points --;
				  }
				  
						
				  if (pass.matches(".*[a-z].*")) {
					  points ++;
				  }
				
				  else {
				  points --;
				  }
				  
				  
				  if (pass.matches(".*[0-9].*")) {
					  points ++;
				  }
			
				  else {
				  points --;
				  }
				  
				  
				  if (pass.matches(".*[\\~\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\_\\=\\+\\|\\[\\{\\]\\}\\;\\:\\'\\,\\<\\.\\>\\/\\?].*")){
					  points ++;
				  }
				  
				  else {
				  points --;
				  }
				  
				  if (points <= 0) {
					  System.out.println ("That is not a password."
					  		+ "\nPlease enter a new password.");
				  }
				  
				  else if (points <= 2) {
					  System.out.println ("You have a very weak password. (1/5)");
					  notDone = 1;
				  }	  
					 
				  else if (points <= 4) {
					  System.out.println ("You have a weak password. (2/5)");
					  notDone = 1;
				  }
	
				  else if (points <= 6) {
					  System.out.println ("You have a medium strength password. (3/5)");
					  notDone = 1;
				  }
	
				  else if (points <= 8) {
					  System.out.println ("You have a strong password. (4/5)");
					  notDone = 1;
				  }
	
				  else if  (points <= 10) {
					  System.out.println ("You have a very strong password. (5/5)");
					  notDone = 1;
				  
				  }
				  
				  
				  
				  if ((points > 0) && (points < 10) ) {
					  System.out.println("You have: ");
					  
					  if ((pass.length() >= 8) && (pass.length() <= 20)) {
						  System.out.println("\nMade your password 8 to 20 symbols long.");
					  }
					  
					  else {
					  }
					  
					  
					  if (pass.matches(".*[A-Z].*")) {
						  System.out.println("Capital letters.");
					  }
					  
					  else {
					  }
					  
							
					  if (pass.matches(".*[a-z].*")) {
						  System.out.println("Minuscule letters.");
					  }
					
					  else {
					  }
					  
					  
					  if (pass.matches(".*[0-9].*")) {
						  System.out.println("Numbers.");
					  }
				
					  else {
					  }
					  
					  
					  if (pass.matches(".*[\\~\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\_\\=\\+\\|\\[\\{\\]\\}\\;\\:\\'\\,\\<\\.\\>\\/\\?].*")){
						  System.out.println("Symbols.");
					  }
					  
					  else {
					  }
					  
					  System.out.println("\n\nThese are suggestions to make your code better: ");
					  
					  if ((pass.length() >= 8) && (pass.length() <= 20)) {
					  }
					  
					  else {
						  System.out.println("\nMake your password 8 to 20 symbols long.");
					  }
					  
					  
					  if (pass.matches(".*[A-Z].*")) {
					  }
					  
					  else {
						  System.out.println("Add capital letters.");
					  }
					  
							
					  if (pass.matches(".*[a-z].*")) {
					  }
					
					  else {
						  System.out.println("Add minuscule letters.");
					  }
					  
					  
					  if (pass.matches(".*[0-9].*")) {
					  }
				
					  else {
						  System.out.println("Add numbers.");
					  }
					  
					  
					  if (pass.matches(".*[\\~\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\_\\=\\+\\|\\[\\{\\]\\}\\;\\:\\'\\,\\<\\.\\>\\/\\?].*")){
					  }
					  
					  else {
						  System.out.println("Add symbols.");
					  }
					  
				  }
		}
	}
}
