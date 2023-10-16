package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.Fisic;
import application.Juridic;
import application.Person;

public class Program {

	public static void main(String[] args) {
		
		List <Person> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tax payers:");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Tax payer #"+i+1+" data:\n");
			System.out.println("Individual or company (i/c)? \n");
			char option =sc.next().charAt(0);
			System.out.println("Name: \n");
			sc.nextLine();
			String name =sc.nextLine();
			System.out.println("Anual income:");
			double rendaAnual = sc.nextDouble();
			if(option == 'i') {
				System.out.println("Health expenditures:");
				double gastosComSaude = sc.nextDouble();
				list.add(new Fisic(name, rendaAnual, gastosComSaude));
			}else {
				System.out.println("Number of employees:");
				int numeroFuncionarios = sc.nextInt();
				list.add(new Juridic(name, rendaAnual, numeroFuncionarios));
			}
		}
		for(Person p: list) {
			System.out.println(p);
		}
		sc.close();
	}

}
