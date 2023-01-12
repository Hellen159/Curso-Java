import java.util.Locale;

public class saidaDeDados {

	public static void main(String[] args) {
		double x = 12.965123;
		String nome = "Maria";
		int idade = 32;
		char sexo = 'f';
		
		System.out.print("Boa Tarde!"); //sem quebra de linha
		System.out.println("Bom Dia!"); //com quebra de linha
		System.out.printf("%.4f%n", x); //usado para definir numero de casas e arredondar
		System.out.println("Resultado= " + x + " metros"); // juntar dois valores 
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x); //troca a virgula por ponto
		System.out.printf("Oi meu nome é %s, tenho %s anos meu sexo é %s e ganho %.2f%n reais", nome, idade, sexo, x);

	}

}
