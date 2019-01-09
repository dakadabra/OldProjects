import java.util.Scanner;

	public class ArraySort_Numbers {

		public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
			
		boolean swap = false;
			
		int[ ] myarray = new int[10];
		myarray [0] = 0;
		myarray [1] = 0;
		myarray [2] = 0;
		myarray [3] = 0;
		myarray [4] = 0;
		myarray [5] = 0;
		myarray [6] = 0;
		myarray [7] = 0;
		myarray [8] = 0;
		myarray [9] = 0;
		
		System.out.println("Please enter the first number.");
		myarray[0] = console.nextInt();
		System.out.println("Please enter the second number.");
		myarray[1] = console.nextInt();
		System.out.println("Please enter the third number.");
		myarray[2] = console.nextInt();
		System.out.println("Please enter the fourth number.");
		myarray[3] = console.nextInt();
		System.out.println("Please enter the fifth number.");
		myarray[4] = console.nextInt();
		System.out.println("Please enter the sixth number.");
		myarray[5] = console.nextInt();
		System.out.println("Please enter the seventh number.");
		myarray[6] = console.nextInt();
		System.out.println("Please enter the eight number.");
		myarray[7] = console.nextInt();
		System.out.println("Please enter the ninth number.");
		myarray[8] = console.nextInt();
		System.out.println("Please enter the tenth number.");
		myarray[9] = console.nextInt();
		
		
		System.out.println("The unsorted numbers of my array are "
				+ myarray [0] + ", "
				+ myarray [1] + ", "
				+ myarray [2] + ", "
				+ myarray [3] + ", "
				+ myarray [4] + ", "
				+ myarray [5] + ", "
				+ myarray [6] + ", "
				+ myarray [7] + ", "
				+ myarray [8] + " and "
				+ myarray [9]+ ".");
		
		int temp = 0;
		int swaptimes = 0;

		for (int a = 0; a < myarray.length; a++) {
		int i = 0;
			for (i = 0; i < myarray.length - 1; i++) {
				
					swap = false;
					if (myarray[i] > myarray[i+1]) {
						temp = myarray[i];
						myarray[i] = myarray[i+1];
						myarray[i+1] = temp;
						swaptimes++;
						swap = true;
					}
				}
		}
		
		
		System.out.println("\nThe sorted numbers of my array are "
		+ myarray [0] + ", "
		+ myarray [1] + ", "
		+ myarray [2] + ", "
		+ myarray [3] + ", "
		+ myarray [4] + ", "
		+ myarray [5] + ", "
		+ myarray [6] + ", "
		+ myarray [7] + ", "
		+ myarray [8] + " and "
		+ myarray [9]+ "."
		+ "\n\nThe number of swaps is " + swaptimes);
		
		}

	}