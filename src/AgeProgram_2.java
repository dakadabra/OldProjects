import java.util.Scanner;

public class AgeProgram_2 {
	
	public static void main (String[] args) {
Scanner console = new Scanner (System.in);


System.out.println("How old are you?");
int age1 = 0;
while (2000 != age1) {	



// How to put empty line second time around
// int Done = console.nextInt ();
age1 = console.nextInt ();

// How to put if symbol other that number is typed
//IsInt??????

if (age1 < 0) {
System.out.println("You are an anomaly. Come back in " + (0-age1) + " years!");
}
else if (age1 >= 4 && age1 < 100) {
System.out.println("You will be 100 in " + (100-age1) + " years.");
}
else if (age1 == 100) {
System.out.println("You are 100. Happy centennial!");
}
else if ((age1 > 100) && (age1 <= 43110)){
System.out.println("You were 100, " + (age1-100) + " years ago.");
}
else if (age1 == 43110) {
System.out.println("Hello to you too.");
}
else if (age1 >= 6500000) {
System.out.println("P.S. Can you tell me about the dinosaurs?");
}
else {
System.out.println("You are one smart kid! You will be 100 in " + (100-age1) + " years.");
}
System.out.println("Are you done? If you are, type 2000. If not, type your age.");

// Not working

}


	
	System.out.println("\n Bye now! Come again!");
/*
if (age1 == 0)
Restart

if (age1 == 1)
System.out.println("Bye!");

if (age1 != 1 || age1 != 0)
System.out.println("Please write 1 or 0.");*/

	}
}