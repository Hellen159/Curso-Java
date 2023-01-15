import java.util.Scanner;

public class diferencaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, diferenca;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite quatro valores inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		diferenca = ((a*b)-(c*d));
		System.out.printf("resultado é : %d ", diferenca);
	}

}
