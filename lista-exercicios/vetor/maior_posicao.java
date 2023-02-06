package principal;

import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		double maior = 0;
		int posicao = 0;
		double [] numero = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um numero:");
			numero[i] =sc.nextDouble();
			if (maior<numero[i]) {
				maior = numero[i];
				posicao = i;
			}
		}
		System.out.printf("MAIOR:%.2f %n", maior);
		System.out.printf("POSICAO: %d", posicao);

		sc.close();

	}

}
