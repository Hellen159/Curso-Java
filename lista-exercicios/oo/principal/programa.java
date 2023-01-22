package principal;

import java.util.Scanner;

import entidades.triangulo;

public class programa {

	public static void main(String[] args) {
		triangulo x, y;
		x = new triangulo ();
		y = new triangulo();
		Scanner sc = new Scanner (System.in);
		System.out.println("entre com tres valores de x:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("entre com tres valores de y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double xp = p (x.a, x.b, x.c);
		double yp = p(y.a, y.b, y.c);
		double areax = area (xp, x.a, x.b, x.c);
		double areay = area (yp, y.a, y.b, y.c);
		System.out.println("%.4f " + areax);
		System.out.println("%.4f " + areay);
		if (areax>areay) System.out.println("maior é x");
		else System.out.println("maior é y");

		sc.close();

	}
	public static double p (double x, double y, double z) {
		double aux;
		aux = (x + y + z)/2.0;
		return aux;
	}
	public static double area (double p,double x, double y, double z) {
		double aux;
		aux = Math.sqrt(p*(p-x)*(p-y)*(p-z));
		return aux;
	}
}
