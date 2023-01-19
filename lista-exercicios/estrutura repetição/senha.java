import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		while (senha != 2002) {
			senha = sc.nextInt();
			if (senha != 2002) {
				System.out.println("senha invalida");
			}
		}
		System.out.println("acesso permitido");

		sc.close();
	}

}
