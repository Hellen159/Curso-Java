import java.util.Scanner;

public class negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numero, resultado;
		System.out.println("digite o numero:");
		numero =  sc.nextInt();
		resultado = numero % 2;
		if (resultado==0)
			System.out.println("o numero é par");
		else System.out.println("numero é impar");
		sc.close();

	}

}
