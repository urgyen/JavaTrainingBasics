package starters.one;

import java.util.Scanner;

public class Four_Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minValue, firstNum, secondNum;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Do Input First Number : ");
		firstNum = scanner.nextInt();
		System.out.print("Do Input Second Number : ");
		secondNum = scanner.nextInt();
		
		//ternary operator
		//result= condition ? if true return this : otherwise return this 
	    minValue = firstNum < secondNum ? firstNum : secondNum;
	    
	    System.out.println("miniMum VAlue = " + minValue);
		
	    
	    
	    
	}

}
