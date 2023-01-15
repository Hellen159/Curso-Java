import java.util.Scanner;

public class horasTrabalhadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, time ;
		double price, salary;
		System.out.println("digite o numero do funcionario: ");
		Scanner sc = new Scanner (System.in);
		number = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		time = sc.nextInt();
		System.out.println("quanto ganha por hora: ");
		price = sc.nextDouble();
		salary = time*price;
		System.out.printf("number: %d %n", number);
		System.out.printf("salary: %.2f", salary);
		sc.close();

	}

}
