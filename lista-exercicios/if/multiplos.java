import java.util.Scanner;

public class multiplos {
	public static void main(String[] args) {
		int a, b, resultado;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b) {
			resultado = a % b;
			if (resultado == 0)
				System.out.println("são multiplos");
			else
				System.out.println("não são multiplos");
		} else
			resultado = b % a;
			if (resultado == 0)
				System.out.println("são multiplos");
			else
				System.out.println("não são multiplos");

		sc.close();
	}
}
