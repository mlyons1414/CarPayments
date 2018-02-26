package car;

import java.util.Scanner;

public class CarPaymentCalculator {
	
	public static double CalculateMonthlyPayment (int CarPrice, int DownPayment, int LengthofLoan, 
			double InterestRate) {
		
		int SizeofLoan = CarPrice - DownPayment;
		
		InterestRate /= 100;
		
		double MonthlyRate = (InterestRate / 12);
		
		double MonthlyPayment = (SizeofLoan*MonthlyRate) / 
	            (1-Math.pow(1+MonthlyRate, -LengthofLoan));
		
		return MonthlyPayment;
		
	}
	
	public static double CalculateInterestOverTerm (int CarPrice, int DownPayment, int LengthofLoan,
			double InterestRate) {
		
		int SizeofLoan = CarPrice - DownPayment;
		
		InterestRate /= 100;
		
		double MonthlyRate = (InterestRate / LengthofLoan);
		
		double TotalInterest = SizeofLoan * MonthlyRate * LengthofLoan;
		
		return TotalInterest;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	      System.out.print("Enter car price: ");
	      int CarPrice = input.nextInt();
	      
	      System.out.print("Enter down payment: ");
	      int DownPayment = input.nextInt();
	       
	      System.out.print("Enter length of loan (in months): ");
	      int LengthofLoan = input.nextInt();
	       
	      System.out.print("Enter interest rate: ");
	      double InterestRate = input.nextDouble();
	      
	      double MonthlyPayment = CalculateMonthlyPayment(CarPrice, DownPayment, LengthofLoan, InterestRate);
	      
	      double TotalInterest = CalculateInterestOverTerm(CarPrice, DownPayment, LengthofLoan, InterestRate);
	      
	      System.out.println("Monthly car payment: " + MonthlyPayment);
	      System.out.println("Total interest paid: " + TotalInterest);
	      
}
}
