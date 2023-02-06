package principal;

import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		sc.nextLine();
		String [] nome = new String [n];
		int [] idade = new int [n];
		double[] altura = new double[n];
		double soma=0;
		double numero =0;

		
		for (int i =0; i<n; i ++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.println("nome:");
			nome[i]=sc.next();
			System.out.println("idade:");
			idade[i]= sc.nextInt();
			System.out.println("altura:");
			altura[i]= sc.nextDouble();
			soma += altura[i];
		}
		System.out.printf("altura media: %.2f%n", soma/n);
		System.out.printf("pessoa com menos de 16 anos: %n");
		for(int i=0; i<n; i++) {
			if (idade[i]<16) {
				System.out.println(nome[i]);
				numero += 1;
			}
			System.out.printf("porcentagem %.2f", numero/n*100);

		}
		sc.close();

	}

}
