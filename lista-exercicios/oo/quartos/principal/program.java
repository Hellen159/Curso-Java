package principal;

import java.text.ParseException;
import java.util.Scanner;

import entite.rooms;

public class program {

	public static void main(String[] args)throws ParseException {
		// TODO Auto-generated method stub
		rooms[] vetor = new rooms[10];
		Scanner sc = new Scanner(System.in);
		String nome;
		String email;
		System.out.println("quantos quartos serão alugados?");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.printf("#quarto %d %n", i);
			System.out.println("nome:");
			nome = sc.next();
			System.out.println("email:");
			email = sc.next();
			System.out.println("quarto:");
			int quarto = sc.nextInt();
			vetor[quarto] = new rooms(nome, email);

		}
		for(int i =0; i<10;i++) {
			if(vetor[i]!=null) {
				System.out.printf("%d: %s",i, vetor[i]);
				System.out.println();
			}
			
		}

		sc.close();

	}

}
