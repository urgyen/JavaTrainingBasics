package starters.one;

import java.util.Scanner;

public class One_Temperature_OO {
	
	double Celcius;
	double Fahrenheit;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One_Temperature_OO converter= new One_Temperature_OO();
		
		converter.ScanData();	
		converter.convertToFahrenheit();
		
	}
	
	void convertToFahrenheit() {
		
		Fahrenheit=Celcius+32;
		System.out.println(" equals to " +Fahrenheit + " Degree Fahnrenheit");

	}
	
	void ScanData() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, Do Input Data in Celcius: ");
		Celcius = scanner.nextDouble();
		System.out.print( Celcius + " Degree Celcius");
		
	}
	
}
