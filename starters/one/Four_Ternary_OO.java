package starters.one;

import java.util.Scanner;

public class Four_Ternary_OO {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int ask1;
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("How many numbers do you want to Comapre : ? ");
		number = scanner.nextInt();
		
		int Minimum=10000;
		
		Four_Ternary_OO f1= new Four_Ternary_OO();
		for(int i=0; i<number;i++) {
			

			System.out.print("Input the Number "+ i + " : ");
			ask1=scanner.nextInt();
			

			Minimum= f1.compareNum(ask1, Minimum);
			System.out.println("Smallest Number is : "+ Minimum);

		}
		
	}

	int compareNum(int x, int y) {
		int minValue = x < y ? x : y;
		
		return minValue;
	}
	
}
