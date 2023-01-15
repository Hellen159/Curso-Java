import java.util.Scanner;

public class pecas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo, numero, codigo1, numero1;
		double valor, valor1, pagar;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o codigo 1: ");
		codigo = sc.nextInt();
		System.out.println("digite o numero 1 :");
		numero = sc.nextInt();
		System.out.println("digite o valor 1: ");
		valor = sc.nextDouble();
		System.out.println("digite o codigo 2: ");
		codigo1 = sc.nextInt();
		System.out.println("digite o numero 2 :");
		numero1 = sc.nextInt();
		System.out.println("digite o valor 2: ");
		valor1 = sc.nextDouble();
		sc.close();
		pagar = (numero*valor)+(numero1*valor1);
		System.out.printf("VALOR A PAGAR = %.2f", pagar);
	}

}
