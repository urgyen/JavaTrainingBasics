package starters.one;

import java.util.Scanner;

public class Three_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double P, T, R, SimpleInterest;
		
		//principle gets increases 4 in a year. ie per 4 months
		//double n= 4;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Simple Interest Calculator");
		System.out.print("Please, Enter Principal : ");
		P = scanner.nextDouble();
		System.out.print("Enter Time in Years [ie. 3 months= 3/12] : ");
		T = scanner.nextDouble();
		System.out.print("Enter Rate of Interest : ");
		R = scanner.nextDouble();

		
		SimpleInterest = (P*T*R)/100;
		System.out.println("Simple Interest : "+ SimpleInterest);
		
//		for Compound Interest   
//      double CompoundInterest = P * (Math.pow((1 + (R / 100)),  T));
//      System.out.println("Compound Interest is " + CompoundInterest);
       

        

	
	}

}
