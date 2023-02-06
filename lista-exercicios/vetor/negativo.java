package principal;

import java.util.Scanner;

public class negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		sc.nextLine();
		int[] vetor = new int [n];
		for (int i = 0; i<n; i++) {
			System.out.println("Digite um numero:");
			vetor[i]= sc.nextInt();
		}
		System.out.println("NUMERO NEGATIVOS:");
		for (int i=0; i<n; i++) {
			if (vetor[i]<0) System.out.println(vetor[i]);
		}
		
		sc.close();

	}

}
