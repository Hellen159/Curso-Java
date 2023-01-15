import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		int number;
		double number2;
		String name;
		char letra;
		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor inteiro:");
		number = sc.nextInt(); // leitura de inteiro
		System.out.printf("o valor que vc digitou foi: %d %n", number);
		System.out.println("Insira um nome:");
		name = sc.next(); // leitura de string sem espaço
		System.out.printf("o nome que vc digitou foi: %s %n", name);
		System.out.println("Insira um numero com virgula:");
		number2 = sc.nextDouble(); // leitura de double
		System.out.printf("o nome que vc digitou foi: %.2f %n", number2);
		System.out.println("Insira um caracter:");
		letra = sc.next().charAt(0); // leitura de um caractere
		System.out.printf("a letra que vc digitou foi: %s %n", letra);
		System.out.println("Insira uma frase:");
		frase = sc.nextLine(); // leitura de uma frase com espaço
		System.out.printf("a frase que vc digitou foi: %s %n", frase);
		sc.close();

	}

}
