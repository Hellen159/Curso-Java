package principal;
import java.util.Scanner;

import entite.Account;


public class program {

	public static void main(String[] args) {
		// instancia a classe
		Account account;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number:");
		int numConta = sc.nextInt();
		System.out.println("Enter account holder:");
		sc.nextLine();
		String nome = sc.next();
		System.out.println("Is there na initial deposit (y/n)?");
		char enter = sc.next().charAt(0);
			if (enter == 'y') {
				System.out.println("Enter initial deposit value:");
				double deposito = sc.nextDouble();
				// construtor com tres
				account = new Account (nome, numConta, deposito);
			}else {
				// construtor com dois
				account= new Account(nome, numConta);
			}
		System.out.println();
		System.out.println(account);
		System.out.println("Enter a deposit value:");
		double mais = sc.nextDouble();
		// deposita
		account.iDeposito(mais);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.print("Enter a withdraw value: ");
		double menos = sc.nextDouble();
		//saca
		account.saque(menos);
		System.out.println("Updated account data:");
		System.out.println(account);
		sc.close();
	}

}
