import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entited.Empregados;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empregados> list = new ArrayList<>();
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos empregados serao registrados?");
		int n = sc.nextInt();
		
		for(int i =1;i<=n; i++) {
			System.out.println();
			System.out.println("#Empregado "+i);
			System.out.println("id:");
			int numId= sc.nextInt();
			while(existe(list, numId)) {
				System.out.println("já existe!digite novamente:");
				 numId= sc.nextInt();

			}
			System.out.println("nome:");
			sc.nextLine();
			name =sc.nextLine();
			System.out.println("salario:");
			double sal= sc.nextDouble();
			list.add(new Empregados(name,numId , sal));
		}
		System.out.println();
		System.out.println("digite o id do empregado que deseja:");
		int numId=sc.nextInt();
		Empregados emp = list.stream().filter(x -> x.getId() == numId).findFirst().orElse(null);
		if(emp == null) System.out.println("não existe!");
		else {		System.out.println("quantos porcento deseja aumentar:");
		int porcentagem =sc.nextInt();
		emp.setSalario(porcentagem);
}
		System.out.println("Lista de empregados:");
		for (Empregados obj : list) {
			System.out.println(obj);
		}		
		sc.close();

	}
	public static boolean existe(List <Empregados>list, int numId) {
		Empregados emp = list.stream().filter(x -> x.getId() == numId).findFirst().orElse(null);
		return emp !=null;
		
	} 

}
