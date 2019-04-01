package starters.one;

import java.util.Scanner;

public class Two_MarksSheet_OO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numOfSubjects = 5;
		
		//Double Array for Stroing Marks
		double marks[] = new double[numOfSubjects];
		
		double total=0;
		double average;
		
		Scanner scanner = new Scanner(System.in);

		//for loop for taking marks for Number of Subjects.
		for (int i = 0; i < numOfSubjects; i++) {
			System.out.print("Enter Marks of Subject " + (i + 1) + " : ");
			
			marks[i]= scanner.nextDouble();
			total = total + marks[i];
			
		}
		
		 average = total/5;
		 System.out.println("=========================================");
	     System.out.println("The student's Total Marks is : " +total);
	     System.out.print("The student's Percentage is : " +average+ "%");

	}		
}
