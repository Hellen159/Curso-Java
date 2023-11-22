package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantia:");
		double amount = sc.nextDouble();
		System.out.println("Meses:");
		int months = sc.nextInt();
		System.out.println("Pagamento apos "+months+" meses:");
		InterestService is = new BrazilInterestService(2.0);
		System.out.println(String.format("%.2f",is.payment(amount, months)));
		sc.close();
	}
}
