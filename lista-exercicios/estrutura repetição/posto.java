import java.util.Scanner;

import javax.swing.JOptionPane;

public class posto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alcool=0, gasolina=0, disel=0, op=0;
		while (op!=4) {
			if(op==1) {
				alcool+=1;
			}
			else if(op==2) {
				gasolina += 1;
			}
			else if(op==3) {
				disel += 1;
			}
			op=sc.nextInt();
		}
		System.out.printf("Muito obrigado %n"+"alcool:%d%n"+"gasolia:%d %n"+"disel: %d %n", alcool, gasolina, disel);
		sc.close();
	}

}
