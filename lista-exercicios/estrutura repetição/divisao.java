import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i=0; i<n ;i++) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			if (b!=0) {
				float divisao = 0f;
				divisao = a/b;
				System.out.printf("%.2f", divisao);
			}else System.out.println("divisao impossivel");

			
			
		}
		sc.close();

	}

}
