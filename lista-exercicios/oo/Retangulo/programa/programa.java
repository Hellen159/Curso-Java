package programa;

import java.util.Scanner;

import entidade.Retangulo;

public class programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Retangulo re = new Retangulo();
		System.out.println("entre com a aultura e a largura do retangulo:");
		re.altura = sc.nextDouble();
		re.largura = sc.nextDouble();
		System.out.printf("area: %.2f%n", re.area());
		System.out.printf("perimetro: %.2f%n", re.perimetro());
		System.out.printf("diagonal: %.2f%n", re.diagonal());

		sc.close();

	}
}
