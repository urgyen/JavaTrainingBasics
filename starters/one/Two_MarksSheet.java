package starters.one;

import java.util.Scanner;

public class Two_MarksSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double s1,s2,s3,s4,s5;
		double total,average;
		double percentage;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Full Marks : 100 ");
		System.out.print("Please, Do Input Marks of First Subject: ");
		s1 = scanner.nextDouble();
		System.out.print("Please, Do Input Marks of Second Subject: ");
		s2 = scanner.nextDouble();
		System.out.print("Please, Do Input Marks of Third Subject: ");
		s3 = scanner.nextDouble();
		System.out.print("Please, Do Input Marks of Fourth Subject: ");
		s4 = scanner.nextDouble();
		System.out.print("Please, Do Input Marks of Fifth Subject: ");
		s5 = scanner.nextDouble();
		
		
		total=s1+s2+s3+s4+s5;
		//Average and PErcentage is Same 
		//average= total/5;
		percentage=(total/500)*100;
		
		System.out.println("======================================");
		System.out.println("Total Marks Obtained " + total + " out of 500");
		System.out.println("Percentage Obtained " + percentage + "%");
	}

}
