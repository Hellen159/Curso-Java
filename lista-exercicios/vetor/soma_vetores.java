package principal;

import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		int [] a = new int [n];
		int [] b = new int [n];
		System.out.println("digite os valores do vetor a:");
		for (int i =0; i<n; i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("digite os valores do vetor b:");
		for (int i =0; i<n; i++) {
			b[i]= sc.nextInt();
		}
		System.out.println("valor resultante:");
		for (int i =0; i<n; i++) {
			int soma = a[i]+b[i];
			System.out.println(soma);
		}
		sc.close();

	}

}
