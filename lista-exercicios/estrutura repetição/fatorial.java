import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fatorial = 0;
		if (n != 0) {
			for (int i = 1; i <= n; i++) {

				fatorial = fatorial + n * (n - i);
			}
			System.out.println(fatorial);
		} else
			System.out.println("1");
		sc.close();

	}

}
