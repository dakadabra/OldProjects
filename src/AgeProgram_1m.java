import java.util.*;

public class AgeProgram_1m {
	
	public static void main (String[] args) {
Scanner console = new Scanner (System.in);
System.out.println("How many years old are you?");
int age1 = console.nextInt ();

System.out.println("You are " + age1 + " years plus how many months?");
int age2 = console.nextInt ();

System.out.println("You are " + age1 + " years plus " + age2 + " months plus how many days?");
int age3 = console.nextInt ();


System.out.println ("You'll be 100 in " + (101-age1) + " years, " + (12-age2) + " months and " + (31-age3) + " days.");
	}
}