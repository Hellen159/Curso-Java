package programa;

import java.util.Scanner;

import entidade.Student;

public class Principal {
	public static void main(String[] args) {
		Student stu = new Student();
		Scanner sc = new Scanner (System.in);
		System.out.println("entre com nome, nota1, nota2, nota3: ");
		stu.name = sc.next();
		stu.nota1= sc.nextDouble();
		stu.nota2= sc.nextDouble();
		stu.nota3= sc.nextDouble();
		System.out.println(stu);
			if (stu.grade()<60.00) {
				System.out.println("Failed");
				System.out.printf("Missing: %.2f", stu.missing());
			} else System.out.println("Passed");
		sc.close();
	}
}
