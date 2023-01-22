package principal;

import java.util.Scanner;

import entidades.Triangulo;

public class program {

	public static void main(String[] args) {
		Triangulo x, y;
		x = new Triangulo ();
		y = new Triangulo();
		Scanner sc = new Scanner (System.in);
		System.out.println("entre com tres valores de x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("entre com tres valores de y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areax = x.area();
		double areay = y.area();

		System.out.printf("%.4f%n " , areax);
		System.out.printf("%.4f%n " , areay);
		if (areax>areay) System.out.println("maior é x");
		else System.out.println("maior é y");

		sc.close();

	}
}