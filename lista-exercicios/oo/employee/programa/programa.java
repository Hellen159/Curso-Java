package programa;

import java.util.Scanner;

import entidade.Employee;

public class programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double porcent;
		Employee um = new Employee();
		System.out.println("entre com nome , salario e taxa : ");
		um.name = sc.next();
		um.salary = sc.nextDouble();
		um.tax = sc.nextDouble();
		System.out.println("Employee:%n" + um);
		System.out.println("quanto de porcentagem voce quer aumentar ao salario?");
		porcent = sc.nextDouble();
		um.IncreaseSalary(porcent);
		System.out.println("Employee:"+ um);
		System.out.println();
		sc.close();
	}

}
