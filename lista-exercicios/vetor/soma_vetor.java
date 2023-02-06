package principal;

import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double soma=0;
		sc.nextLine();
		double [] vetor = new double[n];
		for (int i =0; i< vetor.length; i++) {
			System.out.println( "Digite um numero:");
			vetor[i]= sc.nextDouble();
			soma += vetor[i];
		}
		System.out.println("VALORES:");
		for (int i =0; i<n;i++) {
			System.out.printf("%.2f ", vetor[i]);
		}
		System.out.printf("%nSOMA:%.2f %n", soma);
		System.out.printf("MEDIA:%.2f %n", soma/n);

		sc.close();

	}

}
