import java.util.Scanner;

public class hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora1, hora2, tempo;
		Scanner sc = new Scanner(System.in);
		hora1 = sc.nextInt();
		hora2 = sc.nextInt();
		tempo = 24 - Math.abs(hora1-hora2);
		System.out.printf("o jogo durou %d horas ", tempo);
		sc.close();

	}

}
