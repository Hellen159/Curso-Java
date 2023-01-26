package programa;

import java.util.Scanner;

import entidade.CurrencyConverter;

public class dolar {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("digite o preço do dolar:");
		double price = sc.nextDouble();
		System.out.println("quantos dolares voce quer comprar?");
		int quant = sc.nextInt();
		double value = CurrencyConverter.calcular(price, quant);
		System.out.printf("voce devera pagar : %.2f", value);
		sc.close();
	}

}
