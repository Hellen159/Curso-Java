import java.util.Scanner;

public class inOrOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x =0, in=0, out =0;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			if (x>=10 && x<=20) {
				in ++;
			}else out ++;

		}
		System.out.printf("in: %d %n", in);
		System.out.printf("out: %d", out);

		sc.close();

	}

}
