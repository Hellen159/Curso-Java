import java.util.Scanner;

public class nLinhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for (int i =1 ; i<= n; i++) {
			System.out.print(Math.pow(i, 1));
			System.out.print(Math.pow(i, 2));
			System.out.println(Math.pow(i, 3));

		}
		sc.close();

	}

}
