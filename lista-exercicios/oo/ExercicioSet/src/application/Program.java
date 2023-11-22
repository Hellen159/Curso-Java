package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Alunos> set = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int a = sc.nextInt();
		for (int i = 0 ; i< a; i ++) {
			int number = sc.nextInt();
			set.add(new Alunos(number));
		}
		
		
		System.out.println("How many students for course B?");
		int b = sc.nextInt();
		for (int i = 0 ; i< b; i ++) {
			int number = sc.nextInt();
			set.add(new Alunos(number));
		}
		
		
		System.out.println("How many students for course C?");
		int c = sc.nextInt();
		for (int i = 0 ; i< c; i ++) {
			int number = sc.nextInt();
			set.add(new Alunos(number));
		}
		System.out.println(set.size());
			
		sc.close();
	}

}
