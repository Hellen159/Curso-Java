import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite dois valores a e b .");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("a soma dos valores é : %d " ,a+b );
		sc.close();
	}
}
