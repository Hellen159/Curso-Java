package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Entre os dados do contrato:");
		System.out.println("Numero:");
		int number = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy):");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.println("Valor do contrato:");
		double amount = sc.nextDouble();
		
		Contract obj = new Contract(number, date, amount);

		System.out.println("Entre com o numero de parcelas:");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas:");
		for (Installment i : obj.getInstallments()) {
			System.out.println(i);
		}

		sc.close();
	}

}
