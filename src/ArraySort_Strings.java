import java.util.Scanner;

	public class ArraySort_Strings {

		public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
			
		String[ ] myarray = new String[10];
		myarray [0] = "a";
		myarray [1] = "a";
		myarray [2] = "a";
		myarray [3] = "a";
		myarray [4] = "a";
		myarray [5] = "a";
		myarray [6] = "a";
		myarray [7] = "a";
		myarray [8] = "a";
		myarray [9] = "a";
		
		System.out.println("Please enter the first word.");
		myarray[0] = console.next();
		System.out.println("Please enter the second word.");
		myarray[1] = console.next();
		System.out.println("Please enter the third word.");
		myarray[2] = console.next();
		System.out.println("Please enter the fourth word.");
		myarray[3] = console.next();
		System.out.println("Please enter the fifth word.");
		myarray[4] = console.next();
		System.out.println("Please enter the sixth word.");
		myarray[5] = console.next();
		System.out.println("Please enter the seventh word.");
		myarray[6] = console.next();
		System.out.println("Please enter the eight word.");
		myarray[7] = console.next();
		System.out.println("Please enter the ninth word.");
		myarray[8] = console.next();
		System.out.println("Please enter the tenth word.");
		myarray[9] = console.next();
		
		
		System.out.println("The unsorted words of my array are "
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
		
		int swaptimes = 0;
		
		String asdf = "a";
		String ghjk = "b";

		System.out.println(asdf+ghjk);
		
		for (int d = 0; d < myarray.length; d++) {
		int i = 0;
			for (i = 0; i < myarray.length - 1; i++) {
				
					if (myarray[i].charAt(0) > myarray[i+1].charAt(0)) {
						swap(asdf, ghjk);
						swaptimes++;
					}/* else if (myarray[i].charAt(0) == myarray[i+1].charAt(0)) {
						
						if (myarray[i].charAt(1) > myarray[i+1].charAt(1)) {
							swap(myarray[i], myarray[i+1]);
							swaptimes++;
						} else if (myarray[i].charAt(1) == myarray[i+1].charAt(1)) {
							
							if (myarray[i].charAt(2) > myarray[i+1].charAt(2)) {
								swap(myarray[i], myarray[i+1]);
								swaptimes++;
							} else if (myarray[i].charAt(2) == myarray[i+1].charAt(2)) {
								
								if (myarray[i].charAt(3) > myarray[i+1].charAt(3)) {
									swap(myarray[i], myarray[i+1]);
									swaptimes++;
								} else if (myarray[i].charAt(3) == myarray[i+1].charAt(3)) {
									
									if (myarray[i].charAt(4) > myarray[i+1].charAt(4)) {
										swap(myarray[i], myarray[i+1]);
										swaptimes++;
									} 
								}
							}
						}
					}*/
				}
		}
		
		System.out.println(asdf+ghjk);
		
		System.out.println("\nThe sorted words of my array are "
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
		
		public static void swap(String a, String b){
			String temp = "a";
			
			temp = a;
			a = b;
			b = temp;
		}

	}