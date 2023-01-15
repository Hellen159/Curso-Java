import java.util.Scanner;

public class areaCirculo {
 public static void main(String[] args) {
	 double raio, areaCirculo;
	 double pi = 3.14159;
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("digite o valor do raio :");
	raio = sc.nextFloat();
	areaCirculo = pi*Math.pow(raio, 2);
	System.out.printf("area do circulo é: %.4f ", areaCirculo);
	sc.close();
}
}
