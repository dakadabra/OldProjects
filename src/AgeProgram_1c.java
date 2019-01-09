import java.util.Scanner;

public class AgeProgram_1c {
	
	public static void main (String[] args) {
Scanner console = new Scanner (System.in);

System.out.println("How old are you?");
int age1 = console.nextInt ();



if (age1 < 0)
System.out.println("You are an anomaly. Come back in " + (age1+1) + " years!");

if (age1 >= 4 && age1 < 100)
System.out.println("You will be 100 in " + (100-age1) + " years.");

if (age1 >= 0 && age1 <= 3)
System.out.println("You are one smart kid! You will be 100 in " + (100-age1) + " years.");

if (age1 == 100)
System.out.println("You are 100. Happy centennial!");

if (age1 >= 101)
System.out.println("You have been 100 for " + (age1-100) + " years.");
	

if (age1 >= 65000000)
System.out.println("P.S. Can you tell me about the dinosaurs?");

	}
}



























