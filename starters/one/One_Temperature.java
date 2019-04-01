package starters.one;

import java.util.Scanner;

public class One_Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Celcius;
		double Fahrenheit;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, Do Input Data in Celcius: ");
		Celcius = scanner.nextDouble();
		System.out.print( Celcius + " Degree Celcius");
		
		Fahrenheit=Celcius+32;
		System.out.println(" equals to " +Fahrenheit + " Degree Fahnrenheit");
		
	}

}
