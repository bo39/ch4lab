// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
	public static void main(String[] args)
	{
		System.out.println("Lab04a, Student Version\n");

		double principal  = 250000;
		double annualRate = 4.85;
		double numYears   = 30;
		double annual;
		double month;
		double monthly;
		double payment;
		double wow;
		double percent;
		double m;
		double monthlyPayment;
		
		percent = annualRate / 100;
		m = percent / 12;
		month = numYears * 12;
		
		// Monthly Payment
		annual = 1 + m;
		monthly = Math.pow(annual ,month) * m;
		payment = Math.pow(annual , month) - 1;
		wow = monthly / payment;
		monthlyPayment = wow * principal;
	//	System.out.println("Principal : " + "$" + principal );
		//System.out.println("Annual Rate : " + annualRate + "%" );
		//System.out.println("Number of Years : " + numYears);
		System.out.println("Monthly Payment : " + "$" +monthlyPayment);
	    System.out.println(wow);
		





		System.out.println();
	}
}

